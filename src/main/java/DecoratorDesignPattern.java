public class DecoratorDesignPattern {
    public static void main(String[] args) {
        Pizza pepperoni=new PepperoniPizza(new CheesePizza(new PlainPizza()));
        System.out.println(pepperoni.getPrice());
        System.out.println(pepperoni.getDescription());

    }
}
class PepperoniPizza implements Pizza{
    Pizza pizza;

    public PepperoniPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getPrice() {
        return pizza.getPrice()+5;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+", pepperoni";
    }
}
class CheesePizza implements Pizza{
    Pizza pizza;

    public CheesePizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getPrice() {
        return pizza.getPrice()+3;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+",cheeze";
    }
}
interface Pizza{
    public int getPrice();
    public String getDescription();
}
class PlainPizza implements Pizza{

    @Override
    public int getPrice() {
        return 6;
    }

    @Override
    public String getDescription() {
        return "Plain Pizza";
    }
}

