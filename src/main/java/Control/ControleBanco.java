package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;
import model.Conta;
import model.ContaCorrente;

public class ControleBanco {

    public Connection abreConexao() {

        String driver = "com.mysql.cj.jdbc.Driver";

        try {
            Class.forName(driver);

            String nomeServidor = "localhost";
            String sgbd = "mysql";
            String minhaBase = "agencia_bancaria";
            String url = "jdbc:" + sgbd + "://" + nomeServidor + "/" + minhaBase;

            String username = "root";
            String senha = "";

            Connection conn = DriverManager.getConnection(url, username, senha);

            System.out.println("Conexão bem sucedida!");
            return conn;

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean criaConta(Connection conn, Conta conta) {
        String sql = "INSERT INTO CONTA (SALDO, TIPO_CONTA) VALUES (?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            String tipo;
            ps.setDouble(1, conta.getSaldo());
            if (conta instanceof ContaCorrente) {
                tipo = "cc";
            } else {
                tipo = "cp";
            }

            ps.setString(2, tipo);

            return ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean insereCliente(Connection conn, Cliente cliente, Conta conta) {
        String sql = "INSERT INTO CLIENTES (NOME,CPF,ENDERECO,NASCIMENTO,SEXO) VALUES (?,?,?,?,?)";
        //+ "	INSERT INTO CONTA_CLIENTE (NUMERO_CONTA, CPF_CLIENTE) VALUES (?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCPF());
            ps.setString(3, cliente.getEndereco());
            ps.setString(4, cliente.getDataNascimento());
            ps.setString(5, cliente.getSexo());
            ps.setInt(6, conta.getNumero());
            ps.setString(7, cliente.getCPF());

            return ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;

    }

    public ArrayList<Cliente> mostraCliente(Connection conn, String CPF) {
        ArrayList<Cliente> Listacliente = new ArrayList<>();

        String sql = "SELECT* FROM CLIENTES WHRE CPF= ? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, CPF);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Cliente cliente = new Cliente();
                cliente.setNome(rs.getString("nome"));
                cliente.setCPF(rs.getString("cpf"));
                cliente.setDataNascimento(rs.getString("datanascimento"));
                cliente.setSexo(rs.getString("Sexo"));
                cliente.setEndereco(rs.getString("Endereco"));

                Listacliente.add(cliente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControleBanco.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Listacliente;
    }

}
