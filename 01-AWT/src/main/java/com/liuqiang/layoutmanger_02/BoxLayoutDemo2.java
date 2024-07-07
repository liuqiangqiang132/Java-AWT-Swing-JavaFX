package com.liuqiang.layoutmanger_02;

import javax.swing.*;
import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: ���Ӳ��ֹ�����
 * @date 2024/5/14 16:53
 */
public class BoxLayoutDemo2 {
    public static void main(String[] args) {

        Frame frame = new Frame("BoxLayout���ֹ�����");

        //����ˮƽ����
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(new Button("ˮƽ��ť1"));
        horizontalBox.add(new Button("ˮƽ��ť2"));
        //������ֱ����
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(new Button("��ֱ��ť1"));
        verticalBox.add(new Button("��ֱ��ť2"));
        frame.add(horizontalBox,BorderLayout.NORTH);
        frame.add(verticalBox,BorderLayout.CENTER);


        frame.pack();
        frame.setVisible(true);
    }
}
