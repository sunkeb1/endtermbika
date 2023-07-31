import java.sql.*;

public class HRApp {
    // Database connection parameters
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/endrembika";
    private static final String USER = "postgres";
    private static final String PASSWORD = "0000";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            // 1: добавление и регистрация PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // 2: подключение к базе данных
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            // 3: создание statement object к существующей SQL queries
            statement = connection.createStatement();

            // 4: запрос для получения имен сотрудников
            String query = "SELECT name FROM employees";
            resultSet = statement.executeQuery(query);

            // 5: обработать результаты запроса
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                System.out.println("Employee Name: " + name);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // 6: закрытие
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
