

public class RevString {
    public static void main(String args[]){
        String str = "PROGRAMMING";
        String new_str = "";
        char ch;
        for(int i =0; i<str.length(); i++){
            ch= str.charAt(i);
            new_str = ch+ new_str;
        }
        System.out.println("Reversed : " + new_str);
    }
    
    
}
