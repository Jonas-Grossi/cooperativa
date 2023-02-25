/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author FernandoFreitas
 */
public class connection {
   
    public Connection getConnection() {
        try {
            Class.forName("org.firebirdsql.jdbc.FBDriver");
            return DriverManager.getConnection("jdbc:firebirdsql:localhost/3050:C:/Users/FernandoFreitas/Desktop/Cooperativa/Projetos/Banco de Dados/BANCO DE DADOS.FDB", "sysdba", "masterkey");

        } catch (Exception h) {
            System.out.println("deu errado");
            throw new RuntimeException(h);
        }

    }
}
