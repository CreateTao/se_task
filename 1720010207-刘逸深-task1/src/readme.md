## task1-storage�洢����ؼ���

### �������߼�����
#### �������ߣ�eclipse
#### �������ԣ�java
###���л�����win10 64λ
###����������
>��Ҫ����Ĵ洢������ݣ�����Աÿ��Ŀ���ָ�������ֳ�������Աÿ���µĹ��ʣ��Ϳ���
����洢���������󣬼۸��Լ��洢������ָ������Ҫ�ĳɱ�

```java
package work1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class storage extends JFrame implements ActionListener
{
JButton a1;
JTextField t1,t2,t3,t4,t5,t6,tqw;
JPanel p1,p2,p3,p4,p5,p6,p7,pqw;
JLabel bq1,bq2,bq3,bq4,bq5,bq6,bq7,bqqw;
Double count1,count2,count3,count4,count5,count6,countqw;
public storage(){
Font font = new Font("����", Font.BOLD, 36);
Font font2 = new Font("����", Font.BOLD, 20);
a1 = new JButton("ȷ��");
a1.setFont(font);
a1.addActionListener(this);
t1 = new JTextField(25);
t2 = new JTextField(25);
t3 = new JTextField(25);
t4 = new JTextField(25);
t5 = new JTextField(25);
t6 = new JTextField(25);
tqw = new JTextField(25);
t1.setFont(font2);
t2.setFont(font2);
t3.setFont(font2);
t4.setFont(font2);
t5.setFont(font2);
t6.setFont(font2);
tqw.setFont(font2);
p1 = new JPanel();
p2 = new JPanel();
p3 = new JPanel();
bq1 = new JLabel("������ݣ�");
bq2 = new JLabel("�������Աÿ�쿪��ָ������");
bq3 = new JLabel("ƽ��ÿ�¹��ʣ�");
bq4 = new JLabel("�����������Ϣ���������㣺");
bq5 = new JLabel("����Դ洢����������Ϊ��(��λΪ�ֽ�)");
bq6 = new JLabel("�۸�Ϊ��(��λΪ��Ԫ)");
bq7 = new JLabel("�洢��װ����������ĳɱ���(��λΪ��Ԫ)");
bqqw = new JLabel("������ָ���ֳ�");
p1.setLayout(new GridLayout(4,2)); 
p2.setLayout(new GridLayout(1,2));
p3.setLayout(new GridLayout(3,2));
p1.add(bq1);p1.add(t1);
p1.add(bq2);p1.add(t2);
p1.add(bq3);p1.add(t3);
p1.add(bqqw);p1.add(tqw);
p2.add(bq4);p2.add(a1);
p3.add(bq5);p3.add(t4);
p3.add(bq6);p3.add(t5);
p3.add(bq7);p3.add(t6);
this.add(p1,BorderLayout.NORTH);
this.add(p2,BorderLayout.CENTER);
this.add(p3,BorderLayout.SOUTH);
this.setSize(700,500);
this.setTitle("�洢����ػ���");
this.setLocation(200,200); 
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setVisible(true);
}
public void actionPerformed(ActionEvent e){
Object temp = e.getSource();
if(temp == a1){ 
count1=Double.parseDouble(t1.getText());
count2=Double.parseDouble(t2.getText());
count3=Double.parseDouble(t3.getText());
countqw=Double.parseDouble(tqw.getText());
count4=Math.pow(Math.E,0.28*(count1-1960))*4080;
count5=0.003*countqw*Math.pow(0.72,(count1-1974))*count4;
count6=(count4/(count2*20))*count3;
t4.setText(String.valueOf(count4));
t5.setText(String.valueOf(count5));
t6.setText(String.valueOf(count6));
}
}
}
```
