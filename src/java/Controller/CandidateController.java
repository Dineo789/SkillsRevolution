/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DataAccessObject.CandidateDAO;
import DataAccessObject.CandidateDAOImpl;
import Model.Candidates;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author reversidesoftwaresolution
 */
public class CandidateController extends HttpServlet {
    
    Candidates  candidate = new Candidates();
    CandidateDAOImpl candidateDaoImpl = new CandidateDAOImpl();
    CandidateDAO cdao;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         System.out.println("doGet()");
        if(request.getParameter("addCandidate")!=null){
            String Name = request.getParameter("first_Name");
            String Surname = request.getParameter("last_Name");
            String Division = request.getParameter("division");
            candidate.setFirst_Name(Name);
            candidate.setLast_Name(Surname);
            candidate.setDivision(Division);
            candidateDaoImpl.saveCandidate(candidate);
            RequestDispatcher rd = request.getRequestDispatcher("showCandidates.jsp");
            rd.forward(request, response);
        }
          
        
    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          System.out.println("doPost()");
         if(request.getParameter("showCandidate")!=null){
            List< Candidates>  candidateList = new ArrayList();
             candidateList =  candidateDaoImpl.showAllCandidates();
            request.setAttribute("candidateList",  candidateList);
            //SHOW MSG INSTEAD
            RequestDispatcher rd = request.getRequestDispatcher("showCandidates.jsp");
            rd.forward(request, response);
        }
         
          if(request.getParameter("updateCandidate")!=null){
             int id1 = Integer.parseInt(request.getParameter("user_Id"));
             String Name = request.getParameter("first_Name");
             String Surnameupdate = request.getParameter("last_Nameupdate");
             String Divisionupdate = request.getParameter("divisionupdate");
              candidateDaoImpl.updateCandidate(id1, Name, Surnameupdate,Divisionupdate);
             
             RequestDispatcher rd = request.getRequestDispatcher("CandidateAdd.jsp");
             rd.forward(request, response);
             
         }else{
              System.out.println("i am null  ");
          }
          
         if(request.getParameter("deleteCandidate")!=null){
             int id2 = Integer.parseInt(request.getParameter("user_Id"));
             candidate.setUser_Id(id2);
             candidateDaoImpl.deleteCandidate(candidate);
              RequestDispatcher rd = request.getRequestDispatcher("CandidateAdd.jsp");
            rd.forward(request, response);
         }
         
      
      
    }
 
 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    
}
