package AuthenID;

import InventoryManagement.Vaccine;
import InventoryManagement.VaccineFactory;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static Storage.instanceStore.wait_queue;
import static Storage.instanceStore.render_queue;

public class patientManage {
    VaccineFactory vaccineFactory;


    public patientManage() {
        wait_queue = new ArrayList<>();
        render_queue= new ArrayList<>();
        vaccineFactory=new VaccineFactory();
    }

    public void addPatient(People person)
    {
       Patient tmp=new Patient(person);
       wait_queue.add(tmp);
    }

    public void inocute(Patient patient, Vaccine vaccine)
    {
        patient.upsertInoculateRecord(vaccine,genNowDateStamp());
        patient.setInoculate(true);
        vaccineFactory.consumeVaccines(vaccine.getName(),vaccine.getManufacture(),vaccine.getStage());
        render_queue.add(patient);
        System.out.println("[Message from CDC] "+patient.getPersonInfo().getName()+" Inoculate successful!");
    }
    public String genNowDateStamp()
    {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        Date date= new Date(System.currentTimeMillis());
        return simpleDateFormat.format(date);
    }
}
