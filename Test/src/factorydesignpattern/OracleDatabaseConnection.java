package factorydesignpattern;

public class OracleDatabaseConnection implements DatabaseInterface{

    @Override
    public void createSpecificDatabaseConnection() {
        //TODO database connection
        System.out.println("Oracle");
    }
}
