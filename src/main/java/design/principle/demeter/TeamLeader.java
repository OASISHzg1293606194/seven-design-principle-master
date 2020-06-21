package design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HaungZhiGao
 * @create  2020-06-04 23:24
 */
public class TeamLeader {
    public void commandCheckCourseNumber(Employee employee) {
        List<Course> courseList = new ArrayList<Course>();

        for (int i = 0; i < 100; i++) {
            courseList.add(new Course());
        }
        employee.checkNumberOfCourses(courseList);
    }

    /**
     * 遵循迪米特法则
     */
    public void commandCheckCourseNumberDemeter(Employee employee) {
        employee.checkNumberOfCoursesDemeter();
    }
}
