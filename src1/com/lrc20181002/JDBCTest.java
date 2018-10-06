package com.lrc20181002;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCTest {
	public void testGetConnection2() throws ClassNotFoundException, IOException, SQLException {
		
		System.out.println(GetConnection2());
		
		
		
		
		
	}
	
	
	
	
	
   /**
    * 
    * 	@throws IOException 
 * @throws ClassNotFoundException 
 * @throws SQLException 
 * @throws   
 * @Test
    */

	public Connection GetConnection2() throws IOException, ClassNotFoundException, SQLException {
		
		//1.准备连接数据库的四个字符串
		
		//1)创建Properties对象
		Properties properties=new  Properties();
		//2)获取jdbc.properties对应的输入流
		InputStream in=this.getClass().getClassLoader().getResourceAsStream("jdbc.properties");
		//3)加载2)对应的输入流
		properties.load(in);
		//4)为具体决定 user ,password 等4个字符串
		String  user=properties.getProperty("user");
		String  password=properties.getProperty("password");
		String jdbcurl=properties.getProperty("jdbcurl");
		String  driver=properties.getProperty("user");
		
		
		
		
		
		//2.加载数据库驱动(对应的Driver 实现类中有注册驱动的静态代码块)
		
		  Class.forName(driver);
		//3,通过DriverManager的getConnection() 方法获取数据库连接
		return DriverManager.getConnection(jdbcurl, user, password);
		
		
		
		
		
	}
	
	
	
	
	public void TestDriverManager() throws   Exception{
		
		
		//1,准备连接库的四个字符串
		String driverClass = null;//驱动的全类名
		String jdbcUrl = null;
		String user = null;
		String password = null;

		// 读取类路径下的jdbc.properties

		InputStream in = getClass().getClassLoader().getResourceAsStream("jdbc.properties");
    // InputStram in=getClass().getClassLoader().getRrsourceAsStream("jdbc.properties");
		Properties properties = new Properties();
		properties.load(in);

		driverClass = properties.getProperty("driver");
		jdbcUrl = properties.getProperty("jdbcUrl");
		user = properties.getProperty("user");
		password = properties.getProperty("password");
		//2.加载驱动程序
		
		Class.forName(driverClass);
		
		//3通过Drivermanager的getconnection()方法获取数据库连接 
	  Connection connection=DriverManager.getConnection(jdbcUrl, user, password);
		System.out.println(connection);
		
		
	}
	
	
	
	
	
	
	
	public void TestDriver() throws SQLException {
		// add to bulid path
		// 创建一Driver 实现类的对象
		Driver driver = new com.mysql.jdbc.Driver();
		String url = "jdbc:mysql://localhost:3306/myschool";
		Properties info = new Properties();
		// 准备连接数据库的基本信息
		info.put("user", "root");
		info.put("password", "1234");
		// 调用Driver 接口 connect(url,info)获取数据库连接
		Connection connection = driver.connect(url, info);
		System.out.println(connection);

	}

	public Connection getConnection()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, IOException {

		String driverClass = null;
		String jdbcUrl = null;
		String user = null;
		String password = null;

		// 读取类路径下的jdbc.properties

		InputStream in = getClass().getClassLoader().getResourceAsStream("jdbc.properties");
    // InputStram in=getClass().getClassLoader().getRrsourceAsStream("jdbc.properties");
		Properties properties = new Properties();
		properties.load(in);

		driverClass = properties.getProperty("driver");
		jdbcUrl = properties.getProperty("jdbcUrl");
		user = properties.getProperty("user");
		password = properties.getProperty("password");

		Driver driver = (Driver) Class.forName(driverClass).newInstance();

		Properties info = new Properties();
		info.put("user", "root");
		info.put("password", "1234");
		Connection connection = driver.connect(jdbcUrl, info);

		return connection;
	}

	public void testGetConnection()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, IOException {

		System.out.println(getConnection());

	}

}
