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
 * @ClassName: DecoyDuck
 * @Description: 诱饵鸭
 * @author Yue Chang
 * @date 2017年6月3日 下午5:00:01
 * @since 1.0
 */
public class DecoyDuck extends Duck{

    /**
     * 不会飞，不会叫
     */
    public DecoyDuck(){
        super.flyBehavior = new FlyNoWay();
        super.quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a decoy duck");
    }
}
