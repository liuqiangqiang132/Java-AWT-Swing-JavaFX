package com.liuqiang.layoutmanger_02;

import javax.swing.*;
import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: ���Ӳ��ֹ�����
 * @date 2024/5/14 16:53
 */
public class BoxLayoutDemo1 {
    public static void main(String[] args) {

        Frame frame = new Frame("BoxLayout���ֹ�����");

        BoxLayout boxLayout = new BoxLayout(frame, BoxLayout.Y_AXIS);

        frame.setLayout(boxLayout);
        frame.add(new Button("��ť1"));
        frame.add(new Button("��ť2"));
        frame.add(new Button("��ť3"));

        frame.pack();
        frame.setVisible(true);
    }
}
