import java.util.Scanner;

public class usodewhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;
        int i=1;
        System.out.println("Tabla de Multiplicar");
        System.out.println("--------------------------------------");
        System.out.println("Introduzca un numero: ");
        numero = sc.nextInt();
        System.out.println("\nTabla del " + numero);
        while(i<=12) {
            System.out.println(numero + " * " + i + " = " + numero * i);
            i++;
        }

        Scanner n = new Scanner(System.in);
        System.out.println("\nPrograma de registro de nombres");
        System.out.println("--------------------------------------");
        String nombre[] = new String[6];
        int edad[] = new int[6];
        int x = 0;
        while (x < 6) {
            System.out.println("Escriba su nombre: ");
            nombre[x] = n.nextLine();
            System.out.println("Ingrese su edad: ");
            edad[x] = n.nextInt();
            n.nextLine();
            x++;

        }
        int y = 0;
        while (y < 6) {
            System.out.println("Su nombre " + y + " es " + nombre[y] + " y su edad es: " + edad[y]);
            y++;
        }
    }
}
