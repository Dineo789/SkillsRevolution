<%-- 
    Document   : showCandidates
    Created on : Jul 26, 2017, 9:28:50 AM
    Author     : reversidesoftwaresolution
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script>
$(document).ready(function(){
    $("#deleteCandidate").hide();
     $("#updateCandidate").hide();
    
    $("#update").click(function(){
        $("#updateCandidate").show();
        $("#deleteCandidate").hide();
    });
    $("#delete").click(function(){
        $("#deleteCandidate").show();
         $("#updateCandidate").hide();
    });
});
</script>
    </head>
    <body>
        All Employees: <br> 
        <c:forEach var="candidate" items="${candidateList}">
            Employee ID: ${candidate.user_Id} <br>
            Employee Name: ${candidate.first_Name} <br>
            Employee Surname: ${candidate.last_Name}<br>
            Employee Division: ${candidate.division}<br>
            -------------------------------------<br>
        </c:forEach>
        <form action="CandidateController" method="POST">
            Update: <input type="checkbox" id="update"> Delete: <input type="checkbox" id="delete" onclick="document.getElementById('first_Name').disabled=this.checked;
                document.getElementById('last_Nameupdate').disabled=this.checked;
                document.getElementById('divisionupdate').disabled=this.checked;"><br><br>
            <select name="user_Id">
                <c:forEach items="${candidateList}" var="candidate">
                <option value="${candidate.user_Id}">${candidate.user_Id}</option>
                 </c:forEach>
            </select>
            
            <br>
            Update Name: <input id="first_Name" type="text" name="first_Name"><br>
            Update Surname: <input id="last_Nameupdate" type="text" name="last_Nameupdate"> <br><br>
            Update Division: <input id="divisionupdate" type="text" name="divisionupdate"> <br><br>
            <button type="submit" id="updateCandidate" name="updateCandidate"> Update</button> <br> <br>
            <button type="submit" id="deleteCandidate" name="deleteCandidate"> Delete </button>
            
            
               
       
        </form>
    </body>
</html>
