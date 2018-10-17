package com.cb.vlingodemo.actor;

import com.cb.vlingodemo.order.OrderPlaced;
import io.vlingo.actors.Stoppable;

/**
 * @author Chandrabhan Kumhar
 * Dispatches order to specific Inventory for further processing
 */
public interface OrderRouter extends Stoppable {

    /**
     * Routes orders to specific inventory
     * @param orderPlaced {@link OrderPlaced}
     */
    void routeOrder(final OrderPlaced orderPlaced);

}
