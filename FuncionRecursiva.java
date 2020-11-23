import java.util.Scanner;

public class FuncionRecursiva {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("Introduzca primer numero: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca segundo numero: ");
        n2 = sc.nextInt();
        System.out.println("La suma es igual a: " + suma(n1, n2));

    }

    /*
     * Método recursivo que calcula la suma de dos números enteros
     */
    public static int suma(int a, int b) {
        if (b == 0) {   // Caso base
            return a;
        } else if (a == 0) {
            return b;
        } else {
            return 1 + suma(a, b - 1);  // Caso recursivo
        }
    }
}
