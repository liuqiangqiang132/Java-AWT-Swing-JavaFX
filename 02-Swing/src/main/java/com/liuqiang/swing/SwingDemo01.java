package com.liuqiang.swing;

import javax.swing.*;

/**
 *
 */
public class SwingDemo01 {
   private final JFrame jFrame = new JFrame("��һ��JFrameӦ�ó���");

    public void init(){

        jFrame.setBounds(400,250,800,600);
        jFrame.setVisible(true);
        /**
         *
         * ����frame���õĶ࣬awt��Ҫʹ�ùرմ����¼���
         */
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        new SwingDemo01().init();
    }
}
