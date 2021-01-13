package WorkWithClass;

public class Phone {

    String model = "Phone";
    String number = "My number";
    int weight = 198;

    Phone (String model, String number, int weight){
        this.model = model;
        this.number = number;
        this.weight = weight;
    }

    Phone (){}

    Phone (String model) {
        this.model= model;
    }

    void receiveCall (String name){
        System.out.println(name + "Calling");
    }

    String getNumber () {
        return number;
    }
}

