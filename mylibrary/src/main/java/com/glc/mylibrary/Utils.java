package com.glc.mylibrary;

/**
 * @description:
 * @date: 2024/1/10 18:33
 * @author: gaolicong
 * @email: gaolicong6@gmail.com
 */
public class Utils {
    private volatile static Utils instance;
    public static Utils getInstance() {
        if (instance == null) {
            synchronized (Utils.class) {
                if (instance == null) {
                    instance = new Utils();
                }
            }
        }
        return instance;
    }


    /**
     * 这是一个测试求和的
     * @param x
     * @param y
     * @return
     */
    public int add(int x, int y){
        return x+y;
    }
}
