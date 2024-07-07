package com.liuqiang.menu_05;

import java.awt.*;
import java.awt.event.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: �˵����
 * @date 2024/5/19 15:18
 */
public class MenuDemo01 {
    Frame frame = new Frame("�˵����");

    //�����˵���
    MenuBar menuBar = new MenuBar();
    //�����˵����
    Menu menu1 = new Menu("�ļ�");
    Menu menu2 = new Menu("�༭");
    Menu menuFormat = new Menu("��ʽ");
    //�����˵���
    MenuItem menuItem1 = new MenuItem("�Զ�����");
    MenuItem menuItem2 = new MenuItem("����");
    MenuItem menuItem3 = new MenuItem("ճ��");
    MenuItem menuItem4 = new MenuItem("ע��", new MenuShortcut(KeyEvent.VK_Q,true));
    MenuItem menuItem5 = new MenuItem("ȡ��ע��");
    TextArea textArea = new TextArea(6,40);
    public void init(){
        //��װ
        menuItem4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("��ȡ����:"+e.getActionCommand()+"\n");
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

    //�ر�������
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
