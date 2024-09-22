import java.util.Scanner;
public class Beecrowd1014 {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variáveis
        int X;
        float Y,media;
        
        //ler variáveis
        X = leitor.nextInt();
        Y = leitor.nextFloat();
        
        //calcular a média
        media = X/Y;
        
        //mostrar o resultado no console
        System.out.printf("%.3f km/l%n", media);
    }
}