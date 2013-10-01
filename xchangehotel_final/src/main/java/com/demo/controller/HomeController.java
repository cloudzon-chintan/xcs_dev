package com.demo.controller;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.FacebookProfile;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.TwitterProfile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.configurar.SocialContext;
import com.demo.form.UserMaster;
import com.demo.service.UserMasterService;

/**
 * Handles requests for the application home page.
 */

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */

	List<UserMaster> listUser = new ArrayList<UserMaster>();

	@Resource(name = "userMasterService")
	private UserMasterService userMasterService;

	@Autowired
	private SocialContext socialContext;

	@Autowired
	private ConnectionRepository connectionRepository;

	/*
	 * @Autowired private Facebook facebook;
	 * 
	 * 
	 * @Autowired private Twitter twitter;
	 */

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showUserForm(Model model) {
		model.addAttribute("userMaster", new UserMaster());
		return "Login";
	}

	@RequestMapping(value = "/userLogin", method = RequestMethod.POST)
	public String userLogin(
			@ModelAttribute("userMaster") UserMaster userMaster, Model model) {
		UserMaster validUser = new UserMaster();
		String message = null;
		String errorMessage = null;
		validUser = userMasterService.varifyLogin(userMaster);

		if (validUser != null && validUser.getActive() == 1) {

			message = "Welcome " + validUser.getUserName();
			model.addAttribute("message", message);
			return "userLogin";
		} else {
			errorMessage = "Enter Valid Username and Password";
			model.addAttribute("errorMessage", errorMessage);
			return "Login";
		}

	}

	/*
	 * @RequestMapping(value = "/registration") public ModelAndView
	 * registrationPage(UserMaster userMaster, BindingResult result) {
	 * ModelAndView mav = new ModelAndView("registration"); return mav; }
	 */

	@RequestMapping(value = "registration", method = RequestMethod.GET)
	public String registerUserPre(ModelMap map) {
		UserMaster userMaster = null;
		String nextView = null;
		try {
			userMaster = new UserMaster();
			userMaster.setGender("M");
			map.put("userMaster", userMaster);
			nextView = "registration";
		} finally {
			userMaster = null;
		}
		return nextView;
	}

	@RequestMapping(value = "registration", method = RequestMethod.POST)
	public String registerUserPost(
			@ModelAttribute(value = "userMaster") @Valid UserMaster userMaster,
			BindingResult result, ModelMap map) {
		try {
			if (result.hasErrors()) {
				return "registration";
			}

			userMasterService.registerUser(userMaster);
			userMasterService.verifyEmail(userMaster);
		} catch (Exception e) {
			System.out.println("Error in Controller");
		}

		return "Login";
	}

	@RequestMapping(value = "/emailConfirmation")
	public ModelAndView userConfirmation(Model model, HttpServletRequest request) {

		UserMaster activeUser = new UserMaster();
		System.out.println("url=" + request.getRequestURL());
		System.out.println("Query String=" + request.getQueryString());

		ModelAndView mav_useConfirm = new ModelAndView("userConfirm");
		ModelAndView mav_Login = new ModelAndView("Login");
		ModelAndView mav_activeUser = new ModelAndView("activeUser");
		try {
			/*
			 * if(request.getParameter("id").isEmpty()) { return "Login"; } else
			 * {
			 */
			activeUser = userMasterService.getUser(Integer.parseInt(request
					.getParameter("id")));
			if (activeUser != null && activeUser.getActive() == 0) {

				System.out.println("id=" + activeUser.getUserId());
				mav_useConfirm.addObject("userMaster", activeUser);
				return mav_useConfirm;
			} else

			if (activeUser.getActive() == 1)
				return mav_activeUser;

			// }

			String urlE = request.getQueryString();
			String urlD = URLDecoder.decode(urlE, "UTF-8");
			System.out.println("decoded id in controller = " + urlD);

			System.out.println("operation value="
					+ request.getParameter("operation"));
			System.out.println("email=" + request.getParameter("email"));
			System.out.println("id=" + request.getParameter("id"));

		} catch (Exception e) {
			System.out.println("Error in decoder in controller");
		}
		return mav_Login;
	}

	@RequestMapping(value = "/activateUser", method = RequestMethod.POST)
	public String activateUser(
			@ModelAttribute("userMaster") UserMaster userMaster, Model model) {
		try {
			if (userMaster.getActive() == 0) {
				if (!userMaster.getPassword().equals(
						userMaster.getRetypePassword())) {
					model.addAttribute("errorMessage", "Not Match");
					return "userConfirm";

				} else {
					userMasterService.activeUser(userMaster);
					return "Login";
				}
			}

			System.out.println("id in active userMaster="
					+ userMaster.getUserId());
			System.out.println("id in active userMaster="
					+ userMaster.getActive());
			System.out.println("password=" + userMaster.getPassword());
			System.out.println("c password=" + userMaster.getRetypePassword());
		} catch (Exception e) {
			System.out.println("Error:");
		}
		return "activeUser";

	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addNewUser(@Valid UserMaster userMaster, BindingResult result) {
		try {
			if (result.hasErrors()) {
				return "registration";
			}

			userMasterService.registerUser(userMaster);
			userMasterService.verifyEmail(userMaster);
		} catch (Exception e) {
			System.out.println("Error in Controller");
		}

		return "Login";
	}

	/**
	 * Add by hitesh
	 */
	@RequestMapping(value = "posts", method = RequestMethod.GET)
	public String showPostsForUser() throws Exception {

		FacebookProfile facebookProfile = this.socialContext
				.getFacebookProfile(this.socialContext.getUserId());
		UserMaster userMaster = new UserMaster();
		if (facebookProfile != null) {
			userMaster.setUserName(facebookProfile.getUsername());
			userMaster.setFirstName(facebookProfile.getFirstName());
			userMaster.setMiddleName(facebookProfile.getMiddleName());
			userMaster.setLastName(facebookProfile.getLastName());
			userMaster.setGender(facebookProfile.getGender());
			userMaster.setEmail(facebookProfile.getEmail());
			//userMaster.setCity(facebookProfile.getHometown().getName());
			userMaster.setActive((short) 1);
			userMaster.setSNSFLAG((short) 1);

		}
		TwitterProfile twitterProfile = this.socialContext
				.getTwitterProfile(this.socialContext.getUserId());
		if (twitterProfile != null) {
			userMaster.setUserName(twitterProfile.getScreenName());
			userMaster.setFirstName(twitterProfile.getName());
			//userMaster.setMiddleName(twitterProfile.getMiddleName());
			//userMaster.setLastName(twitterProfile.getLastName());
			//userMaster.setGender(twitterProfile.get);
			//userMaster.setEmail(twitterProfile.get);
			//userMaster.setCity(twitterProfile.getHometown().getName());
			userMaster.setActive((short) 1);
			userMaster.setSNSFLAG((short) 1);

		}
		
		return "Welcome";

	}
}
