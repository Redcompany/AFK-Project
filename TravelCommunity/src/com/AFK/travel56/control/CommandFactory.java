package com.AFK.travel56.control;

public class CommandFactory {

	public static Command createCommand(String pathName) {
		Command target = null;

		switch (pathName) {
		case "/":
			target = new FrontCommand();
			break;
		case "/front":
			target = new FrontCommand();
			break;
		case "/home":
			target = new HomeCommand();
			break;
		case "/testRegister":
			target = new RegisterMemberCommand();
			break;
		case "/continentArticle":
			target = new ContinentArticleCommand();
			break;
		}
		return target;
	}
}
