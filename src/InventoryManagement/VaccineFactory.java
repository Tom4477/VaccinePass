package InventoryManagement;

import java.util.HashMap;

import static Storage.instanceStore.vaccineList;

public class VaccineFactory {

    public VaccineFactory()
    {
       vaccineList= new HashMap<>();
    }

    public void addVaccines(String vname,String vmanu,int vstage)
    {
        Vaccine instance=new Vaccine(vname,vmanu,vstage);

        if(vaccineList.keySet().contains(instance))
        {
            int amt=vaccineList.get(instance);
            vaccineList.replace(instance,amt+1);
        }
        else
            vaccineList.put(instance,1);
    }

    public void consumeVaccines(Vaccine vaccine)
    {
       if (vaccineList.keySet().contains(vaccine))
        {
            int amt=vaccineList.get(vaccine);
            vaccineList.replace(vaccine,amt-1);
        }
       else
       {
           System.out.println("Not Enough vaccine");
          // return;
       }

    }

    public Boolean queryVaccines(String vname,String vmanu,int vstage)
    {
        Vaccine instance=new Vaccine(vname,vmanu,vstage);
//        if()
//        {
//            return true;
//        }
        return false;
    }

    public void ListAllVaccine()
    {
//        int len=vaccines.size();
//        System.out.println("+++++++++++All Vaccine List+++++++++++");
//        for(int i=0;i<len;i++)
//        {
//            System.out.println("+++++++++++New  Vaccine+++++++++++");
//            Vaccine tmp=vaccines.get(i);
//            System.out.println(tmp.toString());
//        }
    }
    public int getNumberVacc()
    {
      //  return vaccines.size();
        return 0;
    }

    public int countByVnameStage(String  vname,int stage)
    {
//        int num=0;
//        int len=vaccines.size();
//        for(int i=0;i<len;i++)
//        {
//            Vaccine tmp=vaccines.get(i);
//           if((vname.equalsIgnoreCase(tmp.getName()))&&(tmp.getStage()==stage))
//           {
//               num++;
//           }
//        }
//
//        return num;
        return 0;
    }

    public void addBatch(String vname,String vmanu,int vstage,int num)
    {
//        for (int i=0;i<num;i++)
////        {
////            Vaccine instance=new Vaccine(vname,vmanu,vstage);
////            vaccines.add(instance);
////        }
    }
}
