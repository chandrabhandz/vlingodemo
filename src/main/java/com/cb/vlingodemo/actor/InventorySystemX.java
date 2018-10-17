package com.cb.vlingodemo.actor;

import com.cb.vlingodemo.order.Order;
import io.vlingo.actors.Actor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Chandrabhan Kumhar
 * Handles inventory orders for InventorySystemX
 */
public class InventorySystemX extends Actor implements Inventory {

    private static final Logger LOGGER = LogManager.getLogger(InventorySystemX.class);

    @Override
    public void handleOrder(Order orderPlaced) {
        LOGGER.info("Handling : {}", orderPlaced);
    }
}
