public class OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("purple");
        System.out.println(p1.color);
        p1.setTip(7);
        System.out.println(p1.tip);
        
    }
    
}

class Pen{
    int tip;
    String color;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}