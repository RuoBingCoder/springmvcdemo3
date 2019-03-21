<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: shiji
  Date: 2018/10/5
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/add_employee" method="post" modelAttribute="employee">

    <!--path相当于name属性-->
    Email:<form:input path="email"/>
    <br>
    <br>
    lastName:<form:input path="lastname"/>
    <br>
    <br>

    <%
        Map<String, String> genders = new HashMap();
        genders.put("1", "Male");
        genders.put("0", "Female");
        request.setAttribute("genders", genders);

    %>

    Gender:<form:radiobuttons path="gender" items="${genders}"/>
    <br>
    <br>
    Department:<form:select path="department" items="${departments}" itemLabel="departmentName"
                            itemValue="id"/>

    <br>
    <br>

    <input type="submit" name="submit"/>


</form:form>
</body>
</html>
