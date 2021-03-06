/*
 * This file is generated by jOOQ.
*/
package com.nightspawn.jooq.pgsqlcustomtype.generated.tables.pojos;


import com.nightspawn.jooq.pgsqlcustomtype.generated.udt.pojos.MyCustomType;

import java.io.Serializable;
import java.util.Arrays;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MyTable implements Serializable {

    private static final long serialVersionUID = 1605646155;

    private Long           tableId;
    private MyCustomType   singleCount;
    private MyCustomType[] countArray;

    public MyTable() {}

    public MyTable(MyTable value) {
        this.tableId = value.tableId;
        this.singleCount = value.singleCount;
        this.countArray = value.countArray;
    }

    public MyTable(
        Long           tableId,
        MyCustomType   singleCount,
        MyCustomType[] countArray
    ) {
        this.tableId = tableId;
        this.singleCount = singleCount;
        this.countArray = countArray;
    }

    public Long getTableId() {
        return this.tableId;
    }

    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    public MyCustomType getSingleCount() {
        return this.singleCount;
    }

    public void setSingleCount(MyCustomType singleCount) {
        this.singleCount = singleCount;
    }

    public MyCustomType[] getCountArray() {
        return this.countArray;
    }

    public void setCountArray(MyCustomType... countArray) {
        this.countArray = countArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MyTable (");

        sb.append(tableId);
        sb.append(", ").append(singleCount);
        sb.append(", ").append(Arrays.toString(countArray));

        sb.append(")");
        return sb.toString();
    }
}
