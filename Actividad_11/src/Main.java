import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean end = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Selecciona el tipo de calculo a realizar:\n1- Perimetro\n2- Area");
            int opcion1 = sc.nextInt();
            switch (opcion1){
                case 1:
                    System.out.println("Calculo seleccionado: Perimetro\nSelecciona la figura a calcular:\n1- Circulo\n2- Cuadrado\n3- Triangulo equilatero");
                    int opcion2 = sc.nextInt();
                    switch (opcion2) {
                        case 1:
                            Circle circle = new Circle();
                            System.out.println("\nFigura Seleccionada: Circulo\nIntroduce el radio: ");
                            double radio = sc.nextDouble();
                            System.out.println("\nEl perimetro es: " + circle.getPerimeter(radio,2,0));
                            break;
                        case 2:
                            Square square = new Square();
                            System.out.print("\nFigura seleccionada: Cuadrado\nIntroduce el lado: ");
                            double lado = sc.nextDouble();
                            System.out.print("\nEl perimetro es:" + square.getPerimeter(lado,0,0));
                            break;
                        case 3:
                            Triangle triangle = new Triangle();
                            System.out.print("\nFigura seleccionada: Triangulo\nIntroduce el lado: ");
                            lado = sc.nextDouble();
                            System.out.print("\nEl perimetro es:" + triangle.getPerimeter(lado,0,0));
                            break;
                        default:
                            System.out.printf("Selecciona una opcion adecuada");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Calculo seleccionado: Area\nSelecciona la figura a calcular:\n1- Circulo\n2- Cuadrado\n3- Triangulo equilatero");
                    opcion2 = sc.nextInt();
                    switch (opcion2) {
                        case 1:
                            Circle circle = new Circle();
                            System.out.println("\nFigura Seleccionada: Circulo\nIntroduce el radio: ");
                            double radio = sc.nextDouble();
                            System.out.println("\nEl perimetro es: " + circle.getArea(radio,2,0));
                            break;
                        case 2:
                            Square square = new Square();
                            System.out.print("\nFigura seleccionada: Cuadrado\nIntroduce el lado: ");
                            double lado = sc.nextDouble();
                            System.out.print("\nEl perimetro es:" + square.getArea(lado,0,0));
                            break;
                        case 3:
                            Triangle triangle = new Triangle();
                            System.out.print("\nFigura seleccionada: Triangulo\nIntroduce el lado: ");
                            lado = sc.nextDouble();
                            System.out.print("\nIntroduce la altura: ");
                            double altura = sc.nextDouble();
                            System.out.print("\nEl perimetro es:" + triangle.getArea(lado,altura,0));
                            break;
                        default:
                            System.out.printf("Selecciona una opcion adecuada");
                            break;
                    }
                    }

            System.out.println("\n¿Realizar un nuevo calculo? (s/n)");
            String op = sc.next();
            switch (op) {
                case "s":
                    Main.main(null);
                    break;
                case "n":
                    end = false;
                default:
                    System.out.println("Selecciona una opcion valida");
            }
    }while(end);
}
}
