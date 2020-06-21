package design.principle.openclose.impl;

import java.math.BigDecimal;

/**
 * @author HaungZhiGao
 * @create  2020-05-11 23:15
 */
public class JavaCourseTest {

    public static void main(String[] args) {
        JavaCourse javaCourse = new JavaDiscountCourse(1001L, "Java架构", new BigDecimal(8000));
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) javaCourse;
        System.out.println(javaDiscountCourse.getDiscountCourseName());
        System.out.println(javaDiscountCourse.getDiscountCoursePrice());
    }
}