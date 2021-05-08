package AuthenID;

import InventoryManagement.Vaccine;

import java.util.HashMap;

public class Patient {
   private People personInfo;
   private String PatientNo;
   private Boolean isInoculate;

   private HashMap<Vaccine,String> InoculateRecord;

    public Patient(People personInfo) {
        this.personInfo = personInfo;
        init();
    }

    private void init()
    {
        setPatientNo();
        setInoculate(false);
    }

    public String getPatientNo() {
        return PatientNo;
    }

    public void setPatientNo() {
        PatientNo = personInfo.getNumber();
    }

    public People getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(People personInfo) {
        this.personInfo = personInfo;
    }

    public Boolean getInoculate() {
        return isInoculate;
    }

    public void setInoculate(Boolean inoculate) {
        isInoculate = inoculate;
    }

    public HashMap<Vaccine, String> getInoculateRecord() {
        return InoculateRecord;
    }

    public void setInoculateRecord(HashMap<Vaccine, String> inoculateRecord) {
        InoculateRecord = inoculateRecord;
    }

    public void upsertInoculateRecord(Vaccine vaccine, String timeStamp) {
        if(InoculateRecord==null) {
            InoculateRecord = new HashMap<>();
            InoculateRecord.put(vaccine,timeStamp);
        }
        else
        {
            InoculateRecord.put(vaccine,timeStamp);
        }

    }

    @Override

    public String toString() {
        return personInfo.getName();
    }

   public String showInoculateInfo()
    {
        if(InoculateRecord!=null)
        {
            return InoculateRecord.toString();
        }

        return "";
    }
}
