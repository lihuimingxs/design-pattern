package cn.leon.pattern.factory.factory;

import cn.leon.pattern.factory.Food;

/**
 * 工厂类
 * （台东步行街）
 * @author Leon
 */
public interface Factory {
    // 我这里是美食街，拥有生产各种美食的商家
    Food getDelicious();
}
