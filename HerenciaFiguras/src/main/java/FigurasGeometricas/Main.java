package FigurasGeometricas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    static ArrayList<Figura>figuras=new ArrayList<Figura>();

    public static void main(String[] args) {

        ingresarFigura();
        mostrarResultado();

        }
        public static void ingresarFigura(){

        int opcion;
        do{
            System.out.println("Sr usuario seleccione la figura que desea ingresar" +
                    "\n1.Rectangulo"+
                    "\n2.Triangulo"+
                    "\n3.Circulo"+
                    "\n4.Salir");
            opcion= sc.nextInt();
            switch (opcion){
                case 1://Ingresar al metodo de calcular rectangulo
                    calcularRectangulo();
                    break;
                case 2://Ingresar el metodo de calcular triangulo
                    calcularTriangulo();
                    break;
                case 3://Ingresar el metodo de calcular circulo
                    calcularCirculo();
                case 4:
                    opcion=4;
                default:
                    System.out.println("opcion no valida, intente nuevamente");
            }
        }while (opcion!=4);

    }
    public static void calcularRectangulo(){
        int lado1,lado2,numlados;
        System.out.println("Sr. Usuario ingrese los lados del rectangulo");
        numlados= sc.nextInt();
        System.out.println("Ingrese el valor del lado 1");
        lado1= sc.nextInt();
        System.out.println("Ingrese el valor del lado 2");
        lado2= sc.nextInt();

        Rectangulo rectangulo=new Rectangulo(numlados,lado1,lado2);
        figuras.add(rectangulo);
    }
    public static void calcularTriangulo(){
        int base, altura,numlados;
        System.out.println("Sr. Usuario ingrese los lados del triangulo");
        numlados=sc.nextInt();
        System.out.println("Sr. Usuario ingrese el valor de la base");
        base= sc.nextInt();
        System.out.println("Sr. Usuario ingrese el valor de la altura");
        altura= sc.nextInt();

        Triangulo triangulo=new Triangulo(numlados,base,altura);
        figuras.add(triangulo);
    }
    public static void calcularCirculo(){
        int radio;
        int numlados;
        final double pi=3.1416;
        System.out.println("Sr. Usuario ingrese los lados del circulo");
        numlados= sc.nextInt();
        System.out.println("Sr. Usuario ingrese el radio del circulo");
        radio= sc.nextInt();

        Circulo circulo=new Circulo(numlados, radio);
        figuras.add(circulo);
    }
    public static void mostrarResultado(){
        for (Figura figur:figuras){
            System.out.println(figuras.toString());
            System.out.println("el area es: "+figur.calcularArea());
            System.out.println("el perimetro es: "+figur.calcularPerimetrro());
        }
    }
}
