package design.principle.liskovsubstitution;

/**
 * @author HaungZhiGao
 * @create  2020-06-10 23:05
 */
public class LspTest {

    public static void resize(Rectangle rectangle) {
        // 长方形的宽应该大于等于高，我们让高一直自增，直到高等于宽变成正方形
        while (rectangle.getWidth() >= rectangle.getHeight()) {
            rectangle.setHeight(rectangle.getHeight() + 1L);
            System.out.println("Width:" + rectangle.getWidth() + ", Height:" + rectangle.getHeight());
        }
        System.out.println("Resize end, Width:" + rectangle.getWidth() + ", Height:" + rectangle.getHeight());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(20L);
        rectangle.setHeight(10L);
        resize(rectangle);
    }

    /**
     * 此时，如果我们把 resize()方法的参数换成四边形 Quadrangle 类，方法内部就会报错。
     * 因为正方形 Square 已经没有了 setWidth()和 setHeight()方法了。
     * 因此，为了约束继承泛滥，resize()的方法参数只能用 Rectangle 长方形。
     */
    // public static void main(String[] args) {
    //     Square square = new Square();
    //     square.setLength(10L);
    //     resize(square);
    // }

}