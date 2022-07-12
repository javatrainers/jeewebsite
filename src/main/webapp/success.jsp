<%@ page import="java.util.*" %> 
<html>
login success 
<%
// scriptlet
	String fName=request.getAttribute("firstName").toString();
	String lName=request.getAttribute("lastName").toString();
	ArrayList<String> fav=(ArrayList<String> ) request.getAttribute("favor");
	int a=20;
	int b=30;
%>
<table border="1">
<%
	for(String s: fav){
		%>
			<tr><td><%=s%></td></tr>
		<%
	}
%>
</table>
<%= (a+b) %>
Welcome <%=fName%>  <%=lName%>
</html>
