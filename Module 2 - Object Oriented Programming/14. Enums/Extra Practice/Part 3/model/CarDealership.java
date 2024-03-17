package model;

import java.util.ArrayList;

public class CarDealership {
    private ArrayList<EnumPt3ModelCar> enumsPt1Cars;

    public CarDealership() {
        enumsPt1Cars = new ArrayList<>();
    }

    public EnumPt3ModelCar getCar(int index) {
        EnumPt3ModelCar enumsPt3Car = enumsPt1Cars.get(index);
        return new EnumPt3ModelCar(enumsPt3Car);
    }

    public void setCar(EnumPt3ModelCar enumsPt3Car, int index) {
        enumsPt1Cars.set(index, new EnumPt3ModelCar(enumsPt3Car));
    }

    public void addCar(EnumPt3ModelCar enumsPt3Car) {
        enumsPt1Cars.add(new EnumPt3ModelCar(enumsPt3Car));
    }
}
