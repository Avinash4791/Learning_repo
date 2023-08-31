package factorydesignpattern;

public class MysqlDatabaseConnection implements DatabaseInterface{

    @Override
    public void createSpecificDatabaseConnection() {
        //TODO database connection
        System.out.println("Mysql");
    }
}
