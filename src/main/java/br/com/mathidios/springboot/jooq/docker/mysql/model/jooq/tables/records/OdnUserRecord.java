/*
 * This file is generated by jOOQ.
 */
package br.com.mathidios.springboot.jooq.docker.mysql.model.jooq.tables.records;


import br.com.mathidios.springboot.jooq.docker.mysql.model.jooq.tables.OdnUser;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class OdnUserRecord extends UpdatableRecordImpl<OdnUserRecord> implements Record4<UInteger, String, String, String> {

    private static final long serialVersionUID = 132986062;

    /**
     * Setter for <code>ordernow.odn_user.id_user</code>.
     */
    public void setIdUser(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>ordernow.odn_user.id_user</code>.
     */
    public UInteger getIdUser() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>ordernow.odn_user.nm_user</code>.
     */
    public void setNmUser(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>ordernow.odn_user.nm_user</code>.
     */
    public String getNmUser() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ordernow.odn_user.login_user</code>.
     */
    public void setLoginUser(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ordernow.odn_user.login_user</code>.
     */
    public String getLoginUser() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ordernow.odn_user.pwd_user</code>.
     */
    public void setPwdUser(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>ordernow.odn_user.pwd_user</code>.
     */
    public String getPwdUser() {
        return (String) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UInteger, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UInteger, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return OdnUser.ODN_USER.ID_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return OdnUser.ODN_USER.NM_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return OdnUser.ODN_USER.LOGIN_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return OdnUser.ODN_USER.PWD_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component1() {
        return getIdUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getNmUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLoginUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPwdUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getIdUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getNmUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLoginUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPwdUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OdnUserRecord value1(UInteger value) {
        setIdUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OdnUserRecord value2(String value) {
        setNmUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OdnUserRecord value3(String value) {
        setLoginUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OdnUserRecord value4(String value) {
        setPwdUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OdnUserRecord values(UInteger value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OdnUserRecord
     */
    public OdnUserRecord() {
        super(OdnUser.ODN_USER);
    }

    /**
     * Create a detached, initialised OdnUserRecord
     */
    public OdnUserRecord(UInteger idUser, String nmUser, String loginUser, String pwdUser) {
        super(OdnUser.ODN_USER);

        set(0, idUser);
        set(1, nmUser);
        set(2, loginUser);
        set(3, pwdUser);
    }
}