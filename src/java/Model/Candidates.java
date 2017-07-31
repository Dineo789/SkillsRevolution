/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author reversidesoftwaresolution
 */

@Entity
public class Candidates implements Serializable{

    /**
     * @return the first_Name
     */
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_Id;
    
    private String first_Name;
   
    private String last_Name;
 
    private String division;
    
    public String getFirst_Name() {
        return first_Name;
    }

    /**
     * @param first_Name the first_Name to set
     */
    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    /**
     * @return the last_Name
     */
    public String getLast_Name() {
        return last_Name;
    }

    /**
     * @param last_Name the last_Name to set
     */
    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    /**
     * @return the division
     */
    public String getDivision() {
        return division;
    }

    /**
     * @param division the division to set
     */
    public void setDivision(String division) {
        this.division = division;
    }

    /**
     * @return the userId
     */
    public int getUser_Id() {
        return user_Id;
    }

    /**
     * @param userId the userId to set
     */
    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    
 
   
  
    
    
}
