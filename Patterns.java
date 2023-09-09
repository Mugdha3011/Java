
public class Patterns {
    public static void main(String args[]){
       
        //star pyramid pattern
        System.out.println("star pyramid pattern");
        int i ,j;
        for(i=1; i<=5; i++){
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
             System.out.println();
        }

        System.out.println();
        //inverted star pyramid pattern
        System.out.println("inverted star pattern");
        for(i=5; i>=1; i--){
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //mirror star pyramid pattern
        System.out.println("mirror star pyramid pattern");
        for(i=1; i<=5; i++){
            //spaces
            for(j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            //stars
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //number pyramid pattern
        System.out.println("number pyramid pattern");
        for(i=1; i<=5; i++){
            for(j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }


        

       
    }
    
}
