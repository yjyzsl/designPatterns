/*
 * Copyright (c) 2016, 2025, HHLY and/or its affiliates. All rights reserved.
 * HHLY PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package com.yc.pattern.strategy;

/**
 * @ClassName: MallardDuck
 * @Description: 野鸭
 * @author Yue Chang
 * @date 2017年6月3日 下午5:00:01
 * @since 1.0
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        super.flyBehavior = new FlyWithWings();
        super.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("i'm a mallar duck");
    }
}
