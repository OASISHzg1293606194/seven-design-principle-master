package design.principle.compositeaggregatereuse.simple;

/**
 * @author HaungZhiGao
 * @create  2020-06-11 23:05
 */
public class DBConnection {
    public String getConnection() {
        return "MySQL数据库连接";
    }

    // 如果在当前类新增获取其他数据库的连接方法，则违背了开闭原则和单一职责原则
}
