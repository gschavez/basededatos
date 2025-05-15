    package org.example.utils;

    import org.example.dao.AutorDAO;
    import org.example.model.Autores;

    import java.sql.*;
    import java.util.ArrayList;
    import java.util.List;

    public class AutorDAOImpl implements AutorDAO {

        @Override
        public void agregarAutor(Autores autor) {
            String sql = "INSERT INTO autor(nombre,apellido, nacionalidad ,autorId) VALUES (?, ?, ? , ?)";
            try (Connection conn = ConexionBD.getConnection();
                 PreparedStatement ps = conn.prepareStatement(sql)) {

                ps.setString(1, autor.getNombre());
                ps.setString(2, autor.getApellido());
                ps.setString(3,  autor.getNacionalidad());
                ps.setInt(4, autor.getAutorId());
                ps.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        @Override
        public List<Autores> obtenerTodos() {
            List<Autores> autores = new ArrayList<>();
            String sql = "SELECT * FROM autor";

            try (Connection conn = ConexionBD.getConnection();
                 Statement st = conn.createStatement();
                 ResultSet rs = st.executeQuery(sql)) {

                while (rs.next()) {
                    Autores autor = new Autores();
                    autor.setAutorId(rs.getInt("id"));
                    autor.setNombre(rs.getString("nombre"));
                    autor.setNacionalidad(rs.getString("nacionalidad"));
                    autores.add(autor);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return autores;
        }



    }