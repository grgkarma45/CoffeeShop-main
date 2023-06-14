import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeShopTestTea {

    @Test
    void order_tea_price() {
        // Arrange
        CoffeeShop shop = new CoffeeShop();

        // act
        double price;
        price = shop.order(DrinkType.TEA, SizeType.MEDIUM);

        // assert
        assertEquals(3.0, price, "Wrong price for TEA");

        // act
        price = shop.order(DrinkType.TEA, SizeType.LARGE);

        // assert
        assertEquals(6.0, price, "Wrong price for TEA");
        price = shop.order(DrinkType.TEA, SizeType.SMALL);

        // assert
        assertEquals(180.0, price, "Wrong price for TEA");

    }
}