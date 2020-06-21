package design.principle.simpleresponsibility.simple;

/**
 * @author HaungZhiGao
 * @create  2020-06-04 22:25
 */
public class Course {
    private static final String COURSE_MARK = "直播课";

    public void studyCourse(String courseName) {
        // 没有使用单一职责原则进行解耦时
        if (COURSE_MARK.equals(courseName)) {
            System.out.println("不能快进");
        } else {
            System.out.println("可以任意的来回播放");
        }

        // 使用LiveCourse和ReplayCourse对Course进行解耦
    }
}
