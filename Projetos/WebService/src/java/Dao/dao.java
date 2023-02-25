/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Controller.controller;
import DataBase.connection;
import Model.ChavePrimaria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.jws.WebService;


/**
 *
 * @author FernandoFreitas
 */
@WebService(serviceName = "dao")
public class dao extends controller {

    private Connection connection;

    public dao()
    {
        connection=new connection().getConnection();
    }
    

    public String inserir(Object dado) {
        try {

            PreparedStatement stmt = connection.prepareStatement(geraSqlInsert(dado));
            stmt.execute();
            stmt.close();

           
            return geraSqlInsert(dado);
 
        } catch (Exception u) {
            return "Falhou";
         
        }


    }

    public String alterar(Object dado, List<ChavePrimaria> chaves) {
        try {

            PreparedStatement stmt = connection.prepareStatement("");
            stmt.execute();
            stmt.close();
   return "Objeto alterado com sucesso!";
    
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
 


    }

    public String excluir(Object dado, List<ChavePrimaria> chaves) {
        try {

            PreparedStatement stmt = connection.prepareStatement("");
            stmt.execute();
            stmt.close();
       return "Objeto excluido com sucesso!";
 
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
}
}