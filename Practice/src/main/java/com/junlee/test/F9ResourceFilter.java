package com.junlee.test;

import java.io.File;
import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class F9ResourceFilter implements javax.servlet.Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest request1 = (HttpServletRequest) request;
		String Uri = request1.getRequestURI();
		// 获取最后一段资源名
		String resName = "";
		if (Uri.contains("/"))
			resName = Uri.substring(Uri.lastIndexOf("/"));

		if (!resName.contains(".")) {// 访问资源没有后缀，则表示是页面层
			String path = Uri.substring(request1.getContextPath().length() + 1);
			String phiscpath = getWebRootPath() + "pages\\" + path + ".html";

			if (new File(phiscpath).exists()) {
				String url = "/pages/" + path + ".html";
				request1.getRequestDispatcher(url).forward(request, response);
				return;
			}
		}

		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {

	}

	private String getWebRootPath() {
		return "E:\\GithubCode\\DailyPractice\\trunk\\Practice\\src\\main\\webapp\\";// TODO自行改，或改成动态
	}
}
