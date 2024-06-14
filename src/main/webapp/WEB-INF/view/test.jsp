<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Sign Up Page</title>

    <!--- My CSS Link-->
	<spring:url value="/resources/css/styles.css" var="mainCss" />
	<link href="${mainCss}" rel="stylesheet" />
</head>
<body>
	
    <main>
        <section class="learn">
           <h1>Learn to code by<br>watching others</h1>
           <p>See how experienced developers solve problems in real-time. <br> Watching scripted tutorials is great, but understanding how <br> developers think is invaluable.</p>  
        </section>

        <section>
            <div class="cta">
                <p><span>Sign-Up</span></p>
            </div>

            
    <div class="sign-up">
        <form:form action="postPage" class="signup-form" data-netlify="true" modelAttribute="userInfo">
            <div class="form-btn">
                <form:input placeholder = "First Name" path = "firstName" />
                <form:errors path = "firstName" cssClass="error"></form:errors>
            </div>

            <div class="form-btn">
                <form:input placeholder="Last Name" path="lastName"/>
                 <form:errors path = "lastName" cssClass="error"></form:errors>
            </div>
            
             <div class="form-btn">
                <form:input path="creditCard" placeholder="Credit Card Number"/>
                <form:errors path = "creditCard" cssClass="error"></form:errors>
            </div>

            <div class="form-btn">
                <form:input path="email" placeholder="Email Address"/>
                 <form:errors path = "email" cssClass="error"></form:errors>
            </div>

            <div class="form-btn">
                <form:input path="password" placeholder="Password"/>
                 <form:errors path = "password" cssClass="error"></form:errors>
            </div>

            <input id="submit-btn" type="submit" value="Register" id="btn">

            <p class="terms">By clicking the button, you are agreeing to our <span><a href="#">Terms and Services</a></span></p>
        </form:form>
        </div>
        </section>
    </main>
    
</body>
</html>