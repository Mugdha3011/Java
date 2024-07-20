import java.util.*;
public class CheckPrime {

    public static void main(String args[]){
        //if a number is prime or not 
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
      
     if(n==0 || n==1){
         System.out.println("neither prime nor composite number");
     }else if(n==2){
         System.out.println("its a  prime number");
    }
     int i=2;   
     while( i<=n-1){
     if(n%i!=0){
         System.out.println("prime");
         break;
      }else{
            System.out.println("not prime");
            break;
        }
    
      }
      
     }

     

    
    
}

