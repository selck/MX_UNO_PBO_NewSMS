 <%@ taglib uri="http://java.sun.com/portlet" prefix="portlet"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*" %>
<portlet-client-model:init>
	<portlet-client-model:require module="ibm.portal.xml.*"/>
	<portlet-client-model:require module="ibm.portal.portlet.*"/>   
</portlet-client-model:init>

<h1> newSMS </h1>

<c:if test="${empty listEstadosRequest}">
    listEstadosRequest is empty or null :/
</c:if>
<c:if test="${not empty listEstadosRequest}">
    listEstadosRequest is NOT empty or null =) wiii
</c:if>


<c:if test="${empty chucho}">
    chucho is empty or null :/
</c:if>
<c:if test="${not empty chucho}">
    chucho is NOT empty or null =) wiii
</c:if>