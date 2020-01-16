package cn.leon.pattern.factory.abstractFactory;

import cn.leon.pattern.factory.Food;

/**
 * 抽象工厂
 * （五星级的深夜食堂）
 * @author Leon
 */
public abstract class AbstractFactory {
    // 烤冷面
    public abstract Food getBakedRaengmyeon();
    // 蛋堡
    public abstract Food getEggBurger();
}
