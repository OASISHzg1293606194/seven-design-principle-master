package design.principle.demeter;

/**
 * @author HaungZhiGao
 * @create  2020-06-04 23:31
 */
public class TeamLeaderTest {
    public static void main(String[] args) {
        TeamLeader teamLeader = new TeamLeader();
        teamLeader.commandCheckCourseNumber(new Employee());
        teamLeader.commandCheckCourseNumberDemeter(new Employee());
    }
}