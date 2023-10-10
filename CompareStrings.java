public class CompareStrings {
    public static void main(String args[]){
        String str1 = "Ujjain Engineering College";
        String str2 = "Bareilly is Best";

        int l1 = str1.length();
        int l2 = str2.length();
        int compare = str1.compareTo(str2);

        if(compare<0){
            System.out.println("str1 is smaller than str2");
        }
        else if(compare>0){
            System.out.println("str1 is larger than str2");

        }
        else{
            System.out.println("both strings are same ");
        }
    }
    
}
