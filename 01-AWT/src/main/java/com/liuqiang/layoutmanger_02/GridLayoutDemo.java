package com.liuqiang.layoutmanger_02;

import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: ���񲼾ֹ�����
 * @date 2024/5/14 15:42
 */
public class GridLayoutDemo {
    public static void main(String[] args) {

        //�������Ĳ�������
        Frame frame = new Frame("���񲼾ֹ�����ʵ�ּ���������");
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(5,5,5,5));
        frame.add(new TextField(""),BorderLayout.NORTH);
        for (int i = 0; i <=9; i++) {
            panel.add(new Button(""+i));
        }
        panel.add(new Button("+"));
        panel.add(new Button("-"));
        panel.add(new Button("*"));
        panel.add(new Button("/"));
        panel.add(new Button("="));
        frame.add(panel,BorderLayout.CENTER);


        frame.pack();
        //frame.setBounds(500,250,800,600);
        frame.setVisible(true);


    }
}
