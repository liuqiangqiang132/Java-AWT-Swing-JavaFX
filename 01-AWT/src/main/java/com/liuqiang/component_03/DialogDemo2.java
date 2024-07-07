package com.liuqiang.component_03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: �Ի������
 * @date 2024/5/14 18:01
 */
public class DialogDemo2 {
    public static void main(String[] args) {
        Frame frame = new Frame("�Ի������");

        Dialog dialog = new Dialog(frame, "�򿪶Ի���", true);
        dialog.setBounds(30,20,300,200);
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(new TextField(20));
        verticalBox.add(new Button("ȷ��"));
        dialog.add(verticalBox);

        //������ť
        Button button1 = new Button("ģʽ�Ի���");
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
