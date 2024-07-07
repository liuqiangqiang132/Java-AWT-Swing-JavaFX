package com.liuqiang.layoutmanger_02;

import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: 边框布局管理器
 * @date 2024/5/14 15:28
 */
public class BorderLayoutDemo {
    public static void main(String[] args) {

        Frame frame = new Frame("这是borderLayout布局管理器");

        //设置布局管理器
        frame.setLayout(new BorderLayout(30,10));

        //添加按钮
        frame.add(new Button("北侧按钮"), BorderLayout.NORTH);
        frame.add(new Button("南侧按钮"), BorderLayout.SOUTH);
        frame.add(new Button("左侧按钮"), BorderLayout.WEST);
        frame.add(new Button("右侧按钮"), BorderLayout.EAST);
        frame.add(new Button("中间按钮"), BorderLayout.CENTER);




        frame.pack();
        frame.setBounds(500,250,800,600);
        frame.setVisible(true);


    }
}
