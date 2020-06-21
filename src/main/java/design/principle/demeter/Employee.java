package design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HaungZhiGao
 * @create  2020-06-04 23:25
 */
public class Employee {
    public void checkNumberOfCourses(List<Course> courses) {
        System.out.println("目前已发布的课程数量是：" + courses.size());
    }

    public void checkNumberOfCoursesDemeter() {
        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 100; i++) {
            courseList.add(new Course());
        }

        System.out.println("目前已发布的课程数量是：" + courseList.size());
    }
}
