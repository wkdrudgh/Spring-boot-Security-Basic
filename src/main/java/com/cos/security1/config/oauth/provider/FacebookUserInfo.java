package com.cos.security1.config.oauth.provider;

import java.util.Map;

public class FacebookUserInfo implements OAuth2UserInfo {

	private Map<String, Object> attribute; // oauth2User.getAttributes()
	
	public FacebookUserInfo(Map<String, Object> attribute) {
		this.attribute = attribute;
	}
	
	@Override
	public String getProviderId() {		
		return (String)attribute.get("id");
	}

	@Override
	public String getProvider() {	
		return "facebook";
	}

	@Override
	public String getEmail() {	
		return (String)attribute.get("email");
	}

	@Override
	public String getName() {
		return (String)attribute.get("name");
	}

}
