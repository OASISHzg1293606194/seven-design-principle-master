package design.principle.liskovsubstitution.simple;

/**
 * @author HaungZhiGao
 * @create  2020-06-10 23:05
 */
public class SquareTest {

    public static void resize(Rectangle rectangle) {
        // 长方形的宽应该大于等于高，我们让高一直自增，直到高等于宽变成正方形
        while (rectangle.getWidth() >= rectangle.getHeight()) {
            rectangle.setHeight(rectangle.getHeight() + 1L);
            System.out.println("Width:" + rectangle.getWidth() + ", Height:" + rectangle.getHeight());
        }
        System.out.println("Resize end, Width:" + rectangle.getWidth() + ", Height:" + rectangle.getHeight());
    }

    // public static void main(String[] args) {
    //     Rectangle rectangle = new Rectangle();
    //     rectangle.setWidth(20L);
    //     rectangle.setHeight(10L);
    //     resize(rectangle);
    // }

    public static void main(String[] args) {
        Square square = new Square();
        square.setLength(10L);
        resize(square);
    }

}