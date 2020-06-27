package step2;

import java.util.HashSet;
import java.util.Set;

public class DealershipTest {
    static Dealership dealership = new Dealership();

    public static void main(String[] args){
        do{
            try{

                String menu = "Enter one of the following options: \n"+
                        "1 - Add a make \n"+
                        "2 - Add a new car \n" +
                        "3 - Remove a specific car \n" +
                        "4 - Display car details for a specific make \n" +
                        "5 - Display all make and car details for the dealership \n" +
                        "6 - Quit \n" +
                        ">>";

                int option = Input.getInteger(menu);

                switch(option){

                    case 1:

                        String makeName = Input.getString("Enter Make name: ");
                        Make make = new Make(makeName);

                        if(!dealership.findMakeName(makeName)){

                            dealership.addMake(make);
                            System.out.println("Make has been added.");

                        }
                        else{
                            System.out.println("Make already exists.");
                        }
                        break;

                    case 2:

                        makeName = Input.getString("Enter Make name: ");

                        if(dealership.findMakeName(makeName)){
                            Make make1 = dealership.getMakeName(makeName);

                            String regNo = Input.getRegNo("Enter registration number: ");
                            if(!dealership.getCarByRegNo(regNo)){
                                String model = Input.getString("Enter model: ");
                                String colour = Input.getString("Enter colour: ");

                                Car car = new Car(regNo, model, colour);

                                make1.addCar(car);

                                System.out.println("Car has been added.");
                            }
                            else{
                                System.out.println("This registration number is already exist, enter a new one please. ");
                            }

                        }
                        else{
                            System.out.println("There is no such make within the dealership.");
                        }
                        break;

                    case 3:
                        String regNo = Input.getRegNo("Enter car's registration number: ");

                        if(dealership.getCar().getCarRegNo(regNo)!=null){
                            System.out.println("The following car has been removed: \n"+"Make: "+dealership.getCar().getMakeName()+"\n"+dealership.getCar().getCarRegNo(regNo));
                            dealership.getCar().removeCar(regNo);

                        }
                        else{
                            System.out.println("There is no such car with this registration number.");
                        }

                        break;

                    case 4:

                        if(dealership.getCar()!=null){
                            makeName = Input.getString("Enter Make name: ");
                            if(dealership.findMakeName(makeName)){
                                System.out.println("");
                                Make make2 = dealership.getMakeName(makeName);
                                make2.displayCar();
                            }
                            else{
                                System.out.println("There is no such make within the dealership.");
                            }
                        }
                        else{
                            System.out.println("There is no car within the dealership.");
                        }

                        break;

                    case 5:
                        if(dealership.getCar()!=null && dealership.isCarRegNo()){
                            dealership.displayAll();
                        }
                        else{
                            System.out.println("There is no car within the dealership.");
                        }
                        break;

                    case 6:

                        Set<String> answers = new HashSet<String>();
                        answers.add("y");
                        answers.add("Y");

                        String answer= Input.getString("Quit? (y/n)");
                        if (answers.contains(answer)){
                            System.exit(0);
                        }

                    default:
                        System.out.println("If you wish to continue, then enter the right menu option. ");
                }
            }
            catch(Exception e){
                System.out.println("If you wish to continue, then enter the right menu option. ");
            }
        }
        while(Repeat.repeat());
    }
}
