import CoffeTypes.*;

public class AutumnCoffeeShop extends CoffeeShop{
    @Override
    protected Coffee createCoffee(Type type) {
        Coffee coffee = null;
        switch (type)
        {
            case AMERICANO:
                coffee = new AutumnAmericano();
                break;
            case ESPRESSO:
                coffee = new AutumnEspresso();
                break;
            case DOPPIO:
                coffee = new AutumnDoppio();
                break;
            case LATTE:
                coffee = new AutumnLatte();
                break;
            default: System.out.println("error");
        }

        return coffee;
    }
}
