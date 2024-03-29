package template;

public abstract class Decorator extends Component {
    // 持有一个 Component 对象的引用
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
