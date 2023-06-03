package com.it.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.it.reggie.entity.Dish;
import com.it.reggie.entity.DishFlavor;
import com.it.reggie.mapper.DishFlavorMapper;
import com.it.reggie.service.DishFlavorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishFlavorServiceImpl  extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
