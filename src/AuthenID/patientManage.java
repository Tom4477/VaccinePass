package AuthenID;

import InventoryManagement.Vaccine;
import InventoryManagement.VaccineOperation;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
        Date date= new Date(System.currentTimeMillis());

        patient.upsertInoculateRecord(vaccine,simpleDateFormat.format(date));
        patient.setInoculate(true);
        render_queue.add(patient);
        System.out.println("[Message from CDC] "+patient.getPersonInfo().getName()+" Inoculate successful!");
    }
}
