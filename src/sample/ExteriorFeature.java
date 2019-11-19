package sample;

public class ExteriorFeature implements Feature {

    //Declare local variables
    private String exteriorFeature;

    //Default constructor for exteriorFeature
    public ExteriorFeature() {
        this.exteriorFeature = "Generic";
    }

    public ExteriorFeature(String exteriorFeature) {
        this.exteriorFeature = exteriorFeature;
    }

    //Implement method definitions

    public String getFeature() {
        return this.exteriorFeature;
    }

    public void setFeature(String feature) {
        this.exteriorFeature = feature;
    }

    //Override the toString() method
    public String toString() {
        return "Exterior [" + this.exteriorFeature + "]";
    }
}
