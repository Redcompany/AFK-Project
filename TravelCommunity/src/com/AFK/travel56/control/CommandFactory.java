package com.AFK.travel56.control;

public class CommandFactory {

	public static Command createCommand(String pathName) {
		Command target = null;

		switch (pathName) {
		case "/":
			target = new HomeCommand();
			break;
			
		case "/testRegister":
			target = new RegisterMemberCommand();
			break;
			
		case "/home":
			target = new HomeCommand();
			break;
			
		case "/FindIDPassword":
			target = new IDPasswordFindMemberCommand();
			break;
			
		case "/continentArticle":
			target = new ContinentArticleCommand();
			break;
			
		case "/readArticle":
			target = new ReadArticleCommand();
			break;
			
		case "/loginMember":
			target = new LoginMemberCommand();
			break;
			
		case "/updateMember":
			target = new UpdateMemberCommand();
			break;
		}

		return target;
	}
}
