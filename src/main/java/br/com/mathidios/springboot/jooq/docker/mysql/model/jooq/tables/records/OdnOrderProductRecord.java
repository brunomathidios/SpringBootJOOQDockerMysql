/*
 * This file is generated by jOOQ.
 */
package br.com.mathidios.springboot.jooq.docker.mysql.model.jooq.tables.records;


import br.com.mathidios.springboot.jooq.docker.mysql.model.jooq.tables.OdnOrderProduct;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OdnOrderProductRecord extends UpdatableRecordImpl<OdnOrderProductRecord> implements Record3<UInteger, UInteger, UInteger> {

    private static final long serialVersionUID = 2070004775;

    /**
     * Setter for <code>ordernow.odn_order_product.id_order_product</code>.
     */
    public void setIdOrderProduct(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>ordernow.odn_order_product.id_order_product</code>.
     */
    public UInteger getIdOrderProduct() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>ordernow.odn_order_product.id_order</code>.
     */
    public void setIdOrder(UInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>ordernow.odn_order_product.id_order</code>.
     */
    public UInteger getIdOrder() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>ordernow.odn_order_product.id_product</code>.
     */
    public void setIdProduct(UInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>ordernow.odn_order_product.id_product</code>.
     */
    public UInteger getIdProduct() {
        return (UInteger) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<UInteger, UInteger, UInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<UInteger, UInteger, UInteger> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return OdnOrderProduct.ODN_ORDER_PRODUCT.ID_ORDER_PRODUCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field2() {
        return OdnOrderProduct.ODN_ORDER_PRODUCT.ID_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field3() {
        return OdnOrderProduct.ODN_ORDER_PRODUCT.ID_PRODUCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component1() {
        return getIdOrderProduct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component2() {
        return getIdOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component3() {
        return getIdProduct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getIdOrderProduct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value2() {
        return getIdOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value3() {
        return getIdProduct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OdnOrderProductRecord value1(UInteger value) {
        setIdOrderProduct(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OdnOrderProductRecord value2(UInteger value) {
        setIdOrder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OdnOrderProductRecord value3(UInteger value) {
        setIdProduct(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OdnOrderProductRecord values(UInteger value1, UInteger value2, UInteger value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OdnOrderProductRecord
     */
    public OdnOrderProductRecord() {
        super(OdnOrderProduct.ODN_ORDER_PRODUCT);
    }

    /**
     * Create a detached, initialised OdnOrderProductRecord
     */
    public OdnOrderProductRecord(UInteger idOrderProduct, UInteger idOrder, UInteger idProduct) {
        super(OdnOrderProduct.ODN_ORDER_PRODUCT);

        set(0, idOrderProduct);
        set(1, idOrder);
        set(2, idProduct);
    }
}
