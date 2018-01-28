package org.spring.mvcApp.Controller;

import java.io.IOException;

import javax.jws.WebService;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import org.spring.mvcApp.Model.Service.Service_Class;
@WebServlet(urlPatterns="/mvc")
public class Type1 extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException 
	{
		String id_1 = req.getParameter("i");
		int Id = Integer.parseInt(id_1);
		String Name = req.getParameter("nm");
		
		Service_Class sc = new Service_Class();
		sc.generateAccountNo(Id,Name);
	}
	
}
