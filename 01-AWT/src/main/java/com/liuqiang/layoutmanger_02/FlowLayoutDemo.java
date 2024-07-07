package com.liuqiang.layoutmanger_02;

import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: 流式布局管理器
 * @date 2024/5/14 15:09
 */
public class FlowLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("流式布局管理器");
        //设置容器的布局管理器,并且设置左对齐
        frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
        for (int i = 0; i < 100; i++) {
            frame.add(new Button("按钮"+i));
        }

        //设置最佳大小，及可见
        frame.pack();
        frame.setBounds(500,250,800,600);
        frame.setVisible(true);


    }
}
