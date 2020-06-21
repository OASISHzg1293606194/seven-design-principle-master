package design.principle.openclose;

import java.math.BigDecimal;

/**
 * 课程接口
 *
 * @author HaungZhiGao
 * @create  2020-05-11 22:48
 */
public interface ICourse {
    /**
     * 获取课程ID
     *
     * @return Long
     */
    Long getCourseId();

    /**
     * 获取课程名称(标题)
     *
     * @return String
     */
    String getCourseName();

    /**
     * 获取课程价格
     *
     * @return BigDecimal
     */
    BigDecimal getCoursePrice();
}