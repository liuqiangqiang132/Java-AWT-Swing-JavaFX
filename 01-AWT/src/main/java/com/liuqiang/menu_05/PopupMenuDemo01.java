package com.liuqiang.menu_05;

import java.awt.*;
import java.awt.event.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: PopupMenuDemo01的使用
 * @date 2024/5/19 15:43
 */
public class PopupMenuDemo01 {

    Frame frame = new Frame("popupMenu");
    Panel panel = new Panel();
    PopupMenu p = new PopupMenu();
    MenuItem zs = new MenuItem("注释");
    MenuItem qxzs = new MenuItem("取消注释");
    MenuItem copy = new MenuItem("复制");
    MenuItem save = new MenuItem("保存");
    TextArea textArea = new TextArea(6,40);

    public void init(){
        ActionListener actionListener = e -> textArea.append("你输入的命令为:"+e.getActionCommand()+"\n");
        zs.addActionListener(actionListener);
        qxzs.addActionListener(actionListener);
        copy.addActionListener(actionListener);
        save.addActionListener(actionListener);
        p.add(zs);
        p.add(qxzs);
        p.add(copy);
        p.add(save);
         panel.add(p);
         panel.addMouseListener(new MouseAdapter(){
             @Override
             public void mouseReleased(MouseEvent e) {
                 boolean popupTrigger = e.isPopupTrigger();
                 if (popupTrigger){
                     p.show(panel,e.getX(),e.getY());
                 }
             }
         });

        frame.add(textArea,BorderLayout.NORTH);
        frame.add(panel);
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
        new PopupMenuDemo01().init();

    }
}
