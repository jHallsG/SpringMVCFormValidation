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
           <h1>Registration Success!</h1>
           <p>See how experienced developers solve problems in real-time. <br> Watching scripted tutorials is great, but understanding how <br> developers think is invaluable.</p>  
        </section>

        <section>
            <div class="cta">
                <p><span>Registration</span></p>
            </div>

            
    <div class="sign-up">
        <table>
        	<tr>
				<td>First name</td>
				<td>:</td>
				<td>${userInfo.firstName}</td>
			</tr>
			
			<tr>
				<td>Last name</td>
				<td>:</td>
				<td>${userInfo.lastName}</td>
			</tr>
			
				<tr>
				<td>Credit Card</td>
				<td>:</td>
				<td>${userInfo.creditCard}</td>
			</tr>
			
			<tr>
				<td>Email</td>
				<td>	:	</td>
				<td>${userInfo.email}</td>
			</tr>
        
        
        </table>
        </div>
        </section>
    </main>
    
</body>
</html>