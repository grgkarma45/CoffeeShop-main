import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CoffeeShopTest {


    @Test
    void order_medium_coffee_price() {

        // arrange
        CoffeeShop shop = new CoffeeShop();

        // act
        double price = shop.order(DrinkType.COFFEE, SizeType.MEDIUM);

        //assert
        assertEquals(price, 4.98, "Wrong price!");

    }

    @Test
    void order_large_coffee_price() {

        CoffeeShop shop = new CoffeeShop();
        double price = shop.order(DrinkType.COFFEE, SizeType.LARGE);
        assertEquals(price, 6.0, "Wrong price!");

    }
}