package sample;

public class VehicleFrame implements Chassis {

    private String vehicleFrameType;

    public VehicleFrame() {

        this.vehicleFrameType = "Unibody";
    }
    //Overloaded constructor for objects of class VehicleFrame

    public VehicleFrame(String vehicleFrameType) {
        this.vehicleFrameType = vehicleFrameType;
    }

    //Declare method definitions
    public Chassis getChassisType() {
        return this;
    }

    public void setChassisType(String vehicleFrameType) {
        this.vehicleFrameType = vehicleFrameType;
    }

    //Override the toString method
    public String toString() {
        //Print instance descriptions
        return "Chassis    :  " + Chassis.chassis + "\n" +
                "vehicle Frame : " + this.vehicleFrameType;
    }

    //Test cases for the class instance

}
