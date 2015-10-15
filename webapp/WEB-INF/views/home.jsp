<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" session="false" %>
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
        var $divTest = $("._div_test");
        $divTest.text("이것은 자바스크립트를 통해서 수정된 글귀구만유.");
    })();

</script>
</body>
</html>
