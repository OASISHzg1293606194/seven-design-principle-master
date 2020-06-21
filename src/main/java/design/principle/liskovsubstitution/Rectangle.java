package design.principle.liskovsubstitution;

/**
 * @author HaungZhiGao
 * @create  2020-06-10 23:23
 */
public class Rectangle implements QuadRangle {
    private long width;
    private long height;

    public void setWidth(long width) {
        this.width = width;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    @Override
    public long getWidth() {
        return width;
    }

    @Override
    public long getHeight() {
        return height;
    }
}
