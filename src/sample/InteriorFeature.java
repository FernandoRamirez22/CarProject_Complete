package sample;

/**
 * @author Fernando Ramirez
 * */
public class InteriorFeature implements Feature {

    //Declare local Variables
    private String interiorFeature;

    public InteriorFeature() {
        this.interiorFeature = "Generic";
    }


    //Default constructor for InteriorFeature

    public InteriorFeature(String interiorFeature) {
        this.interiorFeature = interiorFeature;
    }

    //Implement method definitions

    public String getFeature() {
        return this.interiorFeature;
    }

    public void setFeature(String feature) {
        this.interiorFeature = feature;
    }

    //Override the toString() method
    public String toString() {
        return "interior [" + this.interiorFeature + "]";
    }
}
