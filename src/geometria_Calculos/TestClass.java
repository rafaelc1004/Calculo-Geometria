package geometria_Calculos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class TestClass {

    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    private static double altura;
    private static double base;
    private static double diametro;
    private static Rectangulos rectangulo;
    private static Circulos circulo;
    private static boolean estado;
    private static String respuesta;

    public static void main(String arg[]) throws Exception {
        menu();
    }

    private static void menu() throws InterruptedException, Exception {
        int opcion;

        System.out.println("\tAplicacion para calculos geometricos");
        System.out.println("\t------------------------------------\n");

        do {
            System.out.println("\n\tMenu de Calculos\n");
            System.out.println("1.-Calcular Area de Rectangulo");
            System.out.println("2.-Calcular Radio de Circulo");
            System.out.println("3.-Calcular Perimetro de un Circulo");
            System.out.println("4.-Calcular Area de Circulo");

            do {
                System.out.print("\nIngrese su opcion :");
                opcion = Integer.parseInt(bf.readLine());
                if (opcion < 1 || opcion > 4) {
                    System.out.println("Opcion ingresada no es valida!!");
                    TimeUnit.SECONDS.sleep(2);
                }
            } while (opcion < 1 || opcion > 4);
            menuCalculo(opcion);
            do {
                System.out.print("\nDesea realizar otro calculo si/no :");
                respuesta = bf.readLine();
                if (!(respuesta.equalsIgnoreCase("si")) && !(respuesta.equalsIgnoreCase("no"))) {
                    System.out.println("\nRespuesta no es valida, Intentelo nuevamente....");
                }
            } while (!(respuesta.equalsIgnoreCase("si")) && !(respuesta.equalsIgnoreCase("no")));
        } while (respuesta.equalsIgnoreCase("si"));
        System.out.println("\n\t\t\tFin de Programa!!");
    }

    private static void menuCalculo(int opcion) throws Exception {

        switch (opcion) {
            case 1:
                calcularAreaRectangulo();
                break;
            case 2:
                calcularRadioCirculo();
                break;
            case 3:
                calcularPerimetroCirculo();
                break;
            default:
                calcularAreaCirculo();
        }
    }

    private static boolean validar(double valor) {
        if (valor <= 0) {
            estado = false;
        } else {
            estado = true;
        }
        return estado;
    }

    private static void calcularAreaRectangulo() throws Exception {
        do {
            System.out.print("\nIngrese altura para calcular area de rectangulo :");
            altura = Double.parseDouble(bf.readLine());
            estado = validar(altura);
        } while (estado == false);
        do {
            System.out.print("Ingrese base para calcular area de rectangulo :");
            base = Double.parseDouble(bf.readLine());
            estado = validar(base);
        } while (estado == false);
        rectangulo = new Rectangulos(altura, base);
        System.out.println("El area del rectangulo es :" + rectangulo.calcularAreaRectangulo() + " cm.");
    }

    private static void calcularRadioCirculo() throws Exception {
        do {
            System.out.print("\nIngrese diametro para calcular Radio de Circulo :");
            diametro = Double.parseDouble(bf.readLine());
            estado = validar(diametro);
        } while (estado == false);
        circulo = new Circulos(diametro);
        System.out.println("El radio del circulo es :" + circulo.calcularRadioCirculo() + " cm.");
    }

    private static void calcularPerimetroCirculo() throws Exception {
        do {
            System.out.print("\nIngrese diametro para calcular perimetro de Circulo :");
            diametro = Double.parseDouble(bf.readLine());
            estado = validar(diametro);
        } while (estado == false);
        circulo = new Circulos(diametro);
        System.out.println("El Perimetro del circulo es :" + circulo.calcularPerimetroCirculo() + " cm.");
    }

    private static void calcularAreaCirculo() throws Exception {
        do {
            System.out.print("\nIngrese diametro para calcular Area de Circulo :");
            diametro = Double.parseDouble(bf.readLine());
            estado = validar(diametro);
        } while (estado == false);
        circulo = new Circulos(diametro);
        System.out.println("El area del circulo es :" + circulo.calcularAreaCirculo() + " cm.");
    }
}
