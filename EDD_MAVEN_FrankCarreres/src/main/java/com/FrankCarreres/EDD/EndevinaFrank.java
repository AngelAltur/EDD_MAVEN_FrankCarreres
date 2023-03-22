import java.util.Random;
import java.util.Scanner;

class AdivinarNumero {

    static void main(String[] args) {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(100) + 1;
        int intentos = 0;
        Scanner sc = new Scanner(System.in);
        int numeroIngresado = 0;
        boolean acertado = false;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Tienes 5 intentos para adivinar un número entre 1 y 100.");

        while(intentos < 5 && !acertado) {
            System.out.print("Intento #" + (intentos + 1) + ": Ingresa un número: ");
            numeroIngresado = sc.nextInt();
            intentos++;

            if(numeroIngresado == numeroAleatorio) {
                acertado = true;
            } else if(numeroIngresado < numeroAleatorio) {
                System.out.println("El número que ingresaste es menor al número secreto.");
            } else {
                System.out.println("El número que ingresaste es mayor al número secreto.");
            }
        }

        if(acertado) {
            System.out.println("¡Felicitaciones! Adivinaste el número secreto en " + intentos + " intentos.");
        } else {
            System.out.println("Lo siento, no adivinaste el número secreto. El número era " + numeroAleatorio + ".");
        }

        sc.close();
    }

}
