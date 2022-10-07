import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      //Faça um Programa que converta metros para centímetros.

      Scanner teclado = new Scanner(System.in);

      double mts, cts;

      System.out.println("Informe o valor em metros: ");
      mts = teclado.nextDouble();

      cts = mts * 100;

      teclado.close();

      System.out.println(+ mts + " metros convertidos em CMs é igual a: " + cts + " centímetros");  
    
    }
}
