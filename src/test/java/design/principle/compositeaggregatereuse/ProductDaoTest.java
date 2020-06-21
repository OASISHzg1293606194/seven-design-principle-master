package design.principle.compositeaggregatereuse;

/**
 * @author HaungZhiGao
 * @create  2020-06-11 23:26
 */
public class ProductDaoTest {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new MySqlConnection());
        productDao.addProduct();
        productDao.setDbConnection(new OracleConnection());
        productDao.addProduct();
    }
}