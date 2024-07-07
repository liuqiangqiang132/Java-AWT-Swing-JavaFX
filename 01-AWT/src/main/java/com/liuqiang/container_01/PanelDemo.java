package com.liuqiang.container_01;

import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: TODO
 * @date 2024/5/14 14:36
 */
public class PanelDemo {
    public static void main(String[] args) {

        Frame frame = new Frame("这是一个panel容器");
        Panel panel = new Panel();

        panel.add(new TextField("这是一个文本！！！！！"));
        panel.add(new Button("这是一个按钮"));
        frame.add(panel);

        //设置可视化窗口的大小 位置， 可见
        frame.setBounds(300,200,800,600);
        frame.setVisible(true);


    }
}
