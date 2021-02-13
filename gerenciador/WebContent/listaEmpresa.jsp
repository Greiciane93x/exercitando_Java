<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %> 

<%@page import="java.util.list" %> 
 br.com.alura.gerenciador.servlet.Empresa" %>

<html> 

	<body> 
	
		<ul> 
			<%
			
			List<Empresa> lista = (List<Empresas>)request.getAttribute("empresas"); 
				for(Empresa empresa : lista){
					
			%>
					<li><%=empresa.getNome() %></li>
				<%
				
				}
							
			%>
		
		</ul>
	
	</body>

</html>