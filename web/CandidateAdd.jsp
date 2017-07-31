<%-- 
    Document   : CandidateAdd
    Created on : Jul 26, 2017, 9:21:15 AM
    Author     : reversidesoftwaresolution
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="add">
        <h1> Add Candidate </h1>
        <form action="CandidateController" method="GET">
            <table>
                <tr>
                    <td> Name: </td>
                    <td><input type="text" name="first_Name"></td>
                </tr>
                <tr>
                    <td> Surname: </td>
                    <td><input type="text" name="last_Name"></td>
                </tr>
                <tr>
                    <td> Division: </td>
                    <td><input type="text" name="division"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="addCandidate" value="Add"></td>
                    
                </tr>
            </table>
        </form>
        </div>
        <form action="CandidateController" method="POST">
            <input type="submit" name="showCandidate" value="Show"> &nbsp; &nbsp;<br>
            
            
        </form>
    </body>
</html>
