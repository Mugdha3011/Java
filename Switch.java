import java.util.*;
public class Switch {
    public static void main(String args[]){
        /*ordering food by pressing number buttons using switch case */
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        switch(numb){
            case 1 : System.out.print(" Pineaple Pizza");
            break;
            case 2  : System.out.print("dosa");
            break;
            case 3  : System.out.print("pineapple cake");
            break;
            case 4 : System.out.print("fried momos");
            break;
            case 5 : System.out.print("Manchurian fried rice");
            break;
            case 6 : System.out.print(" mutter mushroom");
            break;
            case 7 : System.out.print("paani puri");
            break; 
            default : System.out.print("wrong button pressed");
        }
        



    }

    
}
