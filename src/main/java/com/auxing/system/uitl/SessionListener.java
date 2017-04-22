package com.auxing.system.uitl;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener {
	private MySessionContext myc = MySessionContext.getInstance();

	public void sessionCreated(HttpSessionEvent httpSessionEvent) {
		this.myc.AddSession(httpSessionEvent.getSession());
	}

	public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
		HttpSession session = httpSessionEvent.getSession();
		this.myc.DelSession(session);
	}
}
