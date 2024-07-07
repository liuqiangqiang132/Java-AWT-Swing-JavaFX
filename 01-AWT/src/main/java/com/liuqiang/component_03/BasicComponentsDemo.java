package com.liuqiang.component_03;

import javax.swing.*;
import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: AWT中常用的自组件
 * @date 2024/5/14 17:34
 */
public class BasicComponentsDemo {
    Frame frame  =  new Frame("AWT中常用的组件");

    //文本框
    TextArea textArea = new TextArea(5,20);
    //下拉框
    Choice choice = new Choice();
    //单选框
    CheckboxGroup checkboxGroup = new CheckboxGroup();
    Checkbox male = new Checkbox("男",checkboxGroup,true);
    Checkbox female = new Checkbox("女",checkboxGroup,true);
    //选择框
    Checkbox isMarry = new Checkbox("是否已婚？");
    //文本输入框
    TextField textField = new TextField(20);
    //按钮
    Button button = new Button("确认");

    //列表
    List list = new List(6,true);

    public void init(){
        //TODO 组装组件
        //创建水平方向的盒子
        Box horizontalBox = Box.createHorizontalBox();
        choice.add("红色");
        choice.add("黑色");
        choice.add("蓝色");
        horizontalBox.add(choice);
        horizontalBox.add(male);
        horizontalBox.add(female);
        horizontalBox.add(isMarry);
        //创建垂直方向的盒子
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(textArea);
        verticalBox.add(horizontalBox);

        //文本输入框和确认
        Box horizontalBox1 = Box.createHorizontalBox();
        horizontalBox1.add(textField);
        horizontalBox1.add(button);

        //列表中添加元素
        list.add("红色");
        list.add("绿色");
        list.add("蓝色");

        //
        frame.add(verticalBox,BorderLayout.WEST);
        frame.add(horizontalBox1,BorderLayout.SOUTH);
        frame.add(list,BorderLayout.EAST);

        frame.pack();
        frame.setVisible(true);
    }



    public static void main(String[] args) {
        new BasicComponentsDemo().init();


    }
}
