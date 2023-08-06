
import java.util.logging.Logger;


public class MaintainanceOfficer extends Officer {
    
  private String Officer_type;

    public void setOfficer_type(String Officer_type) {
        this.Officer_type = Officer_type;
    }

    public String getOfficer_type() {
        return Officer_type;
    }
    private static final Logger LOG = Logger.getLogger(MaintainanceOfficer.class.getName());

    public MaintainanceOfficer(String Officer_type, String name, int User_ID, String User_Password, String Email) {
        super(name, User_ID, User_Password, Email);
        this.Officer_type = Officer_type;
    }
    
 public void Giveclearancetostart(){
        
    }
 public void Createinspectionreport(){
     
 }
 public void Requestformaintenance(){
     
 }
 public void Informcaptainaboutenginefailure(){
     
 }
 public void ViewRequestforchangingshifts(){
     
 }
 public void Makecriticalannouncement(){
     
 }
 private void Requestforleave(){
     
 }
 public void Generatemaintenancereport(){
     
 }

}
