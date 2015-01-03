package com.AFK.travel56.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.AFK.travel56.service.ArticleService;

public class ContinentArticleCommand implements Command {
	public CommandResult execute(HttpServletRequest request,
			HttpServletResponse response)
			throws javax.servlet.ServletException, java.io.IOException {
		CommandResult commandResult = new CommandResult(
				"/WEB-INF/view/continentArticle.jsp");
			ArticleService articleService = new ArticleService();
			request.setAttribute("continentArticle",
					articleService.showAllArticleByContinent(request.getParameter("continent")));
		
		return commandResult;
	}

}
