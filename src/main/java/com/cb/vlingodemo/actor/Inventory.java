package com.cb.vlingodemo.actor;

import com.cb.vlingodemo.order.Order;
import io.vlingo.actors.Stoppable;

/**
 * @author Chandrabhan Kumhar
 */
public interface Inventory extends Stoppable {

    /**
     * Handles order for inventory
     * @param order {@link Order}
     */
    void handleOrder(Order order);

}
