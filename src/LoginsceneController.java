
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class LoginsceneController implements Initializable {

    @FXML private Label label1;
    @FXML private TextField textfield1;
    @FXML private PasswordField passfield1;
    @FXML private Button button1;

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loginButtonOnClick(ActionEvent event) {
        String x,y;
        x = textfield1.getText();
        y = passfield1.getText();
    }
    
}
