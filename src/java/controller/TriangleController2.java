/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.TriangleCalculator;

/**
 *
 * @author Owner
 */
@WebServlet(name = "TriangleController2", urlPatterns = {"/TriangleController2"})
public class TriangleController2 extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        String sideA = request.getParameter("sidea");
        String sideB = request.getParameter("sideb");
        String sideC = request.getParameter("sidec");
        String triAnswer = "";
        String destination = "/challenge2.jsp";
        String USER_FAIL = "Please provide 2 numeric values either A and B or B and C.";
        
        if ("".equals(sideA)){
        try{
            TriangleCalculator calc = new TriangleCalculator();
            calc.setSideB(sideB);
            calc.setSideC(sideC);
            triAnswer = "" + calc.getThirdSide();
            
        }catch(NumberFormatException nfe) {
            triAnswer = USER_FAIL;
        }
        }else{
            try{
            TriangleCalculator calc = new TriangleCalculator();
            calc.setSideA(sideA);
            calc.setSideB(sideB);
            triAnswer = "" + calc.getHypotenuse();
            
        }catch(NumberFormatException nfe) {
            triAnswer = USER_FAIL;
        }
        }
       request.setAttribute("triAnswer", triAnswer);
       RequestDispatcher dispatcher =
                    getServletContext().getRequestDispatcher(destination);
                dispatcher.forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
