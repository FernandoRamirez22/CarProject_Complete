package sample;

import java.util.Date;

/**
 * @author Fernando Ramirez
 * */
public class ManufacturedEngine implements Engine {

    private String engineManufacturer;

    private Date engineManufacturedDate;

    private String engineMake;

    private String engineModel;

    private int engineCylinders;

    private String engineType;

    private String driveTrain;

    /**
     * This method is initializing variables for the constructor for objects of class Engine
     *
     * @param null
     * @return null
     *  */

    public ManufacturedEngine() {
        //initialize vehicle
        this.engineManufacturer = "Generic";
        this.engineManufacturedDate = new Date();
        this.engineMake = "Generic";
        this.engineModel = "generic";
        this.engineCylinders = 0;
        this.engineType = "85 ARI";
        this.driveTrain = "2wd: Two-Wheel Drive";
    }

    /**
     * This method Overrides constructor for objects of class Engine
     * @param String engineManufacturer,
     *Date engineManufacturerDate,
     *String engineMake,
     *String engineModel,
     *String driveTrain, int engineCylinders, String engineType
     *
     * @return null
     * */
    public ManufacturedEngine(String engineManufacturer, Date engineManufacturerDate, String engineMake, String engineModel,
                              String driveTrain, int engineCylinders, String engineType) {

        //initialize vehicle

        this.engineManufacturer = engineManufacturer;
        this.engineManufacturedDate = engineManufacturerDate;
        this.engineMake = engineMake;
        this.engineModel = engineModel;
        this.driveTrain = driveTrain;
        this.engineType = engineType;
    }

    //Declare method definitions

    public final void setEngineManufacturedDate(Date date) {
        this.engineManufacturedDate = date;
    }

    public final void setEngineManufacturer(String manufacturer) {
        this.engineManufacturer = manufacturer;
    }

    public void setEngineMake(String engineMake) {
        this.engineMake = engineMake;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public final void setEngineType(String fuel) {
        this.engineType = fuel;
    }

    public void setEngineCylinders(int engineCylinders) {
        this.engineCylinders = engineCylinders;
    }

    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }

    //Override the toString()

    public String toString() {
        //Print instance description

        return "Engine Manufacturer : " + this.engineManufacturer + "\n" +
                "Engine Manufactured : " + this.engineManufacturedDate.toString() + "\n" +
                "Engine Make : " + this.engineMake + "\n" +
                "Engine Model : " + this.engineModel + "\n" +
                "Engine Type : " + this.engineType + "\n" +
                "Engine Cylinders : " + this.engineCylinders + "\n" +
                "Drive Train : " + this.driveTrain;
    }
}
