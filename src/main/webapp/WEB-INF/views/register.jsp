<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="pl">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Document</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
  </head>
  <body>
    <header>
      <nav class="container container--70">
        <ul class="nav--actions">
          <li><a href="${pageContext.request.contextPath}/login">Zaloguj</a></li>
          <li class="highlighted"><a href="${pageContext.request.contextPath}/register">Załóż konto</a></li>
        </ul>

        <ul>
          <li><a href="index.html" class="btn btn--without-border active">Start</a></li>
          <li><a href="index.html#steps" class="btn btn--without-border">O co chodzi?</a></li>
          <li><a href="index.html#about-us" class="btn btn--without-border">O nas</a></li>
          <li><a href="index.html#help" class="btn btn--without-border">Fundacje i organizacje</a></li>
          <li><a href="index.html#contact" class="btn btn--without-border">Kontakt</a></li>
        </ul>
      </nav>
    </header>

    <section class="login-page">
      <h2>Załóż konto</h2>
      <form:form method="post" modelAttribute="userDTO">
        <div class="form-group">
          <form:input type="text" path="name" placeholder="Imię"/>
        </div>
        <div class="form-group">
          <form:input type="text" path="surname" placeholder="Nazwisko"/>
        </div>
        <div class="form-group">
          <form:input type="email" path="username" placeholder="Email"/>
        </div>
        <div class="form-group">
          <form:input type="password" path="password" placeholder="Hasło"/>
        </div>
        <div class="form-group form-group--buttons">
          <form:button type="submit" class="btn">Załóż konto</form:button>
          <a href="${pageContext.request.contextPath}/login" class="btn btn--without-border">Zaloguj się</a>
        </div>
        <sec:csrfInput/>
      </form:form>
    </section>
    <!-- Footer-->
    <jsp:include page="footer.jsp"/>
    <!-- Footer-->
  </body>
</html>
