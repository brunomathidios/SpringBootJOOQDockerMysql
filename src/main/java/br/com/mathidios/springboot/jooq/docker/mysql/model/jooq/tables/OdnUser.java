/*
 * This file is generated by jOOQ.
 */
package br.com.mathidios.springboot.jooq.docker.mysql.model.jooq.tables;


import br.com.mathidios.springboot.jooq.docker.mysql.model.jooq.Indexes;
import br.com.mathidios.springboot.jooq.docker.mysql.model.jooq.Keys;
import br.com.mathidios.springboot.jooq.docker.mysql.model.jooq.Ordernow;
import br.com.mathidios.springboot.jooq.docker.mysql.model.jooq.tables.records.OdnUserRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
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
public class OdnUser extends TableImpl<OdnUserRecord> {

    private static final long serialVersionUID = -2009498438;

    /**
     * The reference instance of <code>ordernow.odn_user</code>
     */
    public static final OdnUser ODN_USER = new OdnUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OdnUserRecord> getRecordType() {
        return OdnUserRecord.class;
    }

    /**
     * The column <code>ordernow.odn_user.id_user</code>.
     */
    public final TableField<OdnUserRecord, UInteger> ID_USER = createField("id_user", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>ordernow.odn_user.nm_user</code>.
     */
    public final TableField<OdnUserRecord, String> NM_USER = createField("nm_user", org.jooq.impl.SQLDataType.VARCHAR(150).nullable(false), this, "");

    /**
     * The column <code>ordernow.odn_user.login_user</code>.
     */
    public final TableField<OdnUserRecord, String> LOGIN_USER = createField("login_user", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>ordernow.odn_user.pwd_user</code>.
     */
    public final TableField<OdnUserRecord, String> PWD_USER = createField("pwd_user", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>ordernow.odn_user</code> table reference
     */
    public OdnUser() {
        this(DSL.name("odn_user"), null);
    }

    /**
     * Create an aliased <code>ordernow.odn_user</code> table reference
     */
    public OdnUser(String alias) {
        this(DSL.name(alias), ODN_USER);
    }

    /**
     * Create an aliased <code>ordernow.odn_user</code> table reference
     */
    public OdnUser(Name alias) {
        this(alias, ODN_USER);
    }

    private OdnUser(Name alias, Table<OdnUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private OdnUser(Name alias, Table<OdnUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> OdnUser(Table<O> child, ForeignKey<O, OdnUserRecord> key) {
        super(child, key, ODN_USER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Ordernow.ORDERNOW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ODN_USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OdnUserRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_ODN_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OdnUserRecord> getPrimaryKey() {
        return Keys.KEY_ODN_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OdnUserRecord>> getKeys() {
        return Arrays.<UniqueKey<OdnUserRecord>>asList(Keys.KEY_ODN_USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OdnUser as(String alias) {
        return new OdnUser(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OdnUser as(Name alias) {
        return new OdnUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OdnUser rename(String name) {
        return new OdnUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OdnUser rename(Name name) {
        return new OdnUser(name, null);
    }
}