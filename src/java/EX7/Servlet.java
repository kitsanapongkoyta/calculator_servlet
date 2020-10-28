/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX7;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kitsa
 */
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String calStr1 = request.getParameter("Calculater");
        String calStr2 = request.getParameter("Calculater");
        double num1 = Double.parseDouble(calStr1);
        double num2 = Double.parseDouble(calStr2);
        double result = 0;
        request.setAttribute("Number1", num1);
        request.setAttribute("Number2", num2);
        request.setAttribute("result", result);
        String calculate = request.getParameter("calculate");
        
        if(calculate != null && calculate.equals("add") )
	{
          result =  num1+num2;
          request.setAttribute("result", "" + result);
        }
        else if(calculate != null && calculate.equals("sub") )
	{
          result =  num1-num2;
          request.setAttribute("result", "" + result);
        }
        else if(calculate != null && calculate.equals("mul") )
	{
          result =  num1*num2;
          request.setAttribute("result", "" + result);
        }
        else if(calculate != null && calculate.equals("div") )
	{
          result =  num1/num2;
          request.setAttribute("result", "" + result);
        }
        request.getRequestDispatcher("/result.jsp").forward(request, response);
        return;
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
