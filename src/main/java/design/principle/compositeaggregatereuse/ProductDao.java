package design.principle.compositeaggregatereuse;

import javax.sound.midi.Soundbank;

/**
 * @author HaungZhiGao
 * @create  2020-06-11 23:16
 */
public class ProductDao {
    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String connection = dbConnection.getConnection();
        System.out.println("使用[" + connection + "]增加产品");
    }

}
