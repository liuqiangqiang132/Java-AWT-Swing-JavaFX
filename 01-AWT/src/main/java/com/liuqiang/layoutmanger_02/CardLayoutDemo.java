package com.liuqiang.layoutmanger_02;

import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: ��Ƭ���ֹ�����
 * @date 2024/5/14 16:08
 */
public class CardLayoutDemo {
    public static void main(String[] args) {

        /**
         * CardLayout�����������Ĳ��ֹ����������������е�ÿ�������Ϊһ�ſ�Ƭ��һ��ֻ�ܿ���һ�ſ�Ƭ����������һ�ѿ�Ƭ����һ����ӵ�CardLayout����������������һ����ʾʱ�Ŀɼ������
         * ��Ƭ��˳���������Լ��������������ڲ�˳�������CardLayout������һ�鷽����
         * ����Ӧ�ó������������Щ��Ƭ��������ʾָ���Ŀ�Ƭ��addLayoutComponent���������ڽ��ַ�����ʶ��������Ŀ�Ƭ������������ʵ�ֿ���������ʡ�
         */
        Frame frame = new Frame("��Ƭ���ֹ�����");

        //����panel1
        Panel panel1 = new Panel();
        CardLayout cardLayout = new CardLayout();
        panel1.setLayout(cardLayout);
        String [] names = {"��һ��","�ڶ���","������","������","������"};
        for (int i = 0; i < names.length; i++) {
            panel1.add(names[i],new Button(names[i]));
        }
        //����panel2
        Panel panel2 = new Panel();
        Button button1 = new Button("��һ��");
        Button button2 = new Button("���һ��");
        Button button3 = new Button("��һ��");
        Button button4 = new Button("��һ��");
        Button button5 = new Button("������");
        //��Ӽ����¼�
        ActionListener actionListener = e -> {
            String command = e.getActionCommand();
            switch (command){
                case "��һ��":
                    cardLayout.first(panel1);
                    break;
                case "���һ��":
                    cardLayout.last(panel1);
                    break;
                case "��һ��":
                    cardLayout.previous(panel1);
                    break;
                case "��һ��":
                    cardLayout.next(panel1);
                    break;
                case "������":
                    cardLayout.show(panel1,"������");
                    break;

            }
        };
        //��ť������
        button1.addActionListener(actionListener);
        button2.addActionListener(actionListener);
        button3.addActionListener(actionListener);
        button4.addActionListener(actionListener);
        button5.addActionListener(actionListener);
        //panel2��Ӱ�ť
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(button4);
        panel2.add(button5);
        //���panel1,panel2��frame������
        frame.add(panel1,BorderLayout.CENTER);
        frame.add(panel2,BorderLayout.SOUTH);


        frame.pack();
        frame.setBounds(500,250,800,600);
        frame.setVisible(true);

    }
}
