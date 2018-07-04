/*
 * This file is generated by jOOQ.
 */
package br.com.mathidios.springboot.jooq.docker.mysql.model.jooq;


import br.com.mathidios.springboot.jooq.docker.mysql.model.jooq.tables.OdnDishe;
import br.com.mathidios.springboot.jooq.docker.mysql.model.jooq.tables.OdnOrder;
import br.com.mathidios.springboot.jooq.docker.mysql.model.jooq.tables.OdnOrderProduct;
import br.com.mathidios.springboot.jooq.docker.mysql.model.jooq.tables.OdnProduct;
import br.com.mathidios.springboot.jooq.docker.mysql.model.jooq.tables.OdnRestaurant;
import br.com.mathidios.springboot.jooq.docker.mysql.model.jooq.tables.OdnUser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Ordernow extends SchemaImpl {

    private static final long serialVersionUID = -655446373;

    /**
     * The reference instance of <code>ordernow</code>
     */
    public static final Ordernow ORDERNOW = new Ordernow();

    /**
     * The table <code>ordernow.odn_dishe</code>.
     */
    public final OdnDishe ODN_DISHE = br.com.mathidios.springboot.jooq.docker.mysql.model.jooq.tables.OdnDishe.ODN_DISHE;

    /**
     * The table <code>ordernow.odn_order</code>.
     */
    public final OdnOrder ODN_ORDER = br.com.mathidios.springboot.jooq.docker.mysql.model.jooq.tables.OdnOrder.ODN_ORDER;

    /**
     * The table <code>ordernow.odn_order_product</code>.
     */
    public final OdnOrderProduct ODN_ORDER_PRODUCT = br.com.mathidios.springboot.jooq.docker.mysql.model.jooq.tables.OdnOrderProduct.ODN_ORDER_PRODUCT;

    /**
     * The table <code>ordernow.odn_product</code>.
     */
    public final OdnProduct ODN_PRODUCT = br.com.mathidios.springboot.jooq.docker.mysql.model.jooq.tables.OdnProduct.ODN_PRODUCT;

    /**
     * The table <code>ordernow.odn_restaurant</code>.
     */
    public final OdnRestaurant ODN_RESTAURANT = br.com.mathidios.springboot.jooq.docker.mysql.model.jooq.tables.OdnRestaurant.ODN_RESTAURANT;

    /**
     * The table <code>ordernow.odn_user</code>.
     */
    public final OdnUser ODN_USER = br.com.mathidios.springboot.jooq.docker.mysql.model.jooq.tables.OdnUser.ODN_USER;

    /**
     * No further instances allowed
     */
    private Ordernow() {
        super("ordernow", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            OdnDishe.ODN_DISHE,
            OdnOrder.ODN_ORDER,
            OdnOrderProduct.ODN_ORDER_PRODUCT,
            OdnProduct.ODN_PRODUCT,
            OdnRestaurant.ODN_RESTAURANT,
            OdnUser.ODN_USER);
    }
}
