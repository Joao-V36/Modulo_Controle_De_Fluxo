import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        try {
            Scanner ler = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = ler.next();

            System.out.println("Digite seu sobre nome: ");
            String sobrenome = ler.next();

            System.out.println("Digite sua idade: ");
            int idade = ler.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = ler.nextDouble();

            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + " cm ");
            ler.close();
        }
        catch (InputMismatchException e){
            System.err.println("O campo idade e altura precisam ser numéricos");
        }
    }
}
