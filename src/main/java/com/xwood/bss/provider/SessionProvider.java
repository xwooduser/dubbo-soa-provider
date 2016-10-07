package com.xwood.bss.provider;

import org.springframework.stereotype.Service;

import com.xwood.globel.iprovider.ISessionProvider;

@Service("sessionProvider")
public class SessionProvider implements ISessionProvider {

	@Override
	public String get() {
		return "######100000000000000"+this.hashCode();
	}
	

}
