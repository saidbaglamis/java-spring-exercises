<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <link href="webjars/bootstrap/5.2.3/css/bootstrap.css" rel="stylesheet">
        <meta charset="UTF-8">
        <title>Add Todo Page</title>
    </head>
    <body>
    <div class="container">
        <h1>Welcome ${name}!</h1>
        <hr>
        <h1>Enter Todo Details</h1>
        <form:form method="post" modelAttribute="todo">
            Description: <form:input type="text" path="description" required="required"/>
            <form:errors path="description" cssClass="text-warning"/>
            <form:input type="hidden" path="id"/>
            <form:input type="hidden" path="done"/>
            <input type="submit" class="btn btn-success"/>
        </form:form>
        <script src="webjars/jquery/3.6.3/jquery.min.js"></script>
        <script src="webjars/bootstrap/5.2.3/js/bootstrap.js"></script>
    </div>
    </body>
</html>