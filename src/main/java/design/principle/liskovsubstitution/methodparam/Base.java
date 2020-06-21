package design.principle.liskovsubstitution.methodparam;

import java.util.HashMap;

/**
 * @author HaungZhiGao
 * @create  2020-06-10 23:36
 */
public class Base {
    public void method(HashMap hashMap) {
        System.out.println("执行父类HashMap入参方法");
    }

}
