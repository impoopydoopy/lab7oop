import CoffeTypes.*;

public class WinterCoffeeShop extends CoffeeShop {
    @Override
    protected Coffee createCoffee(Type type) {
            Coffee coffee = null;
            switch (type)
            {
                case AMERICANO:
                    coffee = new WinterAmericano();
                    break;
                case ESPRESSO:
                    coffee = new WinterEspresso();
                    break;
                case DOPPIO:
                    coffee = new WinterDoppio();
                    break;
                case LATTE:
                    coffee = new WinterLatte();
                    break;
                default: System.out.println("error");
            }

            return coffee;
    }
}
