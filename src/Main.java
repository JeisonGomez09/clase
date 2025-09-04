import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n1, n2, suma;
        int suma1 = 0;
        int suma2 = 0, cant;
        /*Scanner Dato = new Scanner(System.in);
            System.out.println("Digite el primer numero");
            n1 = Dato.nextInt();
            System.out.println("Digite el segundo numero");
            n2 = Dato.nextInt();
        suma=n1+n2;
        System.out.println("la suma de " + n1 + " + " + n2 + " es " + suma);
*/
        /*Random Aleatorio = new Random();
        n1 = Aleatorio.nextInt();
        n2 = Aleatorio.nextInt();
        suma=n1+n2;
        System.out.println("la suma de " + n1 + " + " + n2 + " es " + suma);
    */
       /*for (cant=0;cant<101;cant++) {
           Random Aleatorio = new Random();
           n1 = Aleatorio.nextInt();
           suma = n1 + suma;
           System.out.println("la suma es " + suma);
       }*/
       for (cant=0;cant<101;cant++) {
           Random Aleatorio = new Random();
           n1 = Aleatorio.nextInt(200);
           System.out.println(n1);
           if (n1%2==0) {
               suma1 = suma1 + n1;
               System.out.println(suma1);
           } else if (n1 % 2 != 0) {
               suma2 = suma2 + n1;
               System.out.println(suma2);
           }
       }
}}
