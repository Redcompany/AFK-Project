package com.AFK.travel56.control;

public class CommandFactory {

	public static Command createCommand(String pathName) {
		Command target = null;

		switch (pathName) {
		case "/":
			target = new RegisterMemberCommand();
			break;
		case "/testRegister":
			target = new RegisterMemberCommand();
			break;
		case "/home":
			target = new HomeCommand();
			break;
		}

		return target;
	}

}
