import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        System.out.println(name(n));

    }

    static int name(int n) {
        if(n <= 0){
            return 0;
        }
        System.out.println("Akash");
        return name(n-1);

    }
}