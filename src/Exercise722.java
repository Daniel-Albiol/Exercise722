import java.util.Scanner;

public class Exercise722 {
    public static void main(String[] argv) {
        float x;
        float Mile;
        System.out.println("Enter the Nautical Meters:");
//Reading the value
        Scanner inputValue;
        inputValue=new Scanner(System.in);
        x = inputValue.nextFloat();
        Mile = x * 1852;
        System.out.println(Mile);
    }
}
