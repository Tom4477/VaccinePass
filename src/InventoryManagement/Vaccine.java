package InventoryManagement;

public class Vaccine {
    private String name;
    private String manufacture;
    private String vaccineSerNum;
    private String instruct;

    public Vaccine(String name, String manufacture) {
        this.name=name;
        this.manufacture=manufacture;
    }

    public Vaccine(String vaccineSerNum) {
        this.vaccineSerNum = vaccineSerNum;
    }

    public String getVaccineSerNum() {
        return vaccineSerNum;
    }

    public void setVaccineSerNum(String vaccineSerNum) {
        this.vaccineSerNum = vaccineSerNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getInstruct() {
        return instruct;
    }

    public void setInstruct(String instruct) {
        this.instruct = instruct;
    }



    @Override
    public String toString() {
        return "\nVaccine name is "+name+" , manufacture is "+manufacture;
    }
}
