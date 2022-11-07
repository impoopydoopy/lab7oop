import CoffeTypes.Type;

public class Main {
    public static void main(String[] args) {
        CoffeeShop shop = new AutumnCoffeeShop();
        shop.orderCoffee(Type.AMERICANO);
        shop.orderCoffee(Type.DOPPIO);

        shop = new WinterCoffeeShop();
        shop.orderCoffee(Type.AMERICANO);
        shop.orderCoffee(Type.LATTE);
        shop.orderCoffee(Type.ESPRESSO);
    }
}