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
public class DialogDemo1 {
    public static void main(String[] args) {
        Frame frame = new Frame("对话看组件");

        Dialog dialog = new Dialog(frame, "打开对话框", true);
        dialog.setBounds(30,20,300,200);
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(new Button("确认"));
        horizontalBox.add(new Button("取消"));
        dialog.add(horizontalBox);
        Dialog NotDialog = new Dialog(frame, "关闭对话框", false);
        NotDialog.setBounds(30,20,300,200);
        Box horizontalBox1 = Box.createHorizontalBox();
        horizontalBox1.add(new Button("确认"));
        horizontalBox1.add(new Button("取消"));
        NotDialog.add(horizontalBox1);
        //创建按钮
        Button button1 = new Button("模式对话框");
        Button button2 = new Button("模式对话框");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NotDialog.setVisible(true);
            }
        });
        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2);

        frame.pack();
        frame.setVisible(true);

    }
}
