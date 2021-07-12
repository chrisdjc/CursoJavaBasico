import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response = 0;
        do {
            System.out.println("Selecciona el número de la opción deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 0:
                    System.out.println("GRACIAS POR VISITARNOS");
                    break;
                case 1:
                    System.out.println("MOVIES");
                    break;
                case 2:
                    System.out.println("SERIES");
                    break;
                default:
                    System.out.println("SELECCIONA UNA OPCIÓN DE LA LISTA");

            }
        }while (response !=0);
        System.out.println("SE TERMINÓ EL PROGRAMA");
    }
}
