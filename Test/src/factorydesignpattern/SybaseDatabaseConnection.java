package factorydesignpattern;

public class SybaseDatabaseConnection implements DatabaseInterface{

    @Override
    public void createSpecificDatabaseConnection() {
        //TODO database connection
        System.out.println("Syabse");
    }
}
