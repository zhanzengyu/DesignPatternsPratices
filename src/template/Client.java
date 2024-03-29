package template;

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        Decorator decorator = new ConcreteDecoratorA(component);
        decorator.operate();

        Decorator decoratorB = new ConcreteDecoratorB(component);
        decoratorB.operate();
    }
}
