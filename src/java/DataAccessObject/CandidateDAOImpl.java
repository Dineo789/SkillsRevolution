/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessObject;

import Model.Candidates;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;

/**
 *
 * @author reversidesoftwaresolution
 */
public class CandidateDAOImpl implements CandidateDAO {

  
    public void saveCandidate(Candidates candidate) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(candidate);
        transaction.commit();
        session.close();
        
    }

  
    
    public List<Candidates> showAllCandidates() {
        List<Candidates> candidateList = new ArrayList();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("From Candidates");
        candidateList = query.list();
        return candidateList;
    }

   
    public void updateCandidate(int user_Id, String first_Name, String last_Name, String division) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Candidates candidatedetails = (Candidates)session.load(Candidates.class, user_Id);
        candidatedetails.setFirst_Name(first_Name);
        candidatedetails.setLast_Name(last_Name);
        candidatedetails.setDivision(division);
        session.update(candidatedetails);
        transaction.commit();
        session.close();  
    }

  
    public void deleteCandidate(Candidates candidate) {
        Session session = HibernateUtil.getSessionFactory                                                                                  ().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(candidate);
        transaction.commit();
        session.close();
    }
    
}
