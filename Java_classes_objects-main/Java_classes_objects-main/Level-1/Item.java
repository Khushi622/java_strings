public class Item {
    private int itemCode;
    private String itemName;
    private double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Item Code:"+itemCode+ " Item Name: "+itemName+" Price: "+price);
    }

    public double totalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item = new Item(101, "Pen", 10.5);
        item.displayDetails();
        int qty = 5;
        System.out.println("Total cost for items: " + item.totalCost(qty));
    }
}
