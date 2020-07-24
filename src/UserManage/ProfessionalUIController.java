/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserManage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Bingnan Dong
 */
public class ProfessionalUIController implements Initializable {
 @FXML private Label  helloTxt;
    @FXML private Label Status;
    private  static User loginUser;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
        /**
     * Set the login user
     */
    public void userSet(User user){
        this.loginUser = user;
    }
    
}
