package com.liuqiang.component_03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: 对话框组件
 * @date 2024/5/14 18:01
 */
public class DialogDemo2 {
    public static void main(String[] args) {
        Frame frame = new Frame("对话看组件");

        Dialog dialog = new Dialog(frame, "打开对话框", true);
        dialog.setBounds(30,20,300,200);
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(new TextField(20));
        verticalBox.add(new Button("确认"));
        dialog.add(verticalBox);

        //创建按钮
        Button button1 = new Button("模式对话框");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true);
            }
        });

        frame.add(button1,BorderLayout.NORTH);

        frame.pack();
        frame.setVisible(true);

    }
}
