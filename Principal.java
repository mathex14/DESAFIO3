package br.unipe.mt3.dados;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.unipe.mt3.modelo.Conta;

public class Principal {

	public static void main(String[] args) {

		try {

			Conta bak = new Conta();
			Class.forName("org.postgresql.Driver");

			String url = "jdbc:postgresql://localhost:1521/bancario";
			String login = "postgres";
			String senha = "123456";

			Connection con = DriverManager.getConnection(url, login, senha);

			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery("SELECT * FROM conta");
			List<Conta> listaContas = new ArrayList<Conta>();
			while (rs.next()) {
				int id = rs.getInt("id");
				String numero = rs.getString("numero");
				double saldo = rs.getDouble("saldo");
				boolean status = rs.getBoolean("status");
				String titular = rs.getString("titular");

				bak.setId(id);
				bak.setNumero(numero);
				bak.setSaldo(saldo);
				bak.setStatus(status);
				bak.setTitular(titular);

				listaContas.add(bak);


				rs.close();
				st.close();
				con.close();

			}
			
	        for (Conta c : listaContas) {
	            System.out.println(c);
	        }

		} catch (SQLException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
}
