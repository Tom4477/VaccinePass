package AuthenID;

import InventoryManagement.Vaccine;
import InventoryManagement.VaccineFactory;

import java.text.SimpleDateFormat;
import java.util.ArrayList; 数组
import java.util.Date;
为什么是这样，util什么意思 调用java；util是一个工具类  都是一个包  java的日期类型

import static Storage.instanceStore.wait_queue;
import static Storage.instanceStore.render_queue;
为什么是这里？ 专门存到那个里面，需要调过来，只能import 

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
tmp是什么 为什么这样加？ tmp  （temper）新增对象

    public void inocute(Patient patient, Vaccine vaccine)
    {
        patient.upsertInoculateRecord(vaccine,genNowDateStamp());
        patient.setInoculate(true);
        
        if (vanccine unavialible) 
        return 退出
        
        vaccineFactory.consumeVaccines(vaccine.getName(),vaccine.getManufacture(),vaccine.getStage());
        render_queue.add(patient);
        System.out.println("[Message from CDC] "+patient.getPersonInfo().getName()+" Inoculate successful!");
    }
没有接种成功是怎样？return
stamp什么意思:时间戳  函数命名 
    public String genNowDateStamp()
    {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        Date date= new Date(System.currentTimeMillis());
        return simpleDateFormat.format(date);
    }
}
