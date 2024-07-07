package com.liuqiang.swing;

import javax.swing.*;

/**
 *
 */
public class SwingDemo01 {
   private final JFrame jFrame = new JFrame("第一个JFrame应用程序");

    public void init(){

        jFrame.setBounds(400,250,800,600);
        jFrame.setVisible(true);
        /**
         *
         * 比起frame好用的多，awt需要使用关闭窗口事件，
         */
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        new SwingDemo01().init();
    }
}
