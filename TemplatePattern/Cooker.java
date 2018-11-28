package com.recyan.TemplatePattern;

/**
 * Created by Yan_Jiang on 2018/11/28.
 * 3. 调用抽象模板中的final方法
 */
public class Cooker {


    public static void main(String[] args) {
        Cook cook = new CookMeat();
        cook.cook();

        System.out.println("------------------------------------------------");
        Cook cook1 = new CookVegetable();
        cook1.cook();
    }


}
