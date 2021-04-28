package AuthenID;

import StockControl.Vaccine;

import java.util.HashMap;

public class Patient {
    People personInfo;
    String PatientNo;
    Boolean isInoculate;
    HashMap<Vaccine,String> InoculateRecord;

    public Patient(People personInfo, Boolean isInoculate) {
        this.personInfo = personInfo;
        this.isInoculate = isInoculate;
    }


    public String getPatientNo() {
        return PatientNo;
    }

    public void setPatientNo(String patientNo) {
        PatientNo = patientNo;
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
}
