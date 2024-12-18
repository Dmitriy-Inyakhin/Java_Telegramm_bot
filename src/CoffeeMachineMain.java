import java.util.ArrayList;

public class CoffeeMachineMain
{
    public static void main(String[] args) {
        System.out.println("Кофемашина");

        int moneyAmount = 185;

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(200, "капучино"));
        products.add(new Product(100, "эспрессо"));
        products.add(new Product(50, "вода"));
		//новая строчка

        checkPrices(moneyAmount, products);
    }

    public static void checkPrices(int moneyAmount, ArrayList<Product> products) {
        for (Product product : products) {
            if (moneyAmount >= product.getPrice()) {
                System.out.println("Вы можете купить " + product.getName());
            }
        }
    }
}
