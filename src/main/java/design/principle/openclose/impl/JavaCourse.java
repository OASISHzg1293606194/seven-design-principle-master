package design.principle.openclose.impl;

import design.principle.openclose.ICourse;

import java.math.BigDecimal;

/**
 * Java课程实现类
 *
 * @author HaungZhiGao
 * @create  2020-05-11 23:02
 */
public class JavaCourse implements ICourse {
    private Long javaCourseId;
    private String javaCourseName;
    private BigDecimal javaCoursePrice;

    public JavaCourse(Long javaCourseId, String javaCourseName, BigDecimal javaCoursePrice) {
        this.javaCourseId = javaCourseId;
        this.javaCourseName = javaCourseName;
        this.javaCoursePrice = javaCoursePrice;
    }

    @Override
    public String toString() {
        return "JavaCourse{" +
                "javaCourseId=" + javaCourseId +
                ", javaCourseName='" + javaCourseName + '\'' +
                ", javaCoursePrice=" + javaCoursePrice +
                '}';
    }

    @Override
    public Long getCourseId() {
        return this.javaCourseId;
    }

    @Override
    public String getCourseName() {
        return this.javaCourseName;
    }

    @Override
    public BigDecimal getCoursePrice() {
        return this.javaCoursePrice;
    }
}