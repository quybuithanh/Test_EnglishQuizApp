package com.mycompany.prj1jvfx;

import com.btq.utils.MyAlert;
import com.btq.utils.Themes.DarkFactory;
import com.btq.utils.Themes.ThemeManager;
import com.btq.utils.Themes.ThemeTypes;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;


public class PrimaryController implements Initializable{
    @FXML private ComboBox<ThemeTypes> cbThemes;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(ThemeTypes.values()));
    }
    
    public void manageQuestions(ActionEvent e){
        MyAlert.getInstance().showAlert("Comming soon...");
    }
    
    public void practice(ActionEvent e){
        MyAlert.getInstance().showAlert("Comming soon1...");
    }
    
    public void exam(ActionEvent e){
        MyAlert.getInstance().showAlert("Comming soon2...");
    }

    public void changeTheme(ActionEvent e){
        this.cbThemes.getSelectionModel().getSelectedItem().updateTheme(this.cbThemes.getScene());
    }
}
