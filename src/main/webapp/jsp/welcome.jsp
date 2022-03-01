<%@ page import="java.util.ArrayList" %> 

<%
	// java variable can change values
	String name=(String)request.getAttribute("userid");
	String address=(String)request.getAttribute("address");
%>
<div>
	WELCOME <%=  name %>   TO JAVA WEBSITE
	<br>
	address : <%= address %>   
</div>
 