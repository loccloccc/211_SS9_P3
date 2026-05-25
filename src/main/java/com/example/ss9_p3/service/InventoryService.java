package com.example.ss9_p3.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InventoryService {
    private static final Logger logger = LoggerFactory.getLogger(InventoryService.class);

    public void updateStock(String productId, int qty) {

        //logger.info("Bắt đầu cập nhật kho cho SP: " + productId + ", SL: " + qty);
        logger.info("Bắt đầu cập nhật kho cho SP:  {} SL : {} " ,productId,qty);

    }
}
