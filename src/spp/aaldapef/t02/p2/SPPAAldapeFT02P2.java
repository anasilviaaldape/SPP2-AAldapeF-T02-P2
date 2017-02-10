package spp.aaldapef.t02.p2;
import java.util.Scanner;

public class SPPAAldapeFT02P2 { 
    
    public static void main(String[] args) {
        //Ana Silvia Aldape Felizardo
        //A01410367
        //IIS
        Scanner kb = new Scanner (System.in);
        int valinf, valsup;
        double res;
        
        System.out.println("Porfavor introduzca un numero entero inferior");
        valinf = kb.nextInt();
        System.out.println("Porfavor introduzca un numero entero superior");
        valsup = kb.nextInt();
        
        do {
            valinf ++;
            
            res = valinf % 2;
            if (res > 0 || res < 0){
                System.out.println(valinf + " no es divisible entre 2");
            }
            else {
                System.out.println(valinf + " es divisible entre 2");
            }
            
            res = valinf % 3;
            if (res > 0 || res < 0){
                System.out.println(valinf + " no es divisible entre 3");
            }
            else {
                System.out.println(valinf + " es divisible entre 3");
            }
            
            res = valinf % 5;
            if (res > 0 || res < 0){
                System.out.println(valinf + " no es divisible entre 5");
                
            }
            else {
                System.out.println(valinf + " es divisible entre 5");
            }
        }
        while(valinf < valsup);
    }
}