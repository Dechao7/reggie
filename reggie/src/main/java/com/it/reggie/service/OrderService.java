package com.it.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.it.reggie.entity.Orders;

public interface OrderService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */
    public void submit(Orders orders);
}
