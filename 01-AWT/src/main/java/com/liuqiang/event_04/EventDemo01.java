package com.liuqiang.event_04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: �¼���������
 * @date 2024/5/19 14:16
 */
public class EventDemo01 {

    Frame frame = new Frame("�¼���������");
    TextField textField = new TextField(30);
    Button button = new Button("ȷ��");

    public void init(){
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(textField);
        verticalBox.add(button);
        //���¼�
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("hello world!!!!");
            }
        });
        frame.add(verticalBox);

        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
           new EventDemo01().init();

    }
}
