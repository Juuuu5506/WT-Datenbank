package mainpackage;

import presenterpackage.MainPresenter;

import java.sql.ResultSet;
import java.sql.SQLException;

import modelpackage.DatenbankVerbindung;

public class MainClass {
	public static void main(String args[]) throws SQLException {
		MainPresenter mp = new MainPresenter();
		mp.startProgram();
		String query = "";
		ResultSet rs = DatenbankVerbindung.connectMariaDB().createStatement().executeQuery(query);
		while (rs.next()) {
			System.out.println(rs.getString(2));
		}
		
	}
}
