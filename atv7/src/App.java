import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Faça um Programa que calcule a área de um quadrado,
        // em seguida mostre o dobro desta área para o usuário.
Scanner sc = new Scanner(System.in);
System.out.println("Digite o lado do quadrado");
int l = sc.nextInt();

double area = Math.pow(l, l);
System.out.println("A area do quadrado é " + area);
    }
}
