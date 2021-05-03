package AuthenID;

import StockControl.Vaccine;
import StockControl.VaccineOperation;

import javax.sql.DataSource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import static Storage.instanceStore.wait_queue;
import static Storage.instanceStore.render_queue;

public class patientManage {
    VaccineOperation vaccineOperation;
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");

    public patientManage() {
        wait_queue = new ArrayList<>();
        render_queue= new ArrayList<>();
        vaccineOperation=new VaccineOperation();
    }

    public void addPatient(People person)
    {
       Patient tmp=new Patient(person);
       wait_queue.add(tmp);
    }

    public void inocute(Patient patient, Vaccine vaccine)
    {
  //      patient.getInoculateRecord().put(vaccine,System.currentTimeMillis()+"");
        Date date= new Date(System.currentTimeMillis());
         HashMap vctime= new HashMap<Vaccine,String>();
       vctime.put(vaccine,simpleDateFormat.format(date));

        patient.upsertInoculateRecord(patient,vctime);
   //     vaccineOperation.consumeVaccines(vaccine);
        patient.setInoculate(true);
        render_queue.add(patient);

    }
}
