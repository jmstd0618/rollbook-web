<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>
    Hello world!
</h1>

<P> The time on the server is ${serverTime}. </P>

<div class="_div_test">


</div>

<script type="text/javascript" src="/js/lib/jquery-2.1.4.js"></script>
<script type="text/javascript">
    var sTest = "This is Test Text";
    (function () {
        console.log(sTest);
    })();

</script>
</body>
</html>
