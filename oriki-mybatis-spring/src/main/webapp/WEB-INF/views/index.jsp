<%--
  Created by IntelliJ IDEA.
  User: oriki
  Date: 2017/12/27
  Time: 下午4:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Hello!

<br/>
当前服务器时间：

<fmt:formatDate value="${date}" pattern="yyyy-MM-dd HH:mm:ss"/>
</body>
</html>
