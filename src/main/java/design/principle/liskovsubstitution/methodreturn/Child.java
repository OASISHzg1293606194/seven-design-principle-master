package design.principle.liskovsubstitution.methodreturn;

import java.util.HashMap;

/**
 * @author HaungZhiGao
 * @create  2020-06-10 23:59
 */
public class Child extends Base {
    @Override
    public HashMap method() {
        HashMap hashMap = new HashMap();
        System.out.println("执行子类的method");
        hashMap.put("msg", "操作成功");
        return hashMap;
    }
}
