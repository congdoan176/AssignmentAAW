<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<title>Title</title>
    <style>
        .errorMessage{
            color: red;
        }
    </style>
</head>
<body>
	<s:form method="POST" action="store">

            <s:textfield type="date" label="When?" name="newEvent.date"  title="YYYY-MM-DD like 2013-01-21"/>

            <s:textfield type="time" label="Time" name="newEvent.time"/>

            <s:textfield label=" What are you planning?" name="newEvent.plan"/>

            <s:textfield name="newEvent.location" label="Where? :"/>

            <s:textfield label="More info?" name="newEvent.info"/>

            <s:submit value="Create Event" action="store"/>

    </s:form>
</body>
</html>