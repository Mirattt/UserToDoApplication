package ict.kosovo.growth.administring;

import ict.kosovo.growth.helpers.ApplicationSession;
import ict.kosovo.growth.helpers.GenericHelper;
import ict.kosovo.growth.usertodoapplication.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class LoginController {

    @FXML
   private TextField tfUsername;

    @FXML
    private PasswordField pfPassword;


    public void login(ActionEvent event) {
        String username = tfUsername.getText();
        String password = pfPassword.getText();

        if (username.isBlank() || username.isEmpty()) {

            GenericHelper.createAndShowAlert(Alert.AlertType.WARNING,"Missing information","Username cannot be blank");
    //        Alert alert = new Alert(Alert.AlertType.WARNING);
    //        alert.setTitle("Missing information");
    //        alert.setContentText("Username cannot be blank or empty!");
    //        alert.show();
            tfUsername.requestFocus(); //kontrol eder
            return;

        }

        if (password.isBlank() || password.isEmpty()) {

            GenericHelper.createAndShowAlert(Alert.AlertType.WARNING,"Missing information","Password cannot be blank");
    //        Alert alert = new Alert(Alert.AlertType.WARNING);
    //        alert.setTitle("Missing information");
    //        alert.setContentText("Password cannot be blank or empty!");
    //        alert.show();
            pfPassword.requestFocus(); //kontrol eder
            return;

        }

        if (username.equals(password)) {
            ApplicationSession.username = username;
        //hape main page
  //          try {
  //*              Parent root = FXMLLoader.load(HelloApplication.class.getResource("main-view.fxml"));
      //          Scene scene = new Scene(root);
    //            Stage mainStage = new Stage(StageStyle.DECORATED);
  //              mainStage.setScene(scene);
  //              mainStage.setTitle("Akpınar Bilişim");
   //             mainStage.setMaximized(true);


               // mainStage.show();

         //   } catch (IOException e) {
           //     System.out.println(e.getMessage());
             //   e.printStackTrace();
           // }

            Node btnLogin = (Node) event.getSource();
            btnLogin.getScene().getWindow().hide();
            GenericHelper.loadMainForm("main-view.fxml","Akpınar Bilişim",true);

        }
        else {
            GenericHelper.createAndShowAlert(Alert.AlertType.WARNING,"Missmatch information","Username or password wrong");
        }
    }
}
