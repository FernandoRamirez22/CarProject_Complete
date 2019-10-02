package sample;

public abstract class VehicleChassis implements Chassis {  //Instructions say declare public but error appears


    private String chassisName;

    public VehicleChassis() {
        this.chassisName = Chassis.chassis;
    }

    public VehicleChassis(String chassisName) {
        this.chassisName = chassisName;
    }

    //Implementing interface methods
    public void setChassisType(String VehicleChassis) {
        this.chassisName = VehicleChassis;
    }

    //Now override the toString() method
    public String toString() {
        return "Chassis Name  : " + this.chassisName;
    }

    public static void main(String[] args) {

        //test the default constructor
        System.out.println("--------------------------");
    }

    VehicleChassis vc1 = new VehicleChassis() {
        System.out.println(vc1);

        //Test the overload constructor and print instance attributes
    System.out.println("-----------------------------------");

        VehicleChassis vc2 = new VehicleChassis("Test Chassis");
    System.out.println(vc2);
    System.out.println("---------------------------------");
    }

}


}
