package AuthenID;

import StockControl.Vaccine;

import java.util.HashMap;

public class Patient {
   private People personInfo;
   private String PatientNo;
   private Boolean isInoculate;

   private HashMap<Patient,HashMap<Vaccine,String>> InoculateRecord;

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

    public HashMap<Patient, HashMap<Vaccine, String>> getInoculateRecord() {
        return InoculateRecord;
    }

    public void setInoculateRecord(HashMap<Patient, HashMap<Vaccine, String>> inoculateRecord) {
        InoculateRecord = inoculateRecord;
    }
    public void upsertInoculateRecord(Patient patient, HashMap<Vaccine, String> map) {
        if(InoculateRecord==null) {
            InoculateRecord = new HashMap<>();
            InoculateRecord.put(patient, map);
        }
        else
        {
            InoculateRecord.put(patient,map);
        }

        System.out.println(patient.getPersonInfo().getName()+" Inoculate successful!");
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
