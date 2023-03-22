package com.estf.exam.presentation.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.estf.exam.beans.Task;
import com.estf.exam.buisness.DefaultServices;


@WebServlet("/task/*")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pathInfo = request.getPathInfo();
        if (pathInfo == null || pathInfo.equals("/") || pathInfo.equals("")) {
            // If the user tries to access the root path or no path is specified, redirect them to the home page
            request.getRequestDispatcher("/home.jsp").forward(request, response);
        } else if (pathInfo.equals("/login")) {
            // If the user tries to access the login page, display it
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
        } else if (pathInfo.equals("/register")) {
            // If the user tries to access the registration page, display it
            request.getRequestDispatcher("/WEB-INF/views/register.jsp").forward(request, response);
        } 
        
        else if (pathInfo.equals("/addTask")) {
            // If the user tries to access the login page, display it
            request.getRequestDispatcher("/WEB-INF/views/addTask.jsp").forward(request, response);
        }
        else if (pathInfo.equals("/TaskList")) {
            // If the user tries to access the login page, display it
            request.getRequestDispatcher("/WEB-INF/views/TaskList.jsp").forward(request, response);}
         else {
            // If the user tries to access an unknown path, send a 404 error
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("u are in post ");
		String url=request.getRequestURI();
		if(url.endsWith("/addTask")) {
        // retrieve the task title from the form data
        String title = request.getParameter("task");

        // validate the task title
        if (title == null || title.trim().isEmpty()) {
            request.setAttribute("error", "Task title cannot be empty");
            request.getRequestDispatcher("WEB-INF/addTask.jsp").forward(request, response);
            return;
        }

        // create a new Task object
        Task task = new Task();
        task.setTask(title);

        // add the new task to the database
		DefaultServices.getInstance().createTask(task);

		// redirect to the task list page
		//response.sendRedirect(request.getContextPath() + "/task/TaskList");
    }
	}

}