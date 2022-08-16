import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Account
        Account Account = new Account("1", "Bernadine", 300);

        System.out.println(Account);
        System.out.println(Account.getBalance());

        // Circle
        Circle circle = new Circle(10);
        System.out.println(circle.getCircumfrence());

        circle.setCircumfrence(15);
        System.out.println(circle.getCircumfrence());

        // Rectangle
        Rectangle rectangle = new Rectangle(10, 12);



        // Customer
        Customer stan = new Customer("Stan", "Moat", 100);


    }
}

