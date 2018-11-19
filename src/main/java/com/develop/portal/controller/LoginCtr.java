package com.develop.portal.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginCtr {

	private static final Logger logger = LoggerFactory.getLogger(LoginCtr.class);

	@RequestMapping(value = "/")
	public String login(HttpServletRequest req, HttpServletResponse rep) {
		logger.info("-----portal.login----");
		return "/login/Login.html";
	}

}
