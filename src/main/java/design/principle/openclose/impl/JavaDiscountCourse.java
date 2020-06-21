package design.principle.openclose.impl;

import java.math.BigDecimal;

/**
 * 业务场景：Java课程活动打折
 *
 * @author HaungZhiGao
 * @create  2020-05-11 23:23
 */
public class JavaDiscountCourse extends JavaCourse {
    private BigDecimal discount = new BigDecimal(8.5);

    public JavaDiscountCourse(Long javaCourseId, String javaCourseName, BigDecimal javaCoursePrice) {
        super(javaCourseId, javaCourseName, javaCoursePrice);
    }

    public String getDiscountCourseName() {
        if (new BigDecimal(1).compareTo(this.discount) == 0) {
            return super.getCourseName();
        }
        return super.getCourseName() + "现在起可享" + this.discount.toString() + "折";
    }

    public BigDecimal getDiscountCoursePrice() {
        return super.getCoursePrice().multiply(this.discount);
    }
}