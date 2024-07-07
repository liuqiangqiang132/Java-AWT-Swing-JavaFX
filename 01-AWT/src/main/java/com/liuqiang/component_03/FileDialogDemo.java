package com.liuqiang.component_03;

import javax.swing.*;
import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: �ļ��Ի���
 * @date 2024/5/14 18:29
 */
public class FileDialogDemo {
    public static void main(String[] args) {

        Frame frame = new Frame("�ļ��Ի���");
        //�����ļ��Ի���
        FileDialog openFile = new FileDialog(frame,"���ļ��Ի���",FileDialog.LOAD);
        FileDialog saveFile = new FileDialog(frame,"�����ļ��Ի���",FileDialog.SAVE);


        //������ť
        Button buttonOpenFile = new Button("���ļ�");
        Button buttonSaveFile = new Button("�����ļ�");
        //����¼�
        buttonOpenFile.addActionListener(e -> {
            openFile.setBounds(400,250,800,600);
            openFile.setVisible(true);
            String openFileDirectory = openFile.getDirectory();
            String openFileFile = openFile.getFile();
            System.out.println("�򿪵��ļ�·��Ϊ:"+openFileDirectory);
            System.out.println("�򿪵��ļ�����:"+openFileFile);
        });
        buttonSaveFile.addActionListener(e -> {
            saveFile.setBounds(400,250,800,600);
            saveFile.setVisible(true);
            String saveFileDirectory = saveFile.getDirectory();
            String saveFileFile = saveFile.getFile();
            System.out.println("�򿪵��ļ�·��Ϊ:"+saveFileDirectory);
            System.out.println("�򿪵��ļ�����:"+saveFileFile);
        });
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(buttonOpenFile);
        verticalBox.add(buttonSaveFile);
        frame.add(verticalBox);


        frame.pack();
        frame.setVisible(true);
    }
}
