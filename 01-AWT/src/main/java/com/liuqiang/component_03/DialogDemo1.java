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
public class DialogDemo1 {
    public static void main(String[] args) {
        Frame frame = new Frame("�Ի������");

        Dialog dialog = new Dialog(frame, "�򿪶Ի���", true);
        dialog.setBounds(30,20,300,200);
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(new Button("ȷ��"));
        horizontalBox.add(new Button("ȡ��"));
        dialog.add(horizontalBox);
        Dialog NotDialog = new Dialog(frame, "�رնԻ���", false);
        NotDialog.setBounds(30,20,300,200);
        Box horizontalBox1 = Box.createHorizontalBox();
        horizontalBox1.add(new Button("ȷ��"));
        horizontalBox1.add(new Button("ȡ��"));
        NotDialog.add(horizontalBox1);
        //������ť
        Button button1 = new Button("ģʽ�Ի���");
        Button button2 = new Button("ģʽ�Ի���");
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
