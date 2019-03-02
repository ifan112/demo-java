package com.ifan112.demo.java.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

/**
 * JDK基于接口的动态代理方式生成的类，反编译自$Proxy0.class文件
 *
 * 由此可见，该类继承自Proxy以重用代理的基本逻辑，实现了目标接口即OrderService。
 * 根据此类创建的对象可以作为OrderService的实现。
 *
 * 该类的所有方法，特别是实现自OrderService接口的boolean newOrder(...)方法，
 * 都交由其持有的InvocationHandler.invoke()来实现。开发者在该方法中完成对代理
 * 目标方法的拦截和自定义处理逻辑。
 *
 * 在了解JDK生成的代理类结构和内容类似于该类时，就很容易明白JDK基于接口的动态代理
 * 的原理。毕竟，JDK只负责生成这种代理类，而代理类本身也只是类，无非通过继承和实现
 * 来完成代理的特性。
 */

final class $Proxy0 extends Proxy implements OrderService {

    private static Method m1;
    private static Method m2;
    private static Method m3;
    private static Method m0;

    static {
        try {
            m1 = Class.forName("java.lang.Object").getMethod("equals", Class.forName("java.lang.Object"));
            m2 = Class.forName("java.lang.Object").getMethod("toString");
            m3 = Class.forName("com.ifan112.demo.java.proxy.jdk.OrderService").getMethod("newOrder", Class.forName("java.lang.String"), Long.TYPE);
            m0 = Class.forName("java.lang.Object").getMethod("hashCode");
        } catch (NoSuchMethodException var2) {
            throw new NoSuchMethodError(var2.getMessage());
        } catch (ClassNotFoundException var3) {
            throw new NoClassDefFoundError(var3.getMessage());
        }
    }

    public $Proxy0(InvocationHandler var1) {
        super(var1);
    }

    public final boolean equals(Object var1) {
        try {
            return (Boolean) super.h.invoke(this, m1, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    public final String toString() {
        try {
            return (String) super.h.invoke(this, m2, (Object[]) null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }

    public final boolean newOrder(String var1, long var2) {
        try {
            // 该代理的newOrder()方法交由在创建该代理类时，传入的开发者实现的InvokeHandler.invoke()方法来执行
            return (Boolean) super.h.invoke(this, m3, new Object[]{var1, var2});
        } catch (RuntimeException | Error var5) {
            throw var5;
        } catch (Throwable var6) {
            throw new UndeclaredThrowableException(var6);
        }
    }

    public final int hashCode() {
        try {
            return (Integer) super.h.invoke(this, m0, (Object[]) null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }

}