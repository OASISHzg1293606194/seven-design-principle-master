package design.principle.dependenceinversion.impl;

import design.principle.dependenceinversion.ICourse;

/**
 * @author HaungZhiGao
 * @create  2020-05-23 21:33
 */
public class GoLangCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("学习Go语言课程");
    }
}