package design.principle.compositeaggregatereuse;

/**
 * @author HaungZhiGao
 * @create  2020-06-11 23:14
 */
public class MySqlConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
