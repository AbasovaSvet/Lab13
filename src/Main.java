import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Как вас зовут?");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        char[] result = name.toCharArray();
        char x = result[result.length-1];
        if (x == 'а' ||   x == 'я' ||  x == 'и')
        {System.out.println("Приветик!");}
        else {System.out.println("Здарова!");}
    }
}