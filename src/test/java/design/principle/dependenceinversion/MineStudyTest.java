package design.principle.dependenceinversion;

import design.principle.dependenceinversion.impl.GoLangCourse;
import design.principle.dependenceinversion.impl.JavaCourse;
import design.principle.dependenceinversion.impl.PythonCourse;

import static org.junit.Assert.*;

/**
 * @author HaungZhiGao
 * @create  2020-05-23 21:38
 */
public class MineStudyTest {
    public static void main(String[] args) {
        // 依赖注入
        MineStudy mineStudy = new MineStudy();
        mineStudy.studyOfInjection(new JavaCourse());

        // 构造器方式注入
        mineStudy = new MineStudy(new PythonCourse());
        mineStudy.studyOfConstructOrSetter();

        // setter方式注入
        mineStudy = new MineStudy();
        mineStudy.setCourse(new GoLangCourse());
        mineStudy.studyOfConstructOrSetter();
    }
}