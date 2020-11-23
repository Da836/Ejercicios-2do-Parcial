import java.util.Scanner;

public class usodefor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Tabla de Multiplicar");
        System.out.println("--------------------------------------");
        System.out.println("Introduzca un numero: ");
        n = sc.nextInt();
        System.out.println("\nTabla del " + n);
        for(int i = 1; i<=12; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }

        Scanner entrada = new Scanner(System.in);
        System.out.println("\nPrograma de registro de nombres");
        System.out.println("--------------------------------------");
        String nombre[] = new String[6];
        int edad[] = new int[6];

        for (int x = 0; x < 6; x++) {
            System.out.println("Escriba su nombre: ");
            nombre[x] = entrada.nextLine();

            System.out.println("Ingrese su edad: ");
            edad[x] = entrada.nextInt();
            entrada.nextLine();
        }

        for(int y = 0; y < 6; y++) {
            System.out.println("Su nombre "+ y +" es " + nombre[y] +" y su edad es " + edad[y]);
        }
    }
}
