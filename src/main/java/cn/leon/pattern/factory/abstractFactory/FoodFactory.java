package cn.leon.pattern.factory.abstractFactory;

import cn.leon.pattern.factory.BakedRaengmyeon;
import cn.leon.pattern.factory.EggBurger;
import cn.leon.pattern.factory.Food;

/**
 * 抽象工厂实现类
 * （五星级深夜食堂美食窗口）
 */
public class FoodFactory extends AbstractFactory {
    // 实际做烤冷面的过程
    @Override
    public Food getBakedRaengmyeon() {
        return new BakedRaengmyeon();
    }

    // 实际做蛋堡的过程
    @Override
    public Food getEggBurger() {
        return new EggBurger();
    }
}
