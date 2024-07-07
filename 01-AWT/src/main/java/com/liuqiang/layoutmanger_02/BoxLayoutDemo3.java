package com.liuqiang.layoutmanger_02;

import javax.swing.*;
import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: ���Ӳ��ֹ�����
 * @date 2024/5/14 16:53
 */
public class BoxLayoutDemo3 {
    public static void main(String[] args) {

        Frame frame = new Frame("BoxLayout���ֹ�����");

        //����ˮƽ����
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(new Button("ˮƽ��ť1"));
        horizontalBox.add(Box.createHorizontalGlue());
        horizontalBox.add(new Button("ˮƽ��ť2"));
        horizontalBox.add(Box.createHorizontalStrut(30));
        horizontalBox.add(new Button("ˮƽ��ť3"));
        //������ֱ����
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(new Button("��ֱ��ť1"));
        verticalBox.add(Box.createVerticalGlue());
        verticalBox.add(new Button("��ֱ��ť2"));
        verticalBox.add(Box.createVerticalStrut(30));
        verticalBox.add(new Button("��ֱ��ť3"));
        //��ӵ�frame
        frame.add(horizontalBox,BorderLayout.NORTH);
        frame.add(verticalBox);


        frame.pack();
        frame.setVisible(true);
    }
}
