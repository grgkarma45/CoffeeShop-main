import java.sql.*;
import java.util.ArrayList;

public class PriceDB {

    private final ArrayList<Beverage> beverageList = new ArrayList<>();


    public double findPrice(SizeType size, DrinkType type) {
        double value = 0.0;
        for (Beverage b : beverageList) {
            if (b.getSize() == size && b.getType() == type) value = b.getPrice();
        }
        return value;
    }


    public PriceDB() {
        // Establishing the database connection
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeeshop", "Karma", "Gurung");

            // Retrieving data from the database
            String query = "SELECT DrinkType, SizeType, Price FROM beverage";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            // Processing the result set
            while (resultSet.next()) {
                String drinkType = resultSet.getString("DrinkType");
                String sizeType = resultSet.getString("SizeType");
                double price = resultSet.getDouble("Price");
                Beverage beverage = new Beverage(SizeType.valueOf(sizeType), price, DrinkType.valueOf(drinkType));
                beverageList.add(beverage);
            }

            // Closing resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle any connection or query errors
        }
    }
}