package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarManager
{

    private CarDB carDb;
    private CarNames carNames;
    private CarBest carBest;

   
   // constructor
   public CarManager (CarDB carDb, CarNames carNames, CarBest carBest){
        this.carDb=carDb;
        this.carNames=carNames;
        this.carBest=carBest;
   }

    public Car getFromDb(final String carId)
    {
        // return the Cars from the DB
        return carDb.getFromDb(carId);
    }

    public String getCarsNames()
    {
       // return the car names
       return carNames.getCarsNames(carDb.getAllCars())
    }

    public Car getBestCar()
    {
        // retutn the best car
        return carBest.getBestCar(carDb.getAllCars())
    }
}
