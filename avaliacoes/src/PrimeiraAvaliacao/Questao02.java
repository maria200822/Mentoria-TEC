package PrimeiraAvaliacao;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor da temperatura em graus celsus: ");
        double celsus = input.nextDouble();
        double fire = (celsus * 9/5) + 32;
        double kel = celsus + 273.15;
        System.out.println("A escala em celsus e : "+ celsus);
        System.out.println("A escala em fahrenhrit e: " + fire);
        System.out.println("A escala em Kelvin e : " + kel);
    }
}
