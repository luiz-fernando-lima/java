package br.com.campofutebol.model.dao.entidades;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import br.com.campofutebol.model.entidade.Campo;

/**
 * Created by Luiz Fernando on 01/01/2020.
 */
public class CampoDaoTest {

	private static final String URL = "jdbc:mysql://localhost:3306/campofutebol?useSSL=false";
	private static final String USER = "root";
	private static final String PWD = "root";

	@Test
	public final void inserirTest() {
		Campo campo = new Campo("Principal");
		new CampoDao().inserir(campo);

		assertEquals("Principal", retornoInserir());
	}

	private String retornoInserir() {
		Connection cn = null;
		String retorno = null;
		try {
			cn = DriverManager.getConnection(URL, USER, PWD);
			PreparedStatement ps = cn.prepareStatement("SELECT * FROM CAMP0000 WHERE CODIGO = (SELECT MAX(CODIGO) AS CODIGO FROM CAMP0000)");
			ResultSet rs = ps.executeQuery();
			rs.next();

			retorno = rs.getString("DESCRICAO");

		} catch (SQLException ex) {
			ex.printStackTrace();

		} finally {
			if (cn != null) {
				try {
					cn.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
		}
		return retorno;
	}
}