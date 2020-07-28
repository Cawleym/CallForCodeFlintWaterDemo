/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResidentManageFunction;

import java.time.LocalDate;
import java.util.Date;


/**
 * An abstract that depicts what makes up a profile
 * @author cawley
 */
public class Profile {
    
  
    private String firstName;
    private String lastName;
    private String username;
    private String emailaddress;
    private LocalDate dateOfBirth;
    private Integer zipCode;
    private String county;
    
    /**
     * This is the constructor for the User class
     * @param firstName Set first name for the user
     * @param lastName  Set last name for the user
     * @param username  set username for the user
     * @param emailaddress set email address for the user 
     * @param  zipCode set  Zip digits for the user
     * @param  dateOfBirth set County for the user
     * @param  County set County for the user
   */
   public Profile(String firstName, String lastName, String username, String emailaddress, String county, LocalDate dateOfBirth, Integer zipCode ){
          this.firstName =firstName;
          this.lastName = lastName;
          this.username = username;
          this.emailaddress = emailaddress;
          this.zipCode = zipCode;
          this.dateOfBirth = dateOfBirth;
          this.county = county; 
    }
   
   public String getFirstName() {
        return firstName;
    }

 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    public String getLastName() {
        return lastName;
    }

   
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
   
    public String getUsername() {
        return username;
    }

 
    public void setUsername(String userName) {
        this.username =username;
    }
    
    
     public String getFullName(){
        
        return firstName+ " " + lastName;
    }
     
     
        public String getEmailaddress() {
        return emailaddress;
    }

  
    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }
    
    
    
    public Integer getZipCode() {
        return zipCode;
    }
    
    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }
    
    
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    
    
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public String setCounty() {
        return county;
    }
    
    public void getCounty(String county) {
        this.county = county;
    }
    
    
}
