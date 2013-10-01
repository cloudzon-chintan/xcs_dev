package com.demo.configurar;

import java.util.Calendar;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.connect.ConnectionSignUp;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.connect.web.SignInAdapter;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.FacebookProfile;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.TwitterProfile;
import org.springframework.web.context.request.NativeWebRequest;

public class SocialContext implements ConnectionSignUp, SignInAdapter {

	/**
	 * Use a random number generator to generate IDs to avoid cookie clashes
	 * between server restarts
	 */
	private static Random rand;
	private String userId;

	@Autowired
	private UsersConnectionRepository connectionRepository;

	public SocialContext() {
		rand = new Random(Calendar.getInstance().getTimeInMillis());
	}

	@Override
	public String signIn(String userId, Connection<?> connection,
			NativeWebRequest request) {
		this.setUserId(userId);
		SecurityContextHolder.getContext().setAuthentication(
				new UsernamePasswordAuthenticationToken(userId, null, null));
		return null;
	}

	@Override
	public String execute(Connection<?> connection) {
		return Long.toString(rand.nextLong());
	}

	public FacebookProfile getFacebookProfile(String userId) {

		FacebookProfile facebookProfile = null;
		ConnectionRepository connectionRepo = null;
		Connection<Facebook> facebookConnection = null;
		try {
			connectionRepo = connectionRepository
					.createConnectionRepository(userId);
			facebookConnection = connectionRepo
					.findPrimaryConnection(Facebook.class);

			if (facebookConnection != null) {
				facebookProfile = facebookConnection.getApi().userOperations()
						.getUserProfile();
				return facebookProfile;
			} else {
				return null;
			}
		} finally {
			connectionRepo = null;
			facebookConnection = null;
		}
	}

	/**
	 * Check that user is login through twitter
	 * 
	 * @param userId
	 * @return
	 */
	public TwitterProfile getTwitterProfile(String userId) {

		TwitterProfile twitterProfile = null;
		ConnectionRepository connectionRepo = null;
		Connection<Twitter> twitterConnection = null;
		try {
			connectionRepo = connectionRepository
					.createConnectionRepository(userId);
			twitterConnection = connectionRepo
					.findPrimaryConnection(Twitter.class);

			if (twitterConnection != null) {
				twitterProfile = twitterConnection.getApi().userOperations()
						.getUserProfile();
				return twitterProfile;
			} else {
				return null;
			}
		} finally {
			connectionRepo = null;
			twitterConnection = null;
		}
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
