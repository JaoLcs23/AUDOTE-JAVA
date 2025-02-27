package AudoteClasseDAO;

import java.sql.*;

import AudoteClassesModel.Login;

public class LoginDAO {
    private Connection conn;

    public LoginDAO() {

        this.conn = null;
        String url = "jdbc:mysql://localhost:3306/Audote";
        String user = "root";
        String password = "admin";

        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão com banco de dados estabelecida");
        }

        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean inserir(Login login) {

        String sql = "INSERT INTO Login(email, senha) VALUES (?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, login.getPessoa().getEmail());
            ps.setString(2, login.getPessoa().getSenha());

            ps.execute();

            return true;
        }
        catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}