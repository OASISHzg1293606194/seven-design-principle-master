package design.principle.simpleresponsibility.interfaced.impl;

import design.principle.simpleresponsibility.interfaced.ICourseInfo;
import design.principle.simpleresponsibility.interfaced.ICourseManage;

/**
 * @author HaungZhiGao
 * @create  2020-06-04 22:43
 */
public class CourseImpl implements ICourseInfo, ICourseManage {
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }


    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
