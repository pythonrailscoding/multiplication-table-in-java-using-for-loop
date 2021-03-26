// Program of Java for Multiplication Table
import java.util.Scanner;
public class multiply {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        double a = scan.nextDouble();
        int b = 1;
        for(double c = a; c <= a*10; c+=a){
            System.out.println(a + " x " + b  +  " = " + c);
            b++;
        }
        scan.close();
    }
    
}
