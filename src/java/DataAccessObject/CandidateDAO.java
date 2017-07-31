/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessObject;

import Model.Candidates;
import java.util.List;

/**
 *
 * @author reversidesoftwaresolution
 */
public interface CandidateDAO {
    public void saveCandidate (Candidates candidate);
    public List<Candidates> showAllCandidates();
    public void updateCandidate (int id, String name, String surname,String division);
    public void deleteCandidate (Candidates candidate);
    
    
}
