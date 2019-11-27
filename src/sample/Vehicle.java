package sample;

import java.util.Date;

/**
* @author Fernando Ramirez
* */
public class Vehicle implements Engine, Chassis {

    Date vehicleManufacturedDate;
    String vehicleManufacturer;
    String vehicleMake;
    String vehicleModel;
    Chassis vehicleFrame;
    String vehicleType;
    String driveTrain;
    Engine vehicleEngine;

    /**
     * This method is initializing "Vehicle"
     * */
    public Vehicle() {
        //Initialize Vehicle
        this.vehicleManufacturedDate = new Date();
        this.vehicleManufacturer = "Generic";
        this.vehicleMake = "Generic";
        this.vehicleType = "None";
        this.vehicleModel = "Generic";
        this.vehicleFrame = new VehicleFrame();
        this.vehicleEngine = new ManufacturedEngine();
        this.vehicleEngine.setEngineType("88 AKI");
        this.vehicleEngine.setDriveTrain("2WD: Two-Wheel Drive");
    }
//Constructor for objects of class Vehicle

    public Vehicle(String vehicleManufacturer,
                   Date vehicleManufacturedDate,
                   String vehicleMake,
                   String vehicleModel,
                   String vehicleType,
                   Chassis vehicleFrame,
                   Engine engine) {

        //Initialize vehicle
        this.vehicleManufacturer = vehicleManufacturer;
        this.vehicleManufacturedDate = vehicleManufacturedDate;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleFrame = vehicleFrame;
        this.vehicleEngine = engine;
    }

    @Override
    public void setEngineCylinders(int engineCylinders) {
        vehicleEngine.setEngineCylinders(engineCylinders);
    }

    @Override
    public void setEngineManufacturedDate(Date date) {
        vehicleEngine.setEngineManufacturedDate(date);
    }

    @Override
    public void setEngineManufacturer(String manufacturer) {
        this.vehicleManufacturer = manufacturer;
    }

    @Override
    public void setEngineMake(String engineMake) {
        this.vehicleEngine.setEngineMake(engineMake);
    }

    @Override
    public void setEngineModel(String engineModel) {
        this.vehicleEngine.setEngineModel(engineModel);
    }

    @Override
    public void setDriveTrain(String driveTrain) {
        this.vehicleEngine.setDriveTrain(driveTrain);
    }

    @Override
    public void setEngineType(String fuel) {
        this.vehicleEngine.setEngineType(fuel);
    }

    @Override
    public Chassis getChassisType() {
        return vehicleFrame;
    }

    @Override
    public void setChassisType(String vehicleChassis) {
        this.vehicleFrame.setChassisType(vehicleChassis);
    }

    public String toString() {
        // Print instance description.
        return "Manufacturer Name   : " + this.vehicleManufacturer + "\n" +
                "Manufactured Date   : " + this.vehicleManufacturedDate.toString() + "\n" +
                "Vehicle Make        : " + this.vehicleMake + "\n" +
                "Vehicle Model       : " + this.vehicleModel + "\n" +
                "Vehicle Type        : " + this.vehicleType + "\n" +
                vehicleEngine.toString();
    }


}
