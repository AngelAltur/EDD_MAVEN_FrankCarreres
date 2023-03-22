import java.util.Scanner;

class Calculadora {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        char operador;

        System.out.println("Ingrese el primer número: ");
        num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();

        System.out.println("Ingrese el operador (+, -, *, /): ");
        operador = scanner.next().charAt(0);

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + resultado);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("No se puede dividir entre cero.");
                    break;
                } else {
                    resultado = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + resultado);
                    break;
                }
            default:
                System.out.println("Operador no válido.");
                break;
        }
    }
}
