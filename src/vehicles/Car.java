package vehicles;

public class Car extends AutomotiveVehicle{

    String make;
    String model;
    String type;
    String color;

    public  Car(String Carmake, String Carmodel,String Cartype){
        make = Carmake;
        model = Carmodel;
        type = Cartype;
    }
    public Car(String Carmake){
        make = Carmake;
//        model = "Unassigned";
//        type = "Unassigned";
    }

    public Car(String Carmake,String Carmodel){
        make = "Unassigned";
        model = Carmodel;
    }

    public String getCarinfo(){
        return String.format("make: %s,model: %s, type: %s",make,model,type);
    }


}

