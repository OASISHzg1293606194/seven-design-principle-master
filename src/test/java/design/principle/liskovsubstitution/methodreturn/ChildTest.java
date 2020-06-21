package design.principle.liskovsubstitution.methodreturn;

/**
 * @author HaungZhiGao
 * @create  2020-06-11 0:02
 */
public class ChildTest {

    public static void main(String[] args) {
        /**
         * 都是执行子类的method
         */
        // Child child = new Child();
        Base child = new Child();
        System.out.println(child.method());
    }

}