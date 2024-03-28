package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
    // 代理类持有委托类的引用，以便调用委托类来实现接口的具体功能
    private Object obj;

    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 调用委托类的方法
        Object result = method.invoke(obj, args);
        return result;
    }
}
