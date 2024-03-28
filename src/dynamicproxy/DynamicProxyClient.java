package dynamicproxy;

import java.lang.reflect.Proxy;

public class DynamicProxyClient {
    public static void main(String[] args) {
        // 构建委托类
        ILawsuit lee = new Lee();
        // 将委托类传入动态代理
        DynamicProxy dynamicProxy = new DynamicProxy(lee);
        // 获取委托类的 ClassLoader
        ClassLoader loader = lee.getClass().getClassLoader();
        // 动态构建代理类
        ILawsuit lawyer = (ILawsuit) Proxy.newProxyInstance(loader,
                new Class[]{ILawsuit.class}, dynamicProxy);
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }
}
