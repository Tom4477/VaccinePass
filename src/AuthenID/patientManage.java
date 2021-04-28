package AuthenID;

import StockControl.Vaccine;

import java.util.ArrayList;

public class patientManage {
    ArrayList<Patient> wait_queue;
    ArrayList<Patient> render_queue;


    public patientManage() {
        wait_queue = new ArrayList<>();
        render_queue= new ArrayList<>();
    }

    public void addPatient(People person)
    {
       Patient tmp=new Patient(person,false);
       tmp.setPatientNo(person.number+person.name);
       wait_queue.add(tmp);
    }

    public void inocute(Patient patient,Vaccine vaccine)
    {
        patient.getInoculateRecord().put(vaccine,System.currentTimeMillis()+"");
        patient.setInoculate(true);
        render_queue.add(patient);
    }
}
