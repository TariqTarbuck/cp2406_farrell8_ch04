/**
 * Created by jc320680 on 15/08/17.
 */
public class FormLetterWriter {
    public static void main(String[] args) {
        String fName = "John";
        String lName = "Wick";
        String fNameSec = "Silly";
        displaySalutation(fName, lName);
        displaySalutation(fName);



    }

    public static void displaySalutation(String fName, String lName)
    {
        System.out.println("Dear Mr." +fName+ " " + lName);
        System.out.println("Thank you for your recent purchase");
    }
    public static void displaySalutation(String Name)
    {
        System.out.println("Dear" + Name);
        System.out.println("Thank you for your order");
    }
}
