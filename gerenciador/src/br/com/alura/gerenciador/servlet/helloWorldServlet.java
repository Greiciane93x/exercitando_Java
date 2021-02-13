package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/oi")
public class helloWorldServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		PrintWriter out = resp.getWriter(); 
		out.print("<html>");
		out.print("<body>");
		out.print("hello world");
		out.print("</body>");
		out.print("</html>"); 
		
		System.out.println("servlet funcionando...");
		
		
	} 

}
 