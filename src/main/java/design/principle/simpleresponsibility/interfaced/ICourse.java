package design.principle.simpleresponsibility.interfaced;

/**
 * @author HaungZhiGao
 * @create  2020-06-04 22:38
 */
public interface ICourse {
    // 当前接口是没有进行职责拆分的
    /**
     * 展示职责
     */
    String getCourseName();
    byte[] getCourseVideo();

    /**
     * 管理职责
     */
    void studyCourse();
    void refundCourse();
}
