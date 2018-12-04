import carts.Cart;
import carts.DiscountCart;
import carts.SimpleCart;
import flowers.DefaultBouquets;
import flowers.Flower;
import flowers.FlowerBouquet;
import flowers.FlowerBunch;
import payment.Payment;
import payment.PaymentContext;

import java.util.ArrayList;
import java.util.HashMap;

public class FlowerStore {
    private ArrayList<FlowerBouquet> defaultBouqts = DefaultBouquets.getInstance().getDefaultBouquets();
    private ArrayList<Flower> flowers;

    public FlowerStore(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }

    public FlowerBouquet formBouquetFromFlowers(HashMap<Integer, Integer> arr) {
        FlowerBouquet bouquet = new FlowerBouquet();
        for (int key : arr.keySet()) {
            if (key > flowers.size() - 1) {
                continue;
            }
            bouquet.addFlowers(new FlowerBunch(flowers.get(key), arr.get(key)));
        }
        return bouquet;
    }

    public Cart formNewCart(boolean sale) {
        if (sale) {
            return new DiscountCart(new SimpleCart(), 0.3);
        } else {
            return new SimpleCart();
        }
    }

    public ArrayList<FlowerBouquet> buyCart(Cart currentCart, Payment payment, double yourMoney) {
        PaymentContext paymentMethod = new PaymentContext(payment);
        if (paymentMethod.performPayment(currentCart, yourMoney)) {
            return currentCart.getBouquets();
        }
        return null;

    }

    public void assortment() {
        System.out.println("Available flowers to create bouquets: ");
        System.out.println(flowers);
        System.out.println("Default bouquets: ");
        System.out.println(defaultBouqts);
    }
}
