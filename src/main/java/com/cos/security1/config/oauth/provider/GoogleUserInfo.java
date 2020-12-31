package com.cos.security1.config.oauth.provider;

import java.util.Map;

public class GoogleUserInfo implements OAuth2UserInfo {

	private Map<String, Object> attribute; // oauth2User.getAttributes()
	
	public GoogleUserInfo(Map<String, Object> map) {
		this.attribute = map;
	}
	
	@Override
	public String getProviderId() {		
		return (String)attribute.get("sub");
	}

	@Override
	public String getProvider() {	
		return "google";
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
