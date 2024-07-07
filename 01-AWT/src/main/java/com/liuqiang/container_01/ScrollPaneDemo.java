package com.liuqiang.container_01;

import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: TODO
 * @date 2024/5/14 14:48
 */
public class ScrollPaneDemo {
    public static void main(String[] args) {

        Frame frame = new Frame("这是一个scrollPane容器");

        /**
         * 创建一个新的滚动窗格容器。
         * scrollbarDisplayPolicy -滚动条何时显示的策略
         *  - SCROLLBARS_ALWAYS  指定无论滚动窗格和子滚动窗格的大小如何，都应始终显示水平垂直滚动条。
         *  - SCROLLBARS_AS_NEEDED  指定水平垂直滚动条只有在子滚动条的大小超过水平垂直维度上滚动窗格的大小时才显示
         *  - SCROLLBARS_NEVER  指定无论滚动窗格和子滚动窗格的大小如何，都不应显示水平垂直滚动条。
         */
        ScrollPane scrollPane = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
        for (int i = 0; i < 100; i++) {
            scrollPane.add(new Button("按钮"+i));
        }
        frame.add(scrollPane);

        //TODO 此时会出现问题，布局管理器控制


        frame.setBounds(300,200,800,600);
        frame.setVisible(true);
    }
}
