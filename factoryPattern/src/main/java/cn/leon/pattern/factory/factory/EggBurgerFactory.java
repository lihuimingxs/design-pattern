package cn.leon.pattern.factory.factory;

import cn.leon.pattern.factory.EggBurger;
import cn.leon.pattern.factory.Food;

/**
 * 工厂类
 *（专门做蛋堡的餐厅）
 * @author Leon
 */
public class EggBurgerFactory implements Factory {
    // 我们只生产蛋堡
    public Food getDelicious() {
        return new EggBurger();
    }
}
