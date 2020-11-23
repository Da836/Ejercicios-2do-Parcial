import java.util.Scanner;

public class MenuConversiones {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.println("Menu de Unidades");
        System.out.println("--------------------------------");
        System.out.println("\n1)Conversion de Masa");
        System.out.println("\n2)Conversion de Velocidad");
        System.out.println("\nSeleccione la opcion que desee: ");
        int opc = n.nextInt();
        System.out.println("\nIngrese una unidad de medida: ");
        n.nextLine();
        String uS = n.nextLine();
        System.out.println("\nIngrese el valor que desea convertir: ");
        double uN = n.nextDouble();

        menu(opc, uS, uN);
    }

    public static void menu(int opc, String uS, double uN) {
        double resul;
        String masa, velocidad;

        switch(opc){

            case 1:
                convMasa(uS, uN);
                resul = convMasa(uS, uN);
                masa = eleccMasa(uS);
                System.out.println(resul + masa);
                break;

            case 2:
                convVelocidad(uS, uN);
                resul = convVelocidad(uS, uN);
                velocidad = eleccVelocidad(uS);
                System.out.println(resul + velocidad);
                break;

            default:
                System.out.println("Opcion no valida");
                break;

        }
    }

    public static double convMasa(String nombre, double valor) {

        double total = 0;
        if (nombre.equals("kg")){
            total = valor * 2.205;
        } else if (nombre.equals("lb"))
            total = valor / 2.205;
        return total;
    }

    public static double convVelocidad(String nombre, double valor) {

        double total = 0;
        if (nombre.equals("km")){
            total = valor / 1.609;
        } else {if (nombre.equals("mi")){
            total = valor * 1.609;
        }
        }
        return total;
    }

    public static String eleccMasa(String nombre){
        String masa = null;
        if (nombre.equals("kg") ){
            masa = " Libras";
        } else {if (nombre.equals("lb")){
            masa = " Kilogramos";
        }
        }
        return masa;
    }

    public static String eleccVelocidad(String nombre){
        String velocidad = null;
        if (nombre.equals("km")){
            velocidad = " Millas";
        } else {if (nombre.equals("mi")){
            velocidad = " Kilometros";
        }
        }
        return velocidad;
    }
}
