package cn.leon.pattern.factory.none;

import cn.leon.pattern.factory.BakedRaengmyeon;

/**
 * 手动获取美食
 * （自己动手，丰衣足食）
 * @author Leon
 */
public class GetDelicious {
    public static void main(String[] args) {
        // 必须亲手做出一份烤冷面，才能享受美食
        System.out.println("烤冷面：" + new BakedRaengmyeon());
        // 哇塞！好累，不想再做蛋堡了！
        // 糟糕的美食体验
    }
}
