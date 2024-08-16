import java.util.Scanner;

public class IT24100354Lab4Q3
 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int number;
        String result;

        System.out.print("Enter a number: ");
         number = input.nextInt();

        result = (number > 0) ? "Positive" :
                 (number < 0) ? "Negative" :
                  "Zero";

        System.out.print("The number is " + result);
     }
}