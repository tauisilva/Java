import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ContatoServicos {

    public ContatoServicos() {
        super();
    }

    public void addContato(Contato ctt) {
        Connection conn = ConexaoBD.getConexao();

        try {
            String sql = "INSERT INTO contato "
                    + "(nome,telefone,email) "
                    + "VALUES(?,?,?);";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, ctt.getNome());
            stmt.setString(2, ctt.getTelefone());
            stmt.setString(3, ctt.getEmail());
            stmt.execute();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void attContato(Contato ctt) {
        Connection conn = ConexaoBD.getConexao(); // conexão com o banco de dados{

        try {
            String sql = "UPDATE contato "
                    + "SET nome = ?, telefone = ?, email = ?"
                    + " WHERE id = ?;";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, ctt.getNome());
            stmt.setString(2, ctt.getTelefone());
            stmt.setString(3, ctt.getEmail());
            stmt.setInt(4, ctt.getId());
            stmt.execute();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void delContato(int pID) {
        Connection conn = ConexaoBD.getConexao(); // conexão com o banco de dados
        try {
            String sql = "DELETE FROM contato WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, pID);
            stmt.execute();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Contato> getALL() {
        Connection conn = ConexaoBD.getConexao(); // conexão com o banco de dados
        List<Contato> lista = new ArrayList<Contato>();
        try {
            String sql = "SELECT * FROM contato;";
            Statement stmt = conn.createStatement();
            ResultSet resultado = stmt.executeQuery(sql);

            while (resultado.next()) {
                lista.add(new Contato(resultado.getInt(1),
                        resultado.getString(2),
                        resultado.getString(3),
                        resultado.getString(4)));
            }

            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }

    public List<Contato> getPessoa(String pnome) {
        Connection conn = ConexaoBD.getConexao(); // conexão com o banco de dados
        List<Contato> lista = new ArrayList<Contato>();
        try {
            String sql = "SELECT * FROM contato WHERE nome like ? ;";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + pnome + "%");
            ResultSet resultado = stmt.executeQuery();

            while (resultado.next()) {
                lista.add(new Contato(resultado.getInt(1),
                        resultado.getString(2),
                        resultado.getString(3),
                        resultado.getString(4)));
            }

            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }
    public List<Contato> getPessoaID(int pID) {
        Connection conn = ConexaoBD.getConexao(); // conexão com o banco de dados
        List<Contato> lista = new ArrayList<Contato>();
        try {
            String sql = "SELECT * FROM contato WHERE id = ? ;";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, pID);
            ResultSet resultado = stmt.executeQuery();

            while (resultado.next()) {
                lista.add(new Contato(resultado.getInt(1),
                        resultado.getString(2),
                        resultado.getString(3),
                        resultado.getString(4)));
            }

            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }
}
