import flowerFeatures.Color;
import flowers.*;
import lombok.SneakyThrows;

import java.util.Scanner;


public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        FlowerBucket bucket = new FlowerBucket();
        Flower tulip = new Tulip();
        Flower rose = new Rose();
        Flower chamomile = new Chamomile();
        rose.setPrice(40);
        tulip.setPrice(50);
        chamomile.setPrice(60);
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        while (cont) {
            System.out.println("Do you want to end it up(no/yes)?");
            String end = sc.nextLine().toLowerCase();

            if (end.equals("yes")) {
                cont = false;
                break;
            } else {
                System.out.println("What flower do you want(rose, tulip, chamomile)?");
                String firstFlower = sc.nextLine().toLowerCase();
                System.out.println("What color do you want(red, white, blue, black)?");
                String firstColor = sc.nextLine().toLowerCase();
                System.out.println("what numbers of flowers do you want?");
                int firstNum = sc.nextInt();
                Color color = null;
                if (firstColor.equals("red")) {
                    color = Color.RED;
                } else if (firstColor.equals("white")) {
                    color = Color.WHITE;
                } else if (firstColor.equals("black")) {
                    color = Color.BLACK;
                }
                if (firstFlower.equals("rose")) {
                    rose.setColor(color);
                    bucket.addFlower(rose, firstNum);
                } else if (firstFlower.equals("tulip")) {
                    tulip.setColor(color);
                    bucket.addFlower(tulip, firstNum);
                } else if (firstColor.equals("chamomile")) {
                    chamomile.setColor(color);
                    bucket.addFlower(chamomile, firstNum);
                }
            }
        }
        System.out.println(bucket.getPrice());


    }
}
