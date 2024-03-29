package template;

public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        // 装饰方法 A 和 B 的调用顺序可以自己控制
        operateA();
        super.operate();
        operateB();
    }

    /**
     * 自定义的装饰方法 A
     */
    public void operateA() {
        System.out.println("ConcreteDecoratorA operateA()");
    }

    /**
     * 自定义的装饰方法 B
     */
    public void operateB() {
        System.out.println("ConcreteDecoratorA operateB()");
    }
}
