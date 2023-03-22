package com.estf.exam.presentation.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.estf.exam.beans.Task;
import com.estf.exam.buisness.DefaultServices;

@WebServlet("/TaskList")

public class ListTaskServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<Task> tasks = null;
		tasks = DefaultServices.getInstance().getAllTasks() ; 
	//	System.out.println("Retrieved " + tasks.size() + " todos"); // Debugging statement
		request.setAttribute("tasks", tasks);
        request.getRequestDispatcher("WEB-INF/TaskList.jsp").forward(request, response); // Forward the request to the ListTodo.jsp view


		}
		
	
	
}
