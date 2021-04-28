package AuthenID;

import StockControl.Vaccine;

import java.util.ArrayList;

public class patientManage {
    ArrayList<Patient> patients;

    public patientManage() {
        patients = new ArrayList<>();
    }

    public void addPatient(People person)
    {
       Patient tmp=new Patient(person,false);
       tmp.setPatientNo(person.number+person.name);
       patients.add(tmp);
    }

    public void inocute(Patient patient,Vaccine vaccine)
    {
        patient.getInoculateRecord().put(vaccine,System.currentTimeMillis()+"");
        patient.setInoculate(true);
    }
}
