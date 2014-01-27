<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="name" type="java.lang.String" required="true" rtexprvalue="true" %>

<div id="greeting">
    <p>Hello <c:out value="${name}" /></p>
</div>
