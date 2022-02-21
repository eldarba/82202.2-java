package app.core.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import app.core.jwt.util.JwtUtil;

public class MyFilter implements Filter {

	private JwtUtil jwtUtil;

	public MyFilter(JwtUtil jwtUtil) {
		super();
		this.jwtUtil = jwtUtil;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// cast the req/resp to http
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;

		String token = req.getHeader("token");
		if (token != null && !jwtUtil.isTokenExpired(token)) {
			// check token validity
			// if valid forward the request to the end point
			chain.doFilter(request, response);
			return;
		} else {
			// if NOT valid
			// throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "not logged in");
			resp.sendError(HttpStatus.UNAUTHORIZED.value(), "not logged in");
		}

	}

}
