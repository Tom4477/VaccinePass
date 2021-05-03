package AuthenID;

import StockControl.Vaccine;
import StockControl.VaccineOperation;

import javax.sql.DataSource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class patientManage {
    VaccineOperation vaccineOperation;
    ArrayList<Patient> wait_queue;
  public  ArrayList<Patient> render_queue;
  SimpleDateFormat simpleDateFormat=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");

    public patientManage() {
        wait_queue = new ArrayList<>();
        render_queue= new ArrayList<>();
        vaccineOperation=new VaccineOperation();
    }

    public void addPatient(People person)
    {
       Patient tmp=new Patient(person,false);
       tmp.setPatientNo(person.number+person.name);
       wait_queue.add(tmp);
    }

    public void inocute(Patient patient, Vaccine vaccine)
    {
  //      patient.getInoculateRecord().put(vaccine,System.currentTimeMillis()+"");
        Date date= new Date(System.currentTimeMillis());
       HashMap vctime= new HashMap<Patient,String>();
       vctime.put(patient,simpleDateFormat.format(date));
        patient.setInoculateRecord(vctime);
   //     vaccineOperation.consumeVaccines(vaccine);
        patient.setInoculate(true);
        render_queue.add(patient);

    }
}
