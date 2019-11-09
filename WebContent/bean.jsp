<jsp:useBean id="sr" scope="page" class="myb.srbean" />
<html>
<head>
<body>
<%! String s;%>
<% s=request.getParameter("t2");%>
<jsp:setProperty name="sr" property="language" value="<%= s%>" />
<jsp:getProperty name="sr" property="language" />
<jsp:getProperty name="sr" property="comment" />
</body>
</html>

