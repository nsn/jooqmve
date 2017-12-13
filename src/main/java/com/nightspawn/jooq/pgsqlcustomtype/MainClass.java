package com.nightspawn.jooq.pgsqlcustomtype;

import com.nightspawn.jooq.pgsqlcustomtype.generated.tables.daos.MyTableDao;
import com.nightspawn.jooq.pgsqlcustomtype.generated.tables.pojos.MyTable;
import com.nightspawn.jooq.pgsqlcustomtype.generated.udt.pojos.MyCustomType;
import org.jooq.Configuration;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultConfiguration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainClass {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/pgsqlcustomtype";
        String user = "nsn";
        String password = null;

        if (args.length > 0) {
            url = args[0];
        }
        if (args.length > 1) {
            user = args[1];
        }
        if (args.length > 2) {
            password = args[2];
        }

        Connection connection = DriverManager.getConnection(url, user, password);
        Configuration configuration = new DefaultConfiguration().set(connection).set(SQLDialect.POSTGRES);
        MyTableDao dao = new MyTableDao(configuration);

        MyTable table = new MyTable();

        MyCustomType single = new MyCustomType("single", 1L);
        table.setSingleCount(single);

        MyCustomType arr1 = new MyCustomType("arr1", 1L);
        MyCustomType arr2 = new MyCustomType("arr2", 2L);
        table.setCountArray(arr1, arr2);

        dao.insert(table);
    }
}
