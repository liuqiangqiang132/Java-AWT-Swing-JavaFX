package com.liuqiang.canvas_06;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: Graphics�����ʹ��
 * @date 2024/6/1 18:22
 */
public class GraphicsDemo {

    //����frame����
    private final Frame frame = new Frame("������Ի�ͼ����");

    private static final String FILL_RECT = "rect";
    private static final String FILL_OVAL = "oval";

    Button buttonRect = new Button("���ƾ���");
    Button buttonOval = new Button("������Բ");

    //��Ǳ���
    private static String flag = "";
    private static   class MyCanvas extends Canvas {
        @Override
        public void paint(Graphics g) {
            if (flag.equals(FILL_OVAL)){
                //������Բ
                g.setColor(Color.RED);
                g.fillOval(100,100,200,200);
            }
            if (flag.equals(FILL_RECT)){
                //���ƾ���
                g.setColor(Color.black);
                g.fillRect(100,100,200,200);
            }


        }
    }
    MyCanvas myCanvas = new MyCanvas();
    public void init(){

        buttonRect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //�޸ı�ǵ�ֵ
                flag = FILL_RECT;
                myCanvas.repaint();

            }
        });
        buttonOval.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //�޸ı�ǵ�ֵ
                flag = FILL_OVAL;
                myCanvas.repaint();

            }
        });
       Panel panel  = new Panel();
       panel.add(buttonRect);
       panel.add(buttonOval);
       frame.add(panel,BorderLayout.SOUTH);

       myCanvas.setSize(new Dimension(100,200));
       frame.add(myCanvas);
        //������Ѵ�С���ɼ���
        frame.pack();
        frame.setBounds(600,300,800,600);
        frame.setVisible(true);
        extracted();

    }

    //�����ô����ʱ���Ѿ��޷��ı�
    private void extracted() {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }


    public static void main(String[] args) {
          new GraphicsDemo().init();

    }
}
