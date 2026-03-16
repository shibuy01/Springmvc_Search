package springmvc.serch;


import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("This is PreHandler");
		
		String name = request.getParameter("field");
		if(name.startsWith("d")) {
			response.setContentType("text/html");
			response.getWriter().println("<h1>Invalid name ... Name should not starts with d</h1>");
			return false;
		}
		return true;
	}
	
}
