<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<jsp:include page="templates/header.jsp"/>

    <title>Sport Challenge</title>

<jsp:include page="templates/middle.jsp"/>

<div class="page_outer">
  <div class="alert alert-info">
    <h2>Sport Challenge</h2>
    <div>
      Es ist mal wieder so weit vom 01.12.2014 bis zum 01.02.2015 findet eine Challenge statt.
    </div>
  </div>

  <div class="alert alert-info">
    <table class="idxPlaceTbl">
      <tr><th>Platz</th><th>Name</th></tr>

    </table>
  </div>
</div>

<jsp:include page="templates/footer.jsp"/>