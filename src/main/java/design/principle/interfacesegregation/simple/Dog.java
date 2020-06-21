package design.principle.interfacesegregation.simple;

/**
 * @author HaungZhiGao
 * @create  2020-06-04 23:12
 */
public class Dog implements IAnimal {
    @Override
    public void eat() {

    }

    /**
     * 不会飞，不需要实现这个方法
     */
    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
