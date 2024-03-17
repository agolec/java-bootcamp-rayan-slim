package model;

import java.util.ArrayList;

public class EnumsPt2CarDealership {
    private ArrayList<Enumsp2Car> cars;

    EnumsPt2CarDealership(){
        this.cars = new ArrayList<Enumsp2Car>();
    }
    public Enumsp2Car getCar(int index){
        return new Enumsp2Car(this.cars.get(index));
    }
    public void setCar(Enumsp2Car car,int index){
        this.cars.set(index,new Enumsp2Car(car));
    }
    public void addCar(Enumsp2Car car){
        this.cars.add(new Enumsp2Car(car));
    }
}