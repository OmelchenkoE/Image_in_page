<%-- 
    Document   : index
    Created on : 20.10.2017, 22:42:41
    Author     : qwerty
--%>



<%@page import="newpackage.NewClass1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%NewClass1 nc = new NewClass1();%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

    </head>
    <body>

        <div style="margin: 0 auto; width: 750px;" >
            <div style="padding:0 50%">
                <h3>
                    <%out.print(nc.Alert());%>
                </h3>
            </div>
            <div style="float: left;  margin: 15px">

                <img src="images/12.jpg" width="250" alt="image1" />
            </div>

            <div style="float: right;  margin: 15px;">

                <img src="images/12_1.jpg" width="250" alt="image2"/>
            </div>
        </div>

    </body>
</html>

