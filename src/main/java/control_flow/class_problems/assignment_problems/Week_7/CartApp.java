package control_flow.class_problems.assignment_problems.Week_7;

class Cart {

    private double[] prices;
    private int count;
    private final String id;

    Cart(String id, int size) {
        this.id = id;
        prices = new double[size];
        count = 0;
    }

    void addItem(double price) {

        if (count < prices.length) {
            prices[count] = price;
            count++;
        }
    }

    double getTotal() {

        double total = 0;

        for (int i = 0; i < count; i++) {
            total = total + prices[i];
        }

        return total;
    }

    int getItemCount() {
        return count;
    }
}

public class CartApp {

    public static void main(String[] args) {

        Cart cart = new Cart("CART-5", 20);

        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);

        System.out.println("Total: " + cart.getTotal());
        System.out.println("Count: " + cart.getItemCount());
    }
}