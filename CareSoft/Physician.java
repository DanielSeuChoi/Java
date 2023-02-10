import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
    // ... imports class definition...

    // Inside class:
    private ArrayList<String> patientNotes;

    // TO DO: Constructor that takes an ID
    public Physician(Integer id) {
        super(id);
    }

    // getters and setters
    public ArrayList<String> getPatientNotes() {
        return this.patientNotes;
    }

    public void setPatientNotes(ArrayList<String> patientNotes) {
        this.patientNotes = patientNotes;
    }

    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
                "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

    // TO DO: Implement HIPAACompliantUser!
    @Override
    public boolean assignPin(int pin) {
        int numlen = Integer.toString(pin).length();
        System.out.println(numlen == 4);
        // if (numlen == 4) { // This is a redundant method.
        // return true;
        // } else
        // return false;
        return numlen == 4; // already self implied that 4 is true;
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        // TODO Auto-generated method stub
        System.out.printf("Confirm id is : %s %n", confirmedAuthID);
        System.out.println("This .id :" + this.id);
        if (this.id == confirmedAuthID) {
            return true;
        }
        return false;
    }

    // TO DO: Setters & Getters

}
