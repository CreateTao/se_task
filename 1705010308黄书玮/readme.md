# ���������ҵ
## 1���������߼�����
�������ߣ�eclipse
�������ԣ�java
## 2�����л���
��Windows 10 64λ�����������������
## 3����������
�ó�������ʵ��������̵����鱾��P22ҳ��5��Ҫ��ļ�����洢�������㡢�洢���۸�����Լ���дһ���������ĳ���ɱ�����ȹ��ܡ�
## 4��������ʾ
![��ҵ](./��ҵ��ʾ.gif "��ҵ")
## 5��Դ�����ļ�˵��
package zy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class demo implements ActionListener{

    JFrame f;
    JButton bM,bP,bW,bclear;
    Container cp;
    JLabel j1,j2,j3,j4,j5;


    JTextField jtf1,jtf2,jtf3,jtf4,jtf5;
    demo(){
        f = new JFrame("С����");
        f.setSize(550,200);//���ô�С

        cp = f.getContentPane();//�������
        cp.setLayout(new FlowLayout());//�ĳ���ʽ����

        j1=new JLabel("���");
        j2=new JLabel("�ֳ�");
        j3=new JLabel("ָ��");
        j4=new JLabel("����");
        j5=new JLabel("���");
  
        jtf1 = new JTextField(10);
        jtf2 = new JTextField(10);
        jtf3 = new JTextField(10);
        jtf4 = new JTextField(10);
        jtf5 = new JTextField(10);

        bM = new JButton("M");
        bP = new JButton("P");
        bW= new JButton("W");
        bclear = new JButton("���");
        
        cp.add(j1);//��ӱ�ǩ
        cp.add(jtf1);//����ı���
        cp.add(j2);
        cp.add(jtf2);
        cp.add(j3);
        cp.add(jtf3);
        cp.add(j4);
        cp.add(jtf4);
        cp.add(j5);
        cp.add(jtf5);

        cp.add(bM);
        bM.addActionListener(this);//��M��Ӽ�������
        cp.add(bP);
        bP.addActionListener(this);
        cp.add(bW);
        bW.addActionListener(this);
        cp.add(bclear);
        bclear.addActionListener(this);


        f.setVisible(true);//��ʾ����
        f.setLocationRelativeTo(null);//�������
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�ر�

    }
    public static void main(String[] args){
        new demo();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    	double Y = Double.parseDouble(jtf1.getText());//��ȡ�ı���1�����ֵ����ת���ɸ�����
    	double B = Double.parseDouble(jtf2.getText());//��ȡ�ı���2�����ֵ����ת���ɸ�����
    	double Z = Double.parseDouble(jtf3.getText());//��ȡ�ı���3�����ֵ����ת���ɸ�����
    	double Mo = Double.parseDouble(jtf4.getText());//��ȡ�ı���4�����ֵ����ת���ɸ�����
        double M,P,C;
        if(e.getSource()==bM){//��������
        	Y=Y-1960;
        	M=4080*Math.pow(Math.E, 0.28*Y);
            jtf5.setText(String.valueOf(M));//����M��ֵ��ʾ���ı���5��
        }
        else if(e.getSource()==bW){//����ɱ�
        	M=4080*Math.pow(Math.E, 0.28*(Y-1960));
        	C=M/(Z*20);
            jtf5.setText(String.valueOf(C*Mo));
        }
        else if(e.getSource()==bP){//����洢���۸�
        	M=4080*Math.pow(Math.E, 0.28*(Y-1960));
        	P=M*0.003*B*Math.pow(0.72,(Y-1974));
            jtf5.setText(String.valueOf(P));
        }
      
        else{
            jtf1.setText("");//���ı���Ϊ��
            jtf2.setText("");
            jtf3.setText("");
            jtf4.setText("");
            jtf5.setText("");
        }
    }
}
