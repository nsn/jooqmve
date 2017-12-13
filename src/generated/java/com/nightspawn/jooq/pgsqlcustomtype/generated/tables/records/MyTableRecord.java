/*
 * This file is generated by jOOQ.
*/
package com.nightspawn.jooq.pgsqlcustomtype.generated.tables.records;


import com.nightspawn.jooq.pgsqlcustomtype.generated.tables.MyTable;
import com.nightspawn.jooq.pgsqlcustomtype.generated.udt.records.MyCustomTypeRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class MyTableRecord extends UpdatableRecordImpl<MyTableRecord> implements Record3<Long, MyCustomTypeRecord, MyCustomTypeRecord[]> {

    private static final long serialVersionUID = -1148513279;

    /**
     * Setter for <code>public.my_table.table_id</code>.
     */
    public void setTableId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.my_table.table_id</code>.
     */
    public Long getTableId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.my_table.single_count</code>.
     */
    public void setSingleCount(MyCustomTypeRecord value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.my_table.single_count</code>.
     */
    public MyCustomTypeRecord getSingleCount() {
        return (MyCustomTypeRecord) get(1);
    }

    /**
     * Setter for <code>public.my_table.count_array</code>.
     */
    public void setCountArray(MyCustomTypeRecord... value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.my_table.count_array</code>.
     */
    public MyCustomTypeRecord[] getCountArray() {
        return (MyCustomTypeRecord[]) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, MyCustomTypeRecord, MyCustomTypeRecord[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, MyCustomTypeRecord, MyCustomTypeRecord[]> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return MyTable.MY_TABLE.TABLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<MyCustomTypeRecord> field2() {
        return MyTable.MY_TABLE.SINGLE_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<MyCustomTypeRecord[]> field3() {
        return MyTable.MY_TABLE.COUNT_ARRAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getTableId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MyCustomTypeRecord component2() {
        return getSingleCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MyCustomTypeRecord[] component3() {
        return getCountArray();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getTableId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MyCustomTypeRecord value2() {
        return getSingleCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MyCustomTypeRecord[] value3() {
        return getCountArray();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MyTableRecord value1(Long value) {
        setTableId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MyTableRecord value2(MyCustomTypeRecord value) {
        setSingleCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MyTableRecord value3(MyCustomTypeRecord... value) {
        setCountArray(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MyTableRecord values(Long value1, MyCustomTypeRecord value2, MyCustomTypeRecord[] value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MyTableRecord
     */
    public MyTableRecord() {
        super(MyTable.MY_TABLE);
    }

    /**
     * Create a detached, initialised MyTableRecord
     */
    public MyTableRecord(Long tableId, MyCustomTypeRecord singleCount, MyCustomTypeRecord[] countArray) {
        super(MyTable.MY_TABLE);

        set(0, tableId);
        set(1, singleCount);
        set(2, countArray);
    }
}