package design.principle.dependenceinversion;

/**
 * @author HaungZhiGao
 * @create  2020-05-23 21:19
 */
public class MineStudy {
    private ICourse course;

    /**
     * 依赖注入
     */
    public void studyOfInjection(ICourse course) {
        course.study();
    }

    public MineStudy() {
    }

    /**
     * 构造器方式注入
     */
    public MineStudy(ICourse course) {
        this.course = course;
    }

    /**
     * setter 方式注入
     *
     * @param course
     */
    public void setCourse(ICourse course) {
        this.course = course;
    }

    public void studyOfConstructOrSetter() {
        course.study();
    }
}