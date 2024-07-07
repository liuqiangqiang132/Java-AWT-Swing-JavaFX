package com.liuqiang.event_04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: 事件监听机制
 * @date 2024/5/19 14:16
 */
public class EventDemo01 {

    Frame frame = new Frame("事件监听机制");
    TextField textField = new TextField(30);
    Button button = new Button("确定");

    public void init(){
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(textField);
        verticalBox.add(button);
        //绑定事件
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
