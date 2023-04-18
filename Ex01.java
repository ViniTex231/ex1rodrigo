import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> contactList = new ArrayList<String>();


    while (op != 5) {
        System.out.println("Welcome to the Virtual Contact List!");
        System.out.println("1 - Add a new contact");
        System.out.println("2 - Remove a contact");
        System.out.println("3 - Search a contact");
        System.out.println("4 - Show the contact list");
        System.out.println("5 - Exit");

        System.out.println("Type the option: ");
        int op = sc.nextInt();



        switch (op) {
            case 1:
                System.out.println("Type the name and the number of the people what you want do add in the Contact List: ");
                String name = sc.nextLine();

                contactList.add(name);
                System.out.println(contactList);


        }
        }
    }
}