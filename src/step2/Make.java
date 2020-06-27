package step2;

import java.util.ArrayList;

public class Make {
    private String makeName;
    private ArrayList<Car> cars = new ArrayList<Car>();

    public Make(String makeName, ArrayList<Car> cars) {
        this.makeName = makeName;
        this.cars = cars;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }
    public Make(String makeName) {
        this.makeName = makeName;
    }

    public String getMakeName() {
        return makeName;
    }

    public void setMakeName(String makeName) {
        this.makeName = makeName;
    }

    @Override
    public String toString(){
        return "Make: "+makeName+"\n";
    }

    public void addCar(Car car){

        cars.add(car);
    }

    public void displayCar(){

        for(Car car: cars){
            System.out.println(car);
        }
    }

    public Car getCarRegNo(String regNo){
        int i = 0;
        while (cars.size() > i) {
            if (cars.get(i).getRegNo().equalsIgnoreCase(regNo)) {
                return cars.get(i);
            }
            i++;
        }
        return null;
    }

    public boolean isCarRegNo(){
        int i = 0;
        while (cars.size() > i) {
            if (cars.get(i).getRegNo()!=null) {
                return true;
            }
            i++;
        }
        return false;
    }

    public boolean getCarByRegNo(String regNo){
        for(Car car:cars){
            if(car.getCarByRegNo(regNo)){
                return true;
            }
        }
        return false;
    }

    public void removeCar(String regNo){
        this.cars.remove(getCarRegNo(regNo));
    }


}
