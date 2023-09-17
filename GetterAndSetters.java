public class GetterAndSetters {
    public static void main(String args[]){
       Result st = new Result();
        st.setMarks(45);
        System.out.println(st.getMarks());
        st.setName("Shantanu mukherjee");
        System.out.println(st.getName());
    }
    
}
class Result{
         private int marks;
       
         private String name;
        //getters : to return the value
        int getMarks(){
          return  this.marks;
        }
      String getName(){
            return this.name;
        }
        //setters : to the value 
        void setMarks(int newMarks){
            marks = newMarks;
        }
        void setName(String newName){
            name = newName;
        }
    }
