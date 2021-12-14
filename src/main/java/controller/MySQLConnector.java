package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Projeto;

/**
 *
 * @author memef
 */
public class MySQLConnector {
    private Connection connection;
    
    public Connection getConnection () {
        return connection;
    }
    
    public boolean connect (String ip, String port, String database, String user, String password) {
        boolean isConnected = false;
        try {
            String url = "jdbc:mysql://" + ip + ":" + port + "/" + database + "?user=" + user +
                    "&password=" + password;
            connection = (Connection) DriverManager.getConnection(url);
            isConnected = true;
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        
        return isConnected;
    }

    public int insert (Projeto projeto) {
        int result = 0;
        
        try {
            String qr = "insert into projetos (nome_projeto, descricao_projeto, nome_solicitante, nome_professor_responsavel, prazo)"
                + " values ('" + projeto.getNome() + "', '" + projeto.getDescricao() + "', '" + projeto.getSolicitante()
                + "', '" + projeto.getProfessor() + "', " + projeto.getPrazo() + ");";
            
            Statement st = (Statement) connection.createStatement();
            result = st.executeUpdate(qr);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return result;
    }
    
    public ResultSet search (String qr) {
        ResultSet rs = null;
        
        try {
            Statement st = (Statement) connection.createStatement();
            rs = st.executeQuery(qr);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return rs;
    }
    
    public int update (int id, Projeto projeto) {
        int result = 0;
        
        try {  
            String qr = "update projetos set nome_projeto = '" + projeto.getNome() + "', descricao_projeto = '"
                + projeto.getDescricao() + "', nome_solicitante = '" + projeto.getSolicitante()
                + "', nome_professor_responsavel = '" + projeto.getProfessor() + "', prazo = '"
                + projeto.getPrazo() + "' where id = " + id + ";";
            System.out.println(qr);
            Statement st = (Statement) connection.createStatement();
            result = st.executeUpdate(qr);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return result;
    }

    public int remove (int id) {
        int result = 0;
        
        try {
            String qr = "delete from projetos where id = " + id;
            Statement st = (Statement) connection.createStatement();
            result = st.executeUpdate(qr);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return result;
    }
}
