package com.liuqiang.event_04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: �¼�������
 * @date 2024/5/19 14:34
 */
public class ListenerDemo01 {


    Frame frame = new Frame("�¼�������");
    TextField textField = new TextField(30);
    Choice choice = new Choice();
    public void init(){
        choice.add("���");
        choice.add("��ǿ");
        choice.add("�����");
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(choice);
        horizontalBox.add(textField);
        frame.add(horizontalBox);
        frame.pack();
        frame.setBounds(400,230,800,600);
        frame.setVisible(true);
        //1.����frame�����ļ�����
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //2.�����ı����������ݱ仯
        textField.addTextListener(e -> System.out.println("��ı������Ϊ:"+textField.getText()));
        //3.����ѡ������ѡ��仯
        choice.addItemListener(e -> System.out.println("��ѡ����:"+choice.getSelectedItem()));

    }

    public static void main(String[] args) {
        new ListenerDemo01().init();

    }
}
