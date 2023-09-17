public class MultiInheritance {
    public static void main(String args[]){
        Bear b1 = new Bear();
        b1.food();
        b1.food1();


    }
}
    interface Herbivore{
        void food();
    }
    interface Carnivore{
        void food();
    }

    class Bear implements Carnivore, Herbivore{
         public void food(){
            System.out.println("ghaas khaata hai");
        }
       public  void food1(){
            System.out.println("maans machchi bhi chlega");
        }

    }

