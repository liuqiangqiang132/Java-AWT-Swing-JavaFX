package com.liuqiang.event_04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: 事件监听器
 * @date 2024/5/19 14:34
 */
public class ListenerDemo01 {


    Frame frame = new Frame("事件监听器");
    TextField textField = new TextField(30);
    Choice choice = new Choice();
    public void init(){
        choice.add("舒淇");
        choice.add("刘强");
        choice.add("凌玉洁");
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(choice);
        horizontalBox.add(textField);
        frame.add(horizontalBox);
        frame.pack();
        frame.setBounds(400,230,800,600);
        frame.setVisible(true);
        //1.监听frame容器的监听器
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //2.监听文本输入框的数据变化
        textField.addTextListener(e -> System.out.println("你改变的数据为:"+textField.getText()));
        //3.监听选择器的选择变化
        choice.addItemListener(e -> System.out.println("你选择了:"+choice.getSelectedItem()));

    }

    public static void main(String[] args) {
        new ListenerDemo01().init();

    }
}
