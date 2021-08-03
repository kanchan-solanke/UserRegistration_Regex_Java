import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    // For First Name
    public static void AddFirstName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First Name:");
        String name = sc.nextLine();
        System.out.println("First Name is : " + name);
        Pattern pattern = Pattern.compile("^([A-Z]{1})([a-z]{2,})$");
        Matcher matcher = pattern.matcher(name);
        boolean MatchFound = matcher.matches();

        if (MatchFound) {
            System.out.println("Name is Valid");
        } else {
            System.out.println("Name is invalid");
        }
    }

    // For Last Name

    public static void AddLastName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Last Name: ");
        String name = sc.nextLine();
        System.out.println("Last Name is: "+name);
        Pattern pattern = Pattern.compile("^([A-Z]{1})([a-z A-Z]{2,})$");
        Matcher matcher = pattern.matcher(name);
        boolean MatchFound = matcher.matches();
        if (MatchFound) {
            System.out.println("Last Name is valid");
        } else {
            System.out.println("Last Name is Invalid");
        }
    }

    public static void main(String[] args) {
        AddFirstName();
        AddLastName();
    }
}
