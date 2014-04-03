package test_java;
import java.util.Scanner;
public class Test_java {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Name    : ");
        String name = sc.nextLine();
        System.out.print("Lasname : ");
        String lasname = sc.nextLine();
        
        
        System.out.println(name+" "+lasname);
    }
    
}
