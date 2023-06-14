public class Main {
    public static void main(String[] args) {
        CoffeeShop shop = new CoffeeShop();
        shop.order(DrinkType.COFFEE, SizeType.MEDIUM);
        shop.order(DrinkType.TEA, SizeType.MEDIUM);
    }
}
