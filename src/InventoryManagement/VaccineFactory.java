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

    public void addVaccines(String vname,String vmanu)
    {
        vaccines.add(new Vaccine(vname,vmanu));
    }

    public void consumeVaccines(String vname,String vmanu)
    {
     for(Vaccine inst:vaccines)
     {
         if(inst.getName().equals(vname)&&inst.getManufacture().equals(vmanu))
         {
             vaccines.remove(inst);
             break;
         }
     }

    }

    public Boolean queryVaccines(String vname,String vmanu)
    {
        for(Vaccine inst:vaccines)
        {
            if(inst.getName().equals(vname)&&inst.getManufacture().equals(vmanu))
            {
               return true;
            }
        }
        return false;
    }


    public int getNumberVacc()
    {
        return vaccines.size();
    }

    public int countByVname(String  vname)
    {
        int num=0;
        for(Vaccine vac:vaccines)
        {
           if((vname.equalsIgnoreCase(vac.getName())))
           {
               num++;
           }
        }

        return num;
    }

    public void addBatch(String vname,String vmanu,int num)
    {
        for (int i=0;i<num;i++)
        {
            vaccines.add(new Vaccine(vname,vmanu));
        }
    }
}
