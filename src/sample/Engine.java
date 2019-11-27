package sample;

import java.util.Date;

/**
 * @author Fernando Ramirez
 * */
public interface Engine {

    public void setEngineCylinders(int engineCylinders);

    public void setEngineManufacturedDate(Date date);

    public void setEngineManufacturer(String engineManufacturer);

    public void setEngineMake(String engineMake);

    public void setEngineModel(String engineModel);

    public void setDriveTrain(String driveTrain);

    public void setEngineType(String fuel);


}