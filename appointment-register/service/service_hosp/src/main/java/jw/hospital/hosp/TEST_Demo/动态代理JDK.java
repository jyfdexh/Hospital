package jw.hospital.hosp.TEST_Demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author JYF
 * @create 2021/4/14 18:40
 */
public class 动态代理JDK {
    interface speaker {
        public void speak();
    }

    static class ZhangSan implements speaker {
        @Override
        public void speak() {
            System.out.println( "张三说。。。" );
        }
    }

    static class ZhangSanLawyer implements InvocationHandler {
        private Object object;

        public ZhangSanLawyer(Object object) {
            this.object = object;
        }

        @Override
        public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
            return null;
        }
    }

    public static void main(String[] args) {

    }
}
