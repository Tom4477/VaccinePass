package InventoryManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import static Storage.instanceStore.vaccines;

public class VaccineFactory {

    public VaccineFactory()
    {
     vaccines=new ArrayList<>();
    }

    public void addVaccines(String vname,String vmanu,int vstage)
    {
        vaccines.add(new Vaccine(vname,vmanu,vstage));
    }

    public void consumeVaccines(String vname,String vmanu,int vstage)
    {
     for(Vaccine inst:vaccines)
     {
         if(inst.getName().equals(vname)&&inst.getManufacture().equals(vmanu)&&inst.getStage()==vstage)
         {
             vaccines.remove(inst);
             break;
         }
     }
&& 什么意思
    }

    public Boolean queryVaccines(String vname,String vmanu,int vstage)
    {
        for(Vaccine inst:vaccines)
        {
            if(inst.getName().equals(vname)&&inst.getManufacture().equals(vmanu)&&inst.getStage()==vstage)
            {
               return true;
            }
        }
        return false;
    }
    
vstage 怎么处理
解释一下这三个片段    
    
    public int getNumberVacc()
    {
        return vaccines.size();
    }

    public int countByVnameStage(String  vname,int stage)
    {
        int num=0;
        for(Vaccine vac:vaccines)
        {
           if((vname.equalsIgnoreCase(vac.getName()))&&(vac.getStage()==stage))
           {
               num++;
           }
        }

        return num;
    }
    )&&什么意思

    public void addBatch(String vname,String vmanu,int vstage,int num)
    {
        for (int i=0;i<num;i++)
        {
            vaccines.add(new Vaccine(vname,vmanu,vstage));
        }
    }
}
