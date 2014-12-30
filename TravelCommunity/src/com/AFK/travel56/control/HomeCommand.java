package com.AFK.travel56.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeCommand implements Command {
	public CommandResult execute(HttpServletRequest request,
			HttpServletResponse response)
			throws javax.servlet.ServletException, java.io.IOException {
		CommandResult commandResult =null ;
		String a=request.getParameter("id");
		System.out.println(a);
		commandResult=new CommandResult(
			"/WEB-INF/view/home.jsp");
		return commandResult;
	}
}
