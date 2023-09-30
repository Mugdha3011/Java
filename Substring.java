public class Substring {
    public static String substring(String str , int si, int ei)
{
    String substr = "";
    for(int i = si; i< ei; i++){
        substr += str.charAt(i);
    }
            return substr;

}    
public static void main(String args[]){
    String str = "HelloMugdha";
    System.out.println("substring is : " + substring( str, 0, 9)  );
}
}
