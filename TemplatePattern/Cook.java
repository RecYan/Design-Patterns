package com.recyan.TemplatePattern;

/**
 * Created by Yan_Jiang on 2018/11/28.
 * 1. 抽象模板结构: 创建一个抽象类，模板方法被设置为final。
 */
public abstract class Cook {

    //申明为final，控制流程的执行顺序
    final void cook(){
        //倒油
        this.pourOil();
        //倒食材
        this.pourFood();
        //第四步：倒调味料
        this.pourSauce();
        //第五步：翻炒
        this.fry();
    }
    void pourOil(){
        System.out.println("倒油");
    }
    //食材每次都不一样 抽象出来 让子类去具体实现
    abstract void pourFood();
    //菜的口味每次也不一样 抽象出来 让子类去具体实现
    abstract void pourSauce();
    void fry(){
        System.out.println("开炒");
    }
}
