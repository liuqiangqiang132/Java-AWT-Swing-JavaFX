package com.liuqiang.layoutmanger_02;

import javax.swing.*;
import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: 盒子布局管理器
 * @date 2024/5/14 16:53
 */
public class BoxLayoutDemo3 {
    public static void main(String[] args) {

        Frame frame = new Frame("BoxLayout布局管理器");

        //创建水平布局
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(new Button("水平按钮1"));
        horizontalBox.add(Box.createHorizontalGlue());
        horizontalBox.add(new Button("水平按钮2"));
        horizontalBox.add(Box.createHorizontalStrut(30));
        horizontalBox.add(new Button("水平按钮3"));
        //创建垂直布局
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(new Button("垂直按钮1"));
        verticalBox.add(Box.createVerticalGlue());
        verticalBox.add(new Button("垂直按钮2"));
        verticalBox.add(Box.createVerticalStrut(30));
        verticalBox.add(new Button("垂直按钮3"));
        //添加到frame
        frame.add(horizontalBox,BorderLayout.NORTH);
        frame.add(verticalBox);


        frame.pack();
        frame.setVisible(true);
    }
}
