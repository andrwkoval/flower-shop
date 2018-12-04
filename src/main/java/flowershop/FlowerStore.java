package flowershop;

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

public class FlowerStore {
    private ArrayList<FlowerBouquet> defaultBouqts = DefaultBouquets.getInstance().getDefaultBouquets();
    private ArrayList<Flower> flowers;

    public FlowerStore(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }

    public void assortment() {
        System.out.println("Available flowers to create bouquets: ");
        System.out.println(flowers);
        System.out.println("Default bouquets: ");
        System.out.println(defaultBouqts);
    }

    public FlowerBouquet formBouquetFromFlowerBunch(ArrayList<FlowerBunch> flowerBunches) {
        FlowerBouquet bouquet = new FlowerBouquet();
        for (FlowerBunch flowerBunche : flowerBunches) {
            bouquet.addFlowers(flowerBunche);
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
        return new ArrayList<>();

    }
}
