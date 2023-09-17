public class OOPS1 {
    //concept of copy constructor
    public static void main(String args[]){
       
        Student s1 = new Student();
        s1.name = "Mugdha";
        s1.roll= 123;
        s1.pass= "abc";
        s1.marks[0]= 100;
        s1.marks[1] = 30;
        s1.marks[2] = 20;
    


        Student s2 = new Student(s1);
        
        s2.pass = "xyz";
        for(int i =0 ; i<3; i++){
            System.out.println(s2.marks[i]);

    }
        


    }
    
    
}
class Student{
        int roll;
        String name;
        String pass;
        int marks[];


        //copy constructor
        Student(Student s1){
            this.name = s1.name;
            this.roll= s1.roll;
            this.marks = s1.marks;
        }

        Student(){
            System.out.println("hello");
        }

        Student(String newName){
            this.name = newName;
        }

        Student(int newRoll){
            this.roll= newRoll;
        }

    }
