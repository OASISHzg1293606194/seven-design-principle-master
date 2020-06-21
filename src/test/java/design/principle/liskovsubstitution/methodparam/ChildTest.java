package design.principle.liskovsubstitution.methodparam;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author HaungZhiGao
 * @create  2020-06-10 23:47
 */
public class ChildTest {

    public static void main(String[] args) {
        // Child child = new Child();
        // HashMap hashMap = new HashMap();
        // Map map = new HashMap();
        // child.method(hashMap);
        // child.method(map);

        // 都是执行父类的method
        // Child child = new Child();
        Base child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }

}