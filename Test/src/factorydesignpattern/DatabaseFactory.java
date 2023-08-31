package factorydesignpattern;

public class DatabaseFactory {

    public DatabaseInterface createDatabase(String database) {
        switch (database) {
            case "sybase":
                return new SybaseDatabaseConnection();
            case "oracle":
                return new OracleDatabaseConnection();
            case "mysql":
                return new MysqlDatabaseConnection();
            default:
                throw new IllegalArgumentException("Unknown databse "+ database);
        }
    }
}
