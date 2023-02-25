/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import DataBase.connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.jws.WebService;

/**
 *
 * @author FernandoFreitas
 */
@WebService(serviceName = "login")
public class login {

    private Connection connection;

    public login() {
        connection = new connection().getConnection();
    }

    public int verificaLogin(String login, String senha) {

        try {
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM Usuario WHERE Login='" + login.replace("'", "") + "' AND Senha='" + senha.replace("'", "") + "'");
            if (rs.next()) {
                return Integer.parseInt(rs.getString("id_vendedor"));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);

        }
        return -1;
    }
}
