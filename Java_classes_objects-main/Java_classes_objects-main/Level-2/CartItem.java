public class CartItem {
    public String itemName;
    public double price;
    public int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public static void main(String[] args) {
        CartItem[] cart = new CartItem[3];
        cart[0] = new CartItem("Pen", 10.0, 2);
        cart[1] = new CartItem("Notebook", 50.0, 1);
        cart[2] = new CartItem("Pencil", 5.0, 5);

        int n = cart.length;
        CartItem[] updatedCart = new CartItem[n - 1];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (!cart[i].itemName.equals("Pencil")) {
                updatedCart[idx++] = cart[i];
            }
        }
        double total = 0;
        for (int i = 0; i < updatedCart.length; i++) {
            CartItem item = updatedCart[i];
            total += item.getTotalCost();
            System.out.println(item.itemName + " x" + item.quantity + ": " + item.getTotalCost());
        }
        System.out.println("Total Cart Cost: " + total);
    }
}
