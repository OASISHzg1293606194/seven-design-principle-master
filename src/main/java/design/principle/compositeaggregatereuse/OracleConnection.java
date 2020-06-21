package design.principle.compositeaggregatereuse;

/**
 * @author HaungZhiGao
 * @create  2020-06-11 23:15
 */
public class OracleConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "Oracle数据库连接";
    }
}
