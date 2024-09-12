import java.util.Scanner;
public class saludo {
public static void main(String[] args) {
    String Nombre;
    Scanner sc=new Scanner (System.in);
    System.out.println("Dime tu nombre");
        Nombre=sc.nextLine();
        System.out.println("Bienvenido es un gusto saludarte " + Nombre); 
}   
}
