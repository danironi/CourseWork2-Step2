package step2;
import java.util.LinkedList;

public class Dealership {
    private int dealershipId;
    private LinkedList<Make> makes = new LinkedList<Make>();

    public void addMake(Make make){

        makes.add(make);

    }

    public boolean findMakeName(String makeName){
        int i = 0;
        while (makes.size()>i){
            if(makes.get(i).getMakeName().equalsIgnoreCase(makeName)){
                return true;
            }
            i++;
        }
        return false;
    }

    public Make getMakeName(String makeName) {
        int i = 0;
        while (makes.size() > i) {
            if (makes.get(i).getMakeName().equalsIgnoreCase(makeName)) {
                return makes.get(i);
            }
            i++;
        }
        return null;
    }

    public void displayAll(){

        for(Make make: makes){
            System.out.println(make);
            make.displayCar();
        }
    }

    public Make getCar(){
        for(Make make: makes){

            return make;
        }
        return null;
    }

    public boolean isCarRegNo(){
        for(Make make: makes){
            if(make.isCarRegNo()){
                return true;
            }
        }
        return false;
    }

    public int listSize(){
        return makes.size();
    }


    public boolean getCarByRegNo(String regNo){
        for(Make make: makes){
            if(make.getCarByRegNo(regNo)){
                return true;
            }
        }
        return false;
    }

}
