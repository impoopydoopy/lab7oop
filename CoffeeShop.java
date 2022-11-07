import CoffeTypes.*;

public abstract class CoffeeShop {
    public void orderCoffee(Type type) {
        Coffee coffee = createCoffee(type);

        coffee.makeCoffee();
        coffee.pourCoffee();

        System.out.println("Заказ готов!");
    }

    protected abstract Coffee createCoffee(Type type);
}

