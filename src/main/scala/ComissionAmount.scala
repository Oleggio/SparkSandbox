/**
  * Created by Oleggio on 6/1/2017.
  */
import java.sql.DriverManager
import java.sql.Connection

object ComissionAmount {
  def main(args: Array[String]): Unit = {
    val driver = "com.mysql.jdbc.Driver"
    val url = "jdbc:mysql://nn01.itversity.com:3306/hr"
    val username = "hr_ro"
    val password = "itversity"

    Class.forName(driver)
    val connection = DriverManager.getConnection(url, username, password)
    
  }
}
