package design.principle.liskovsubstitution.simple;

/**
 * @author HaungZhiGao
 * @create  2020-06-10 23:01
 */
public class Square extends Rectangle {
    private long length;

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    @Override
    public long getWidth() {
        return getLength();
    }

    @Override
    public void setWidth(long width) {
        setLength(width);
    }

    @Override
    public long getHeight() {
        return getLength();
    }

    @Override
    public void setHeight(long height) {
        setLength(height);
    }
}
