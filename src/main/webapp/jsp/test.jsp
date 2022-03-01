<%@ page import="java.util.ArrayList" %> 

<html>
	<%
		String [] fruits=new String[3];
		fruits[0]="apple";
		fruits[1]="banana";
		fruits[2]="mango";
	%>
		<ul>
	<%
			for(int i=0; i <fruits.length; i++){
	%>
				<li>  <%= fruits[i]  %> </li>
	<%	
			}
	%>
		</ul>
		
	
</html>
 