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
小于号 什么意思 hashmap 建key  value 对立起来；声明hashmap的对象/实例
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
   继承object，所有类都是o的子类patient也是子类 
    public String toString() {
        return personInfo.getName();
    }
tostring 为什么 对每个java类操作，是个java类的操作，转换为字符串
   
   public String showInoculateInfo()
    {
        if(InoculateRecord!=null)
        {
            return InoculateRecord.toString();
        }

        return "";
！什么意思 非的意思 is not的意思 反的意思
   解释一下这段代码 显示疫苗信息
return的这个是什么  deflult操作 默认操作；没有被if被过滤的， 输出了什么都没有 空字符串
   为什么用这个？查出来就。。。查不出来就。。。
    }
}
