package assignment1;
	import java.io.IOException;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import java.util.List;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	@WebServlet("/submit")
	public class FormServlet extends HttpServlet {
	    private static final long serialVersionUID = 1L;

	    // Database connection parameters
	    private static final String DB_URL = "jdbc:mysql://localhost:8000/formdb";
	    private static final String DB_USER = "root";
	    private static final String DB_PASSWORD = "Rgukt143";

	    @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        // Collect form data
	        String id = request.getParameter("id");
	        String name = request.getParameter("name");
	        String address = request.getParameter("address");
	        String email = request.getParameter("email");
	        String password = request.getParameter("password");

	        // Insert data into database
	        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
	            String sql = "INSERT INTO users (id, name, address, email, password) VALUES (?, ?, ?, ?, ?)";
	            try (PreparedStatement statement = connection.prepareStatement(sql)) {
	                statement.setString(1, id);
	                statement.setString(2, name);
	                statement.setString(3, address);
	                statement.setString(4, email);
	                statement.setString(5, password);
	                statement.executeUpdate();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        // Forward to JSP to display the stored data
	        request.getRequestDispatcher("display.jsp").forward(request, response);
	    }
}
