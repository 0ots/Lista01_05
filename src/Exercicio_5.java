import java.util.Scanner;

public class Exercicio_5 {

    public static void main(String[] args) throws Exception {

        int metros, conversao;

        Scanner input;

        input = new Scanner(System.in);

        System.out.print("Digite um valor em metros: ");

        metros = input.nextInt();

        input.close();

        conversao = metros * 100;

        System.out.println(metros + " metros equivalem a " + conversao + " centímetros");

    }

}
