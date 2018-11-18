package delivery;

public class NovaPoshta implements Delivery{
    public boolean process(){
        System.out.println("Delivered with NovaPoshta");
        return true;
    }
}

