package com.junlee.test.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// Class.forName("com.mysql.jdbc.Driver");
		// Class.forName("oracle.jdbc.driver.OracleDriver");
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		String dburl = "jdbc:sqlserver://192.168.201.21\\SQL2008R2_KF9B;databaseName=EpointBid_TP7_xx";
		Connection conn = DriverManager.getConnection(dburl, "sa_kf9b", "Epoint@kf9b");
		Statement stat = conn.createStatement();

		// stat.executeUpdate("insert into people(name,age)values('ÕÅÈý','10')");
		// conn.commit();

		ResultSet rst = stat.executeQuery("select top 1 biaoduanname,rowguid,biaoduanno from cg_biaoduaninfo");
		while (rst.next()) {
			System.out.println(rst.getString(1) + "\t" + rst.getString(2) + "\t" + rst.getString(3));
		}
		// stat.execute("delete from people");

		rst.close();
		stat.close();
		conn.close();
	}
}
