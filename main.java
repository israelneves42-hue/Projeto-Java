import java.util.Scanner;

public class main {
    public static void Main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = ler.nextLine();
        System.out.println("Hello, " + name + "!");
        ler.close();
    }
}