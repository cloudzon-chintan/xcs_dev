package com.demo.dao.impl;

import java.net.URLEncoder;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.dao.UserMasterDao;
import com.demo.encrypt.Encrypt;
import com.demo.form.UserMaster;
import com.demo.util.ApplicationMailer;

@Repository("userMasterDao")
public class UserMasterDaoImpl implements UserMasterDao {

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	public ApplicationMailer applicationMailer;

	public void registerUser(UserMaster userMaster) {
		this.sessionFactory.getCurrentSession().save(userMaster);
	}

	@SuppressWarnings("unchecked")
	public List<UserMaster> getUsers(UserMaster userMaster) {
		Criteria criteria = this.sessionFactory.getCurrentSession()
				.createCriteria(UserMaster.class);
		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	public List<UserMaster> getUserList() {
		Criteria criteria = this.sessionFactory.getCurrentSession()
				.createCriteria(UserMaster.class);
		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	public UserMaster varifyLogin(UserMaster userMaster) {
		Criteria criteria = null;
		List<UserMaster> objListUser = null;
		UserMaster objUserMaster = null;
		try {
			criteria = this.sessionFactory.getCurrentSession().createCriteria(
					UserMaster.class);
			criteria.add(Restrictions.eq("userName", userMaster.getUserName()));
			criteria.add(Restrictions.eq("password",
					Encrypt.md5(userMaster.getPassword())));
			objListUser = criteria.list();
			if (null != objListUser && objListUser.size() > 0) {
				for (UserMaster userMasterList : objListUser) {
					objUserMaster = userMasterList;
				}
				return objUserMaster;
			} else {
				return null;
			}
		} finally {
			criteria = null;
			objListUser = null;
		}

	}

	public void varifyEmail(UserMaster userMaster) {
		String id = String.valueOf(userMaster.getUserId());
		String email = userMaster.getEmail();

		try {
			// Send a composed mail

			// applicationMailer.sendMail(user.getEmail(),"Confirm Your Email Address","http://localhost:8080/controller/emailConfirmation?operation=confirm&id="+URLEncoder.encode("21","UTF-8")+"&email="+URLEncoder.encode("pjayesh999@gmail.com","UTF-8"));
			applicationMailer.sendMail(userMaster.getEmail(),
					"Confirm Your Email Address",
					"http://localhost:8080/controller/emailConfirmation?operation=confirm&id="
							+ URLEncoder.encode(id, "UTF-8") + "&email="
							+ URLEncoder.encode(email, "UTF-8"));

			// Send a pre-configured mail
			// applicationMailer.sendPreConfiguredMail("Exception occurred everywhere.. where are you ????");
		} catch (Exception e) {
			System.out.println("Error in varify email method");
		}
	}

	public UserMaster getUser(int id) {
		UserMaster userMaster = (UserMaster) this.sessionFactory
				.getCurrentSession().get(UserMaster.class, id);
		return userMaster;
	}

	public void activeUser(UserMaster userMaster) {
		UserMaster objUserMaster = null;
		try {
			objUserMaster = getUser(userMaster.getUserId());
			objUserMaster.setPassword(Encrypt.md5(userMaster.getPassword()));
			objUserMaster.setActive((short) 1);

			this.sessionFactory.getCurrentSession().update(objUserMaster);
		} finally {
			objUserMaster = null;
		}
	}
}
