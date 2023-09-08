import java.util.*;
public class Loops {
  public static void main(String args[]){
    // print first n natural numbers using all three loops 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //for loop
    for(int i = 1; i<=n; i++){
        System.out.print(i +  " ");

    }
    System.out.println();
    // while loop
    int j = 1;
    while(j<=n){
        System.out.print(j + " ");
        j++;
    }
    System.out.println();
    // do while
    int k = 1;
    do{
        System.out.print(k + " ");
        k++;
    }while(k<=n);
    System.out.println();

        
        


    
    }
    
}
