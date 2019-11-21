package sample;

import java.util.Date;

public final class Car extends Vehicle {

    //Declare local variables
    private Feature[] feature = new Feature[10];
    private int carAxle;

    //Constructor for objects of class Vehicle

    public Car() {
        //initialize vehicle
        super();

        // This sets the features and axle
        Feature[] f = {new InteriorFeature("No Interior Features"),
                new ExteriorFeature("No Exterior Features")};
        this.feature = f;
        this.carAxle = 2;
    }

    //Constructor for objects of class Vehicle

    public Car(String vehicleManufacturer,
               Date vehicleManufactureDate,
               String vehicleMake,
               String vehicleModel,
               String vehicleType,
               Chassis vehicleFrame,
               Engine vehicleEngine,
               Feature[] feature,
               int carAxle) {


        //Initialize vehicle
        super(vehicleManufacturer, vehicleManufactureDate,
                vehicleMake, vehicleModel, vehicleType, vehicleFrame, vehicleEngine);

        this.feature = feature;
        this.carAxle = carAxle;
    }

    //Declare local get list for getExteriorFeatures
    public String getExteriorFeatures() {

        //Declaring local variables for comma separated list
        String list = "";
        //Read the features into a comma separated list
        for (int i = 0; i < this.feature.length; i++) {
            if (this.feature[i] instanceof ExteriorFeature) {
                if (list.length() == 0) {
                    list += this.feature[i];
                } else list += "\n            :"
                        + this.feature[i];
            }
        }
        //Return tokenized string

        return list;
    }

    //Declare local get list for InteriorFeatures
    public String getInteriorFeatures() {
        //Declare local variable for comma separated list
        String list = "";
        // Read the features into a comma separated list.
        for (int i = 0; i < this.feature.length; i++) {
            if (this.feature[i] instanceof InteriorFeature) {
                if (list.length() == 0) {
                    list += this.feature[i];
                } else {
                    list += "\n        :" + this.feature[i];
                }
            }
        }


        // Return tokenized string.

        return list;
    }


    /*    *  Override the toString() method.    */
    public String toString() {
        // Declare local variable for comma separated list.
        String list = "";
        // Read the features into a comma separated list.
        for (int i = 0; i < this.feature.length; i++) {
            if (list.length() == 0) {
                list += this.feature[i];
            } else {
                list += "\n     :"
                        + this.feature[i];
            }
        }

        //Print instance description
        return super.toString() + "\n" +
                "Features      :" + list + "\n" + "Car Axle      : " + carAxle;
    }
}





