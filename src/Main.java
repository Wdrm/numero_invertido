import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
        System.out.println("Informe Um Número:\n");
        int numeroInverter  = sc.nextInt();
        int impresso =  numeroInverter;
        int numeroInvertido = 0;

        while (numeroInverter >0){
            numeroInvertido =  numeroInvertido*10;
            numeroInvertido =  numeroInvertido +(numeroInverter%10);
            numeroInverter = numeroInverter/10;

        }

                   System.out.println("O número digitado foi: "+  impresso  +" ele invertido é: "+numeroInvertido);
    }
}