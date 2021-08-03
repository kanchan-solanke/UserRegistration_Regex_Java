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
        System.out.println("Last Name is: " + name);
        Pattern pattern = Pattern.compile("^([A-Z]{1})([a-z A-Z]{2,})$");
        Matcher matcher = pattern.matcher(name);
        boolean MatchFound = matcher.matches();
        if (MatchFound) {
            System.out.println("Last Name is valid");
        } else {
            System.out.println("Last Name is Invalid");
        }
    }

    public static void ValidEmail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an email");
        String email = sc.nextLine();
        System.out.println("Email is: " + email);
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9.+_-]+[@][a-zA-Z0-9]+[.]co(m|.in)$");
        Matcher matcher = pattern.matcher(email);
        boolean MatchFound = matcher.matches();
        if (MatchFound) {
            System.out.println("Email is Valid");
        } else
            System.out.println("Email is Invalid");
    }

    public static void ValidMobileNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a mobile number: ");
        String mob = sc.nextLine();
        System.out.println("Mobile Number is: " + mob);
        Pattern pattern = Pattern.compile("^([0-9]{2}) ([1-9]{1}[0-9]{9,})$");
        Matcher matcher = pattern.matcher(mob);
        boolean MatchFound = matcher.matches();
        if (MatchFound) {
            System.out.println("Mobile number is valid");
        } else {
            System.out.println("Mobile Number is Invalid");
        }
    }

    public static void ValidPassword(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = sc.nextLine();
        Pattern pattern  = Pattern.compile("^[a-zA-Z0-9-@#$]{8,}$");
        Matcher matcher = pattern.matcher(password);
        boolean MatchFound = matcher.matches();

        if(MatchFound){
            System.out.println("Password is Valid");
        }
        else{
            System.out.println("Password is Invalid");
        }
    }

    public static void ValidPasswordatleastoneUpperCase(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password: " );
        String password = sc.nextLine();
        System.out.println("Password is: ");
        Pattern pattern = Pattern.compile("^[A-Z]{1}[0-9]{1,}+[A-Za-z0-9]{6,}$");
        Matcher matcher = pattern.matcher(password);
        boolean MathFound = matcher.matches();

        if(MathFound){
            System.out.println("Password is Valid");
        }
        else {
            System.out.println("Password is Invalid");
        }
    }

    public static void ValidPasswordatleastOneNumericNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = sc.nextLine();
        System.out.println("Password is: ");
        Pattern pattern = Pattern.compile("^([A-Z]{1})+([0-9]{1,})+([A-Za-z0-9]{6,})$");
        Matcher matcher = pattern.matcher(password);
        boolean MatchFound = matcher.matches();

        if(MatchFound){
            System.out.println("Password is Valid");
        }
        else {
            System.out.println("Password is Invalid");
        }
    }
    public static void main(String[] args) {
        AddFirstName();
        AddLastName();
        ValidEmail();
        ValidMobileNum();
        ValidPassword();
        ValidPasswordatleastoneUpperCase();
        ValidPasswordatleastOneNumericNum();
    }
}
