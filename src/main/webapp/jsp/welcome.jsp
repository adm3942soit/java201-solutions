<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Spring MVC Tutorial - Hello World Spring MVC
        Example</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css"/>
    <style >
        body {
            background-image: url("/resources/img/bg.png");
            background-size: 100%;
        }
    </style>
</head>
<body>${message}

<br>
<link href="<c:url value="/resources/img/Accenture.jpeg"/>" rel="apple-touch-startup-image">
<img style="width: 80%; height: 80%;padding-left: 10%  " src="<c:url value="/resources/img/Accenture.jpeg"/>"/>
<br>
<div id="footer">
<div class="copyright" style="position:fixed; bottom:20px; left:20px;">

    <h3 align="center">Copyright &#169; 2015 Accenture </h3>

</div>
</div>
</body>
</html>