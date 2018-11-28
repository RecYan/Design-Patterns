package com.recyan.TemplatePattern;

/**
 * Created by Yan_Jiang on 2018/11/28.
 *
 * 2. 创建具体的模板 去复写抽象模板的抽象方法
 */
public class CookVegetable extends Cook {
    @Override
    void pourFood() {
        System.out.println("加青菜");
    }

    @Override
    void pourSauce() {
        System.out.println("加大蒜头");
    }
}
