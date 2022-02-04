
package reto6banco;

import java.util.Scanner;

public class Utileria {

    Scanner lector = new Scanner(System.in);

    public String ingresoString(String text) {
        System.out.println(text);
        return (lector.nextLine());
    }

    public Integer ingresoInteger(String text){
        System.out.println(text);
        return (lector.nextInt());
    }
    public int ingresoInt(String text) {
        System.out.println(text);
        return (lector.nextInt());
    }
        public String ingresoOtroString(String text) {
        System.out.println(text);
        return (lector.nextLine());
    }

    public double ingresoDouble(String text){
        System.out.println(text);
        return(lector.nextDouble());
    }
    
        public double ingresoLong(String text){
        System.out.println(text);
        return(lector.nextLong());
    }
}
