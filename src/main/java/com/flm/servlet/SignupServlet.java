package com.flm.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.flm.dao.UserDao;
import com.flm.model.User;
import com.flm.utils.Constants;
import com.flm.utils.DBConnection;

@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confirmpassword = request.getParameter("confirm-password");
		User user = new User(email,password);
		UserDao userDao = new UserDao();
		userDao.saveUser(user);
		
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
			requestDispatcher.forward(request, response); 
			
		
	}

}
