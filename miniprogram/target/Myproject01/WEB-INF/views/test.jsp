<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>

    <!-- 引入jquery -->
    <script type="text/javascript" src="${APP_PATH}WEB-INF/static/js/jquery-3.4.1.min.js"></script>
    <!-- 引入样式 -->
    <link href="${APP_PATH}WEB-INF/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${APP_PATH}WEB-INF/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

</head>
<body>

</body>
</html>
