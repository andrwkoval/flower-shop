package delivery;

public class UkrPoshta implements Delivery {
    public boolean process(){
        System.out.println("Delivered with UkrPoshta");
        return true;
    }
}

