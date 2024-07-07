package com.liuqiang.container_01;

import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: window
 * @date 2024/5/14 14:32
 */
public class WindowDemo {
    public static void main(String[] args) {

        //创建窗口对象
        Frame frame = new Frame("这是一个window对象");
        //设置位置，大小
        frame.setBounds(300,200,800,600);
        //设置可见
        frame.setVisible(true);

    }
}
