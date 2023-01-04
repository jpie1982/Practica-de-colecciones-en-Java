import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Auto auto1 = new Auto("Fiat","Uno",1995);
        Auto auto2 = new Auto("Ford","Fiesta",2005);
        Auto auto3 = new Auto("Bwm","Serie 1",2019);
        Auto auto4 = new Auto("Audi","A1",2022);
        Auto auto5 = new Auto("Renault","Sandero",2019);

        Set<Auto> car = new HashSet<Auto>();
        car.add(auto1);
        car.add(auto2);
        car.add(auto3);
        car.add(auto4);
        car.add(auto5);

        for (Auto auto:car){
            System.out.println("Auto: "+auto.marca()+ "\nModelo:  "+ auto.modelo()+ "\nAño:  "+auto.ano());
            System.out.println(" ");
        }

            
        }
    }
