package cn.leon.pattern.factory.factory;

import cn.leon.pattern.factory.BakedRaengmyeon;
import cn.leon.pattern.factory.Food;

/**
 * 工厂类
 *（专门做烤冷面的餐厅）
 * @author Leon
 */
public class BakedRaengmyeonFactory implements Factory {
    // 我们只生产烤冷面
    public Food getDelicious() {
        return new BakedRaengmyeon();
    }
}
