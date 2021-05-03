package InventoryManagement;


public class TestVaccineFactory {


    public static void main(String[] args) {

        VaccineFactory vaccineFactory=new VaccineFactory();
        // Add three vaccines
        vaccineFactory.addVaccines("WuHan","WuSheng",1);
        vaccineFactory.addVaccines("WuHan","WuSheng",1);
        vaccineFactory.addVaccines("WuHan","WuSheng",1);

        System.out.println(Storage.instanceStore.vaccineList.size());

        //reduce

    }
}
