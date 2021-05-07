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
        
&& 什么意思？与的意思 a and b   代表的什么意思？都能对上 match
    
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
    用来统计 统计所有疫苗；有一个盘点疫苗的

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
        for (int i=0;i<num;i++)   控制循环的条件：从0开始计算一直计数到num，循环维持的条件；循环变的条件  表示方向，动作 变化的条件
        {
            vaccines.add(new Vaccine(vname,vmanu,vstage));
        }
    }
}
