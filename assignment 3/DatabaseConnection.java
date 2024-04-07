public class DatabaseConnection {
    private static DatabaseConnection instance;
    private String hostname;
    private String username;
    private String password;
    private String databaseName;

    private DatabaseConnection() {
        // Load the database connection information from a configuration file
        loadConfiguration();
    }

    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void executeQuery(String sql) {
        // Execute the SQL query and retrieve the results
        // ...
    }

    public String getHostname() {
        return hostname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    private void loadConfiguration() {

    }
    public static void main(String[] args) {
        DatabaseConnection connection = DatabaseConnection.getInstance();
        System.out.println("Hostname: " + connection.getHostname());
        System.out.println("Username: " + connection.getUsername());
        System.out.println("Password: " + connection.getPassword());
        System.out.println("Database Name: " + connection.getDatabaseName());

        // Execute a SQL query
        connection.executeQuery("SELECT * FROM users");
    }
}