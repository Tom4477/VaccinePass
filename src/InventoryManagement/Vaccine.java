package InventoryManagement;

public class Vaccine {
    private String name;
    private String manufacture;
    private int stage;
    private String uniqueNo;
    private String instruct;

    public Vaccine(String name, String manufacture, int stage) {
        this.name = name;
        this.manufacture = manufacture;
        this.stage = stage;
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

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public String getInstruct() {
        return instruct;
    }

    public void setInstruct(String instruct) {
        this.instruct = instruct;
    }

    @Override
    public String toString() {
        return "\nVaccine name is "+name+" , manufacture is "+manufacture+" , stage is "+stage+" , "+"TimeStamp";
    }
}
