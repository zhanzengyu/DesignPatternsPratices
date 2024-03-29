package template;

public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        // 装饰方法 A 和 B 的调用顺序可以自己控制
        operateA();
        operateB();
        super.operate();
    }

    /**
     * 自定义的装饰方法 A
     */
    public void operateA() {
        System.out.println("ConcreteDecoratorB operateA()");
    }

    /**
     * 自定义的装饰方法 B
     */
    public void operateB() {
        System.out.println("ConcreteDecoratorB operateB()");
    }
}
