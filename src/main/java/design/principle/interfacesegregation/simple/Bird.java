package design.principle.interfacesegregation.simple;

/**
 * @author HaungZhiGao
 * @create  2020-06-04 23:11
 */
public class Bird implements IAnimal {
    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }

    /**
     * 不会游泳，不需要实现这个方法
     */
    @Override
    public void swim() {

    }
}
