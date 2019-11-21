package sample;

public class VehicleChassis implements Chassis {  //Instructions say declare public but error appears


    private String chassisName;

    public VehicleChassis() {
        this.chassisName = Chassis.chassis;
    }

    //Overloaded constructor
    public VehicleChassis(String chassisName) {
        this.chassisName = chassisName;
    }

    //Fix end bracket
    public Chassis getChassisType() {
        this.chassisName = chassis;
        return getChassisType();
    }

    //Implementing interface methods
    public void setChassisType(String VehicleChassis) {
        this.chassisName = VehicleChassis;
    }

    //Now override the toString() method
    public String toString() {
        return "Chassis Name  : " + this.chassisName;
    }

}








