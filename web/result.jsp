<%-- 
    Document   : result
    Created on : Oct 28, 2020, 11:00:08 PM
    Author     : kitsa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
    </head>
    <body>
        <% 
                double result = (Double) request.getAttribute("result");
                String num1 = request.getParameter("num1");
                String num2 = request.getParameter("num2");
                double num2_double = Double.parseDouble("num2");
                String output;
                if(request.getParameter("add") != null)
                {
                    output = "Result: "+num1+" + "+num2+"="+result;
                }
                else if(request.getParameter("sub") != null)
                {
                    output = "Result: "+num1+" - "+num2+"="+result;
                }
                else if(request.getParameter("mul") != null)
                {
                    output = "Result: "+num1+" * "+num2+"="+result;
                }
                else if(request.getParameter("div") != null)
                {
                    if(num2_double == 0)
                    {
                      output = "Result: " + num1 + " / " + num2 + "Error divide by 0";
                    }else
                    output = "Result: " + num1 + " / " + num2 + "=" + result;
                }
                out.println(result);
            %>
    </body>
</html>
