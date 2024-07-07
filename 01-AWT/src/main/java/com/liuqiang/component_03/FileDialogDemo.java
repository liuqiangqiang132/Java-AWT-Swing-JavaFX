package com.liuqiang.component_03;

import javax.swing.*;
import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: 文件对话框
 * @date 2024/5/14 18:29
 */
public class FileDialogDemo {
    public static void main(String[] args) {

        Frame frame = new Frame("文件对话框");
        //创建文件对话框
        FileDialog openFile = new FileDialog(frame,"打开文件对话框",FileDialog.LOAD);
        FileDialog saveFile = new FileDialog(frame,"保存文件对话框",FileDialog.SAVE);


        //创建按钮
        Button buttonOpenFile = new Button("打开文件");
        Button buttonSaveFile = new Button("保存文件");
        //添加事件
        buttonOpenFile.addActionListener(e -> {
            openFile.setBounds(400,250,800,600);
            openFile.setVisible(true);
            String openFileDirectory = openFile.getDirectory();
            String openFileFile = openFile.getFile();
            System.out.println("打开的文件路径为:"+openFileDirectory);
            System.out.println("打开的文件名称:"+openFileFile);
        });
        buttonSaveFile.addActionListener(e -> {
            saveFile.setBounds(400,250,800,600);
            saveFile.setVisible(true);
            String saveFileDirectory = saveFile.getDirectory();
            String saveFileFile = saveFile.getFile();
            System.out.println("打开的文件路径为:"+saveFileDirectory);
            System.out.println("打开的文件名称:"+saveFileFile);
        });
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(buttonOpenFile);
        verticalBox.add(buttonSaveFile);
        frame.add(verticalBox);


        frame.pack();
        frame.setVisible(true);
    }
}
