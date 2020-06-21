package design.principle.dependenceinversion.impl;

import design.principle.dependenceinversion.ICourse;

/**
 * @author HaungZhiGao
 * @create  2020-05-23 21:31
 */
public class JavaCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("学习Java课程");
    }
}