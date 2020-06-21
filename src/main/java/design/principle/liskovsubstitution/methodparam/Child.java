package design.principle.liskovsubstitution.methodparam;

import java.util.Map;

/**
 * @author HaungZhiGao
 * @create  2020-06-10 23:42
 */
public class Child extends Base {
    // @Override
    // public void method(HashMap hashMap) {
    //     System.out.println("执行子类HashMap入参方法");
    // }




    // public void method(HashMap map) {
    //     System.out.println("执行子类Map入参方法");
    // }

    public void method(Map map) {
        System.out.println("执行子类Map入参方法");
    }
}
