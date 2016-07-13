package basic
package jdbc

import java.sql.DriverManager
import java.sql.Connection

/**
 * A Scala JDBC connection example by Alvin Alexander,
 * http://alvinalexander.com
 */
object Main {

  def main(args: Array[String]) {
    // connect to the database named "mysql" on the localhost
    val driver = "com.impossibl.postgres.jdbc.PGDriver"
    val url = "jdbc:pgsql://localhost/corpreg"
    val username = "postgres"
    val password = "12344321"

    // there's probably a better way to do this
    var connection:Connection = null

    try {
      // make the connection
      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)

      // create the statement, and run the select query
      val statement = connection.createStatement()
      val resultSet = statement.executeQuery("SELECT * FROM \"user\"")
      while ( resultSet.next() ) {
        val host = resultSet.getString("email")
        val user = resultSet.getString("fullName")
        println("host, user = " + host + ", " + user)
      }
    } catch {
      case e => e.printStackTrace
    }
    connection.close()
  }

}


