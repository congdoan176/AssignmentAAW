<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <ul>
        <s:iterator value="eventList">
        <li>
            <div>
                <label>Id : </label>
                <s:property value="id"/>
            </div>
            <div>
                <label>When?  : </label>
                <s:property value="date"/>
            </div>
            <div>
                <label>Time  : </label>
                <s:property value="time"/>
            </div>
            <div>
                <label>planning : </label>
                <s:property value="plan"/>
            </div>
            <div>
                <label>location  : </label>
                <s:property value="location"/>
            </div>
            <div>
                <label>info : </label>
                <s:property value="info"/>
            </div>
            <div>
                <s:form action="edit">
                    <s:textfield name="newEvent.id" value="%{id}" type="hidden"/>
                    <s:textfield name="newEvent.info" value="%{info}" type="hidden"/>
                    <s:textfield name="newEvent.location" value="%{location}" type="hidden"/>
                    <s:textfield name="newEvent.plan" value="%{plan}" type="hidden"/>
                    <s:textfield name="newEvent.date" value="%{date}" type="hidden"/>
                    <s:textfield name="newEvent.time" value="%{time}" type="hidden"/>
                    <s:submit action="edit" value="Edit"/>
                </s:form>

            </div>
            <div>
                <s:form action="delete">
                    <s:textfield name="newEvent.id" value="%{id}" type="hidden"/>
                    <s:textfield name="newEvent.info" value="%{info}" type="hidden"/>
                    <s:textfield name="newEvent.location" value="%{location}" type="hidden"/>
                    <s:textfield name="newEvent.plan" value="%{plan}" type="hidden"/>
                    <s:textfield name="newEvent.date" value="%{date}" type="hidden"/>
                    <s:textfield name="newEvent.time" value="%{time}" type="hidden"/>
                    <s:submit action="delete" value="Delete"/>
                </s:form>

            </div>
            <div>
                -------------------------------------------------------------------
            </div>


        </li>
        </s:iterator>
    </ul>
</body>
</html>