
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    String firstName;
    String lastName;
    Scanner input=new Scanner(System.in);

    //Method to get firstname
    public String getFirstName(){
        System.out.println("Enter first name: ");
        System.out.println("Rules: ");
        System.out.println("First letter should be Capital letter and minimum 3 characters");
        return input.nextLine();
    }

    //Method to get lastname
    public String getLastName(){
        System.out.println("Enter last name: ");
        System.out.println("Rules: ");
        System.out.println("First letter should be Capital letter and minimum 3 characters");
        return input.nextLine();
    }

    //Method for validation
    public void userValidator()
    {
        this.firstName=getFirstName();
        boolean fName= Pattern.matches("^[A-Z][a-z]{2,}", firstName);
        System.out.println("First name is ");
        printingResult(fName);
        this.lastName=getLastName();
        boolean lName=Pattern.matches("^[A-Z][a-z]{2,}", lastName);
        System.out.println("Last name is ");
        printingResult(lName);

    }

    //Method to print result
    public static void printingResult(boolean check){
        if(Boolean.TRUE.equals(check))
        {
            System.out.println("VALID");
        }
        else
        {
            System.out.println("INVALID");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to User Registration");
        UserRegistration usereg=new UserRegistration();
        usereg.userValidator();
    }
}