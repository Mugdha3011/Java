public class Questions{
    public static void main(String args[]){
        //1. print first 50 natural number but skip if it is multiple of 3
        System.out.println("ques 1");
        int i;
        for(i = 1; i<=50; i++){
            if(i%3==0){
                continue; //to skip multiple of 3
            }
            System.out.print(i + " ");

        }
        System.out.println();

        //2. print first 10 natural numbers but exit if number is multiple of 4
        System.out.println("ques 2");
        int j;
        for(j=1; j<=10; j++){
            if(j%4==0){
                break;
            }
            System.out.print(j + " ");
        }
        
    }

    
}
