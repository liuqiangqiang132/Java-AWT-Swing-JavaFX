package com.liuqiang.layoutmanger_02;

import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: 卡片布局管理器
 * @date 2024/5/14 16:08
 */
public class CardLayoutDemo {
    public static void main(String[] args) {

        /**
         * CardLayout对象是容器的布局管理器。它将容器中的每个组件视为一张卡片。一次只能看到一张卡片，容器就像一堆卡片。第一个添加到CardLayout对象的组件是容器第一次显示时的可见组件。
         * 卡片的顺序由容器自己对其组件对象的内部顺序决定。CardLayout定义了一组方法，
         * 允许应用程序依次浏览这些卡片，或者显示指定的卡片。addLayoutComponent方法可用于将字符串标识符与给定的卡片关联起来，以实现快速随机访问。
         */
        Frame frame = new Frame("卡片布局管理器");

        //创建panel1
        Panel panel1 = new Panel();
        CardLayout cardLayout = new CardLayout();
        panel1.setLayout(cardLayout);
        String [] names = {"第一张","第二张","第三张","第四张","第五张"};
        for (int i = 0; i < names.length; i++) {
            panel1.add(names[i],new Button(names[i]));
        }
        //创建panel2
        Panel panel2 = new Panel();
        Button button1 = new Button("第一张");
        Button button2 = new Button("最后一张");
        Button button3 = new Button("上一张");
        Button button4 = new Button("下一张");
        Button button5 = new Button("第三张");
        //添加监听事件
        ActionListener actionListener = e -> {
            String command = e.getActionCommand();
            switch (command){
                case "第一张":
                    cardLayout.first(panel1);
                    break;
                case "最后一张":
                    cardLayout.last(panel1);
                    break;
                case "上一张":
                    cardLayout.previous(panel1);
                    break;
                case "下一张":
                    cardLayout.next(panel1);
                    break;
                case "第三张":
                    cardLayout.show(panel1,"第三张");
                    break;

            }
        };
        //按钮绑定数据
        button1.addActionListener(actionListener);
        button2.addActionListener(actionListener);
        button3.addActionListener(actionListener);
        button4.addActionListener(actionListener);
        button5.addActionListener(actionListener);
        //panel2添加按钮
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(button4);
        panel2.add(button5);
        //添加panel1,panel2到frame容器中
        frame.add(panel1,BorderLayout.CENTER);
        frame.add(panel2,BorderLayout.SOUTH);


        frame.pack();
        frame.setBounds(500,250,800,600);
        frame.setVisible(true);

    }
}
