import java.util.*;
public class Calculator {
    public static void main(String args[]){
        // creating a calculator using switch case
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        char opr = scn.next().charAt(0);

        switch(opr){
            case '+' : System.out.print(a+b);
            break;
            case '-': System.out.print(a-b);
            break;
            case '*' : System.out.print(a*b);
            break;
            case '/' : System.out.print(a/b);
            break; 
            default : System.out.print("error");

        }


        


    }
    
}
