package com.liuqiang.layoutmanger_02;

import javax.swing.*;
import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: 盒子布局管理器
 * @date 2024/5/14 16:53
 */
public class BoxLayoutDemo1 {
    public static void main(String[] args) {

        Frame frame = new Frame("BoxLayout布局管理器");

        BoxLayout boxLayout = new BoxLayout(frame, BoxLayout.Y_AXIS);

        frame.setLayout(boxLayout);
        frame.add(new Button("按钮1"));
        frame.add(new Button("按钮2"));
        frame.add(new Button("按钮3"));

        frame.pack();
        frame.setVisible(true);
    }
}
