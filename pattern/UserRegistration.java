
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    String firstName;
    String lastName;
    String email;
    String mobileNo;
    String password;
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

    //Method to get Email
    public String getEmail()
    {
        System.out.println("Enter a valid email: ");
        return input.nextLine();
    }

    //Method to get MobileNumber
    public String getMobileNo()
    {
        System.out.println("Enter mobile number: ");
        return input.nextLine();
    }

    //Method to get Password
    public String getPassword()
    {
        System.out.println("Enter a valid password: ");
        System.out.println("Rule 1:");
        System.out.println("Minimum 8 characters");
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
        this.email=getEmail();
        boolean emailId=Pattern.matches("^[a-zA-Z.]+([a-z]+)?[@][a-z]+\\.[a-z]{2,3}(\\.[A-Za-z]{2,6})?", email);
        System.out.println("EmaiId is");
        printingResult(emailId);
        this.mobileNo=getMobileNo();
        boolean mobile=Pattern.matches("\\d{1,2}[\\s+]?\\d{1,10}",mobileNo);
        System.out.println("Mobile Number is: ");
        printingResult(mobile);
        this.password=getPassword();
        boolean correctPassword = Pattern.matches("[a-zA-Z]{8,}",password);
        System.out.println("Password is: ");
        printingResult(correctPassword);
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