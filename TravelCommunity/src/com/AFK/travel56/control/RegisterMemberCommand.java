package com.AFK.travel56.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.AFK.travel56.service.MemberService;

public class RegisterMemberCommand implements Command {

	public CommandResult execute(HttpServletRequest request,
			HttpServletResponse response)
			throws javax.servlet.ServletException, java.io.IOException {
		CommandResult commandResult = new CommandResult(
				"/WEB-INF/view/testRegister.jsp");

		// MemberService memberService = new MemberService();
		//
		// memberService.registerMember(request.getParameter("id"),
		// request.getParameter("pass"), request.getParameter("gender"),
		// request.getParameter("email"), request.getParameter("address"),
		// request.getParameter("name"), request.getParameter("birth"),
		// request.getParameter("nickname"));
		System.out.println(request.getParameter("id"));

		return commandResult;
	}
}
