package com.logging.project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Orders {

	private static final Logger logger = LogManager.getLogger(Orders.class);

	public void placeOrder(String itemName, int qty) {
		long startTime = System.currentTimeMillis();
		logger.info("placeOrder() started for item: {}, quantity: {} at {}", itemName, qty, startTime);

		try {
			// business logic to place orders
			logger.debug("Processing order for item: {}, quantity: {}", itemName, qty);

			// Simulate order placement logic here
			// e.g., orderService.placeOrder(itemName, qty);
			Thread.sleep(5000);

		} catch (Exception e) {
			logger.warn("Warning while placing order for item: {}, quantity: {}", itemName, qty);
			logger.error("Error occurred while placing order for item: {}, quantity: {}", itemName, qty, e);
		}

		long endTime = System.currentTimeMillis();
		logger.info("placeOrder() completed for item: {}, quantity: {} at {}. Duration: {} ms", itemName, qty, endTime,
				(endTime - startTime));
	}

}
