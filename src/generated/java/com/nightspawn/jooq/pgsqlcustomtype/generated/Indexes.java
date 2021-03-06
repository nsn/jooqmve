/*
 * This file is generated by jOOQ.
*/
package com.nightspawn.jooq.pgsqlcustomtype.generated;


import com.nightspawn.jooq.pgsqlcustomtype.generated.tables.MyTable;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling indexes of tables of the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index MY_TABLE_PKEY = Indexes0.MY_TABLE_PKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 extends AbstractKeys {
        public static Index MY_TABLE_PKEY = createIndex("my_table_pkey", MyTable.MY_TABLE, new OrderField[] { MyTable.MY_TABLE.TABLE_ID }, true);
    }
}
