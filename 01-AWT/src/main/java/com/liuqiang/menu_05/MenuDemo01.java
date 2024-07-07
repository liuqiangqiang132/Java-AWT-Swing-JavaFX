package com.liuqiang.menu_05;

import java.awt.*;
import java.awt.event.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: 菜单组件
 * @date 2024/5/19 15:18
 */
public class MenuDemo01 {
    Frame frame = new Frame("菜单组件");

    //创建菜单条
    MenuBar menuBar = new MenuBar();
    //创建菜单组件
    Menu menu1 = new Menu("文件");
    Menu menu2 = new Menu("编辑");
    Menu menuFormat = new Menu("格式");
    //创建菜单项
    MenuItem menuItem1 = new MenuItem("自动换行");
    MenuItem menuItem2 = new MenuItem("复制");
    MenuItem menuItem3 = new MenuItem("粘贴");
    MenuItem menuItem4 = new MenuItem("注释", new MenuShortcut(KeyEvent.VK_Q,true));
    MenuItem menuItem5 = new MenuItem("取消注释");
    TextArea textArea = new TextArea(6,40);
    public void init(){
        //组装
        menuItem4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("你取消了:"+e.getActionCommand()+"\n");
            }
        });
        menuBar.add(menu1);
        menuBar.add(menu2);
        menu2.add(menuItem1);
        menu2.add(menuItem2);
        menu2.add(menuItem3);
        menu2.add(menuFormat);
        menuFormat.add(menuItem4);
        menuFormat.add(menuItem5);


        frame.setMenuBar(menuBar);
        frame.add(textArea);
        frame.pack();
        frame.setVisible(true);
        extracted();

    }

    //关闭主窗口
    private void extracted() {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {

        new MenuDemo01().init();

    }
}
