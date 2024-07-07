package com.liuqiang.layoutmanger_02;

import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: �߿򲼾ֹ�����
 * @date 2024/5/14 15:28
 */
public class BorderLayoutDemo {
    public static void main(String[] args) {

        Frame frame = new Frame("����borderLayout���ֹ�����");

        //���ò��ֹ�����
        frame.setLayout(new BorderLayout(30,10));

        //��Ӱ�ť
        frame.add(new Button("���ఴť"), BorderLayout.NORTH);
        frame.add(new Button("�ϲఴť"), BorderLayout.SOUTH);
        frame.add(new Button("��ఴť"), BorderLayout.WEST);
        frame.add(new Button("�Ҳఴť"), BorderLayout.EAST);
        frame.add(new Button("�м䰴ť"), BorderLayout.CENTER);




        frame.pack();
        frame.setBounds(500,250,800,600);
        frame.setVisible(true);


    }
}
