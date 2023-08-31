package factorydesignpattern;

public class DataBaseService {
    public static void main(String arg[]) {
        DatabaseFactory database = new DatabaseFactory();
        DatabaseInterface databaseInf = database.createDatabase("sybase");
        databaseInf.createSpecificDatabaseConnection();
    }
}
