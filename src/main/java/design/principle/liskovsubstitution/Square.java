package design.principle.liskovsubstitution;

/**
 * @author HaungZhiGao
 * @create  2020-06-10 23:25
 */
public class Square implements QuadRangle {
    private long length;

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    @Override
    public long getHeight() {
        return length;
    }

    @Override
    public long getWidth() {
        return length;
    }
}
