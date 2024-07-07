package com.liuqiang.layoutmanger_02;

import javax.swing.*;
import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: 盒子布局管理器
 * @date 2024/5/14 16:53
 */
public class BoxLayoutDemo2 {
    public static void main(String[] args) {

        Frame frame = new Frame("BoxLayout布局管理器");

        //创建水平布局
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(new Button("水平按钮1"));
        horizontalBox.add(new Button("水平按钮2"));
        //创建垂直布局
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(new Button("垂直按钮1"));
        verticalBox.add(new Button("垂直按钮2"));
        frame.add(horizontalBox,BorderLayout.NORTH);
        frame.add(verticalBox,BorderLayout.CENTER);


        frame.pack();
        frame.setVisible(true);
    }
}
