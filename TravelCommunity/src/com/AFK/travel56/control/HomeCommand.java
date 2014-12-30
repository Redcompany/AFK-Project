package com.AFK.travel56.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.AFK.travel56.service.MemberService;

public class HomeCommand implements Command {
	public CommandResult execute(HttpServletRequest request,
			HttpServletResponse response)
			throws javax.servlet.ServletException, java.io.IOException {
		CommandResult commandResult = null;
		String todoCheck = request.getParameter("todo");
		if (todoCheck != null) {
			switch (todoCheck) {
			case "회원가입":
				MemberService memberService = new MemberService();
				request.setAttribute("addMember", memberService.registerMember(
						request.getParameter("id"),
						request.getParameter("pass"),
						request.getParameter("gender"),
						request.getParameter("email"),
						request.getParameter("address"),
						request.getParameter("name"),
						request.getParameter("birth"),
						request.getParameter("nickname")));
				break;
			}
		}
		commandResult = new CommandResult("/WEB-INF/view/home.jsp");
		return commandResult;
	}
}
