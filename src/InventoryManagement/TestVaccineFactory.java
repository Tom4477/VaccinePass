package InventoryManagement;


public class TestVaccineFactory {


    public static void main(String[] args) {

        VaccineFactory vaccineFactory = new VaccineFactory();
        //add some quantities of Vaccine
        vaccineFactory.addBatch("AmericaVacc", "ABC", 10);
        System.out.println(vaccineFactory.getNumberVacc());
        System.out.println(vaccineFactory.countByVname("AmericaVacc"));

        // Add three vaccines
        vaccineFactory.addVaccines("WuHan", "WuSheng");
        vaccineFactory.addVaccines("WuHan", "WuSheng");
        vaccineFactory.addVaccines("WuHan", "WuSheng");
        //count
        System.out.println(vaccineFactory.getNumberVacc());

        //consume one vaccine
        vaccineFactory.consumeVaccines("WuHan", "WuSheng");
        //count
        System.out.println(vaccineFactory.getNumberVacc());

        //consume another  vaccine
        vaccineFactory.consumeVaccines("WuHan", "WuSheng");
        //count
        System.out.println(vaccineFactory.getNumberVacc());

        //query one vaccine if exist
        vaccineFactory.addVaccines("BeiJingVacc", "BeiJing");
        System.out.println(vaccineFactory.queryVaccines("BeiJingVacc", "BeiJing"));
    }
}
