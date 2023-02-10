import java.util.Date;
import java.util.ArrayList;

public class AdminUser extends User implements HIPAACompliantAdmin, HIPAACompliantUser {
    // ... imports class definition...

    // TO DO: Implement a constructor that takes an ID and a role

    // Inside class:
    // private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;

    public AdminUser(Integer id, String role) {
        super(id);
        this.role = role;
        // TODO Auto-generated constructor stub
    }

    public void newIncident(String notes) {
        String report = String.format(
                "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n",
                new Date(), this.id, notes);
        securityIncidents.add(report);
    }

    public void authIncident() {
        String report = String.format(
                "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n",
                new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER");
        securityIncidents.add(report);
    }

    // getters and setters
    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ArrayList<String> getSecurityIncidents() {
        return this.securityIncidents;
    }

    public void setSecurityIncidents(ArrayList<String> securityIncidents) {
        this.securityIncidents = securityIncidents;
    }

    @Override
    public boolean assignPin(int pin) {
        // TODO Auto-generated method stub
        int pinLen = Integer.toString(pin).length();

        return pinLen == 6;

    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        // TODO Auto-generated method stub
        if (this.id == confirmedAuthID) {
            return true;
        }
        return false;
    }

    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    @Override
    public ArrayList<String> reportSecurityIncidents() {
        // TODO Auto-generated method stub
        return null;
    }

    // TO DO: Setters & Getters

}
