package se.task1;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Layout extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private JLabel yearJLabel;		//���ޱ�ǩ
	private JTextField yearJTextField;		//���������
	
	private JLabel wordLengthJLabel;		//�����ֳ�
	private JTextField wordLenJTextField;	//�����ֳ������
	
	private JLabel intNumJLabel;			//����Աÿ�տ�����������
	private JTextField intNumJTextField;	//�������������
	
	private JLabel wageJLabel;		//����
	private JTextField wageJTextField;	//����Ա���������
	
	private JLabel workdaysForAMonthJLabel;		//����Աÿ�¹�������
	private JTextField workdaysForAMonthField;	
	
	
	private JLabel memerySizeNeedResult;	//�洢������
	private JLabel memeryPriceResult;		//�洢���۸�
	private JLabel allPriceResult;			//�ܳɱ���ʾ��
	
	
	private JButton memerySizeCacul;		//�洢�����С����
	private JButton memeryPriceCacul;		//�洢�۸����
	private JButton allPriceCacul;			//�ܳɱ�����
	
	
	private FlowLayout mainLayout;

	public Layout() {
		mainLayout = new FlowLayout(FlowLayout.LEFT,7,20);
		this.setLayout(mainLayout);
		this.setTitle("�������task1");
		this.setSize(485, 300);
		this.setLocationRelativeTo(null);
		
		init();
		setListener();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}
	
	private void init() {
		yearJLabel = new JLabel();
		yearJTextField = new JTextField(5);
		
		wordLengthJLabel = new JLabel("������ֳ���");
		wordLenJTextField = new JTextField(4);
		
		intNumJLabel = new JLabel("ÿ��ÿ��ָ�����Ŀ��");
		intNumJTextField = new JTextField(4);
		
		wageJLabel = new JLabel("����Աÿ�¹��ʣ�");
		wageJTextField = new JTextField(6);
		
		workdaysForAMonthJLabel = new JLabel("ÿ�¹���������");
		workdaysForAMonthField = new JTextField(4);
		
		
		memerySizeCacul = new JButton();
		memeryPriceCacul = new JButton();
		allPriceCacul = new JButton();
		
		memerySizeNeedResult = new JLabel();
		memeryPriceResult = new JLabel();
		allPriceResult = new JLabel();
		
		memerySizeCacul.setText("�洢��С�������");
		memeryPriceCacul.setText("�洢���۸����");
		allPriceCacul.setText("�ɱ�����");
		yearJLabel.setText("ʱ�䣨�꣩��");
		
		memerySizeNeedResult.setPreferredSize(new Dimension(140, 20));
		memeryPriceResult.setPreferredSize(new Dimension(140,20));
		
		this.add(yearJLabel);
		this.add(yearJTextField);
		
		this.add(memerySizeCacul);
		this.add(memerySizeNeedResult);
		
		this.add(wordLengthJLabel);
		this.add(wordLenJTextField);
		
		this.add(memeryPriceCacul);
		this.add(memeryPriceResult);
		
		this.add(intNumJLabel);
		this.add(intNumJTextField);
		
		this.add(wageJLabel);
		this.add(wageJTextField);
		
		this.add(workdaysForAMonthJLabel);
		this.add(workdaysForAMonthField);
		
		
		this.add(allPriceCacul);
		this.add(allPriceResult);
	}
	
	private void setListener() {
		memerySizeCacul.addActionListener(this);
		memeryPriceCacul.addActionListener(this);
		allPriceCacul.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int year = Integer.parseInt(yearJTextField.getText().trim());
		DecimalFormat df = (DecimalFormat) DecimalFormat.getInstance();
		switch (e.getActionCommand()) {
		case "�洢��С�������":
			if(yearJTextField.getText()==null||yearJTextField.getText().trim().equals("")) {
				memerySizeNeedResult.setText("����Ϊ�գ�����");
				break;
			}
			int mSize = (int) Math.ceil((Function.getNeedMemerySize(year)/(1024)));
			if(mSize/1024>=1) {
				
				memerySizeNeedResult.setText("Size : Լ" + String.valueOf(df.format(mSize*1.0/1024)) + " M��");
			}else {
				memerySizeNeedResult.setText("Size : Լ" + String.valueOf(mSize) + " K��");
			}
			break;
		case "�洢���۸����":
			if(yearJTextField.getText().trim()==""||wordLenJTextField.getText().trim()=="") {
				memeryPriceResult.setText("����ϢΪ�գ�");
				break;
			}
			int len = Integer.parseInt(wordLenJTextField.getText().trim()); 
			memeryPriceResult.setText("�۸�Լ��"+String.valueOf(df.format(Function.getMemeryPrice(year, len)))+"��Ԫ");
			break;
		case "�ɱ�����":
			if(yearJTextField.getText().trim()==""||workdaysForAMonthField.getText().trim()==""||
			intNumJTextField.getText().trim()==""||wageJTextField.getText().trim()=="") {
				memeryPriceResult.setText("����ϢΪ�գ�");
				break;
			}
			int num = Integer.parseInt(intNumJTextField.getText().trim());
			int days = Integer.parseInt(workdaysForAMonthField.getText().trim());
			int wage = Integer.parseInt(wageJTextField.getText().trim());
			allPriceResult.setText("�ܳɱ�ԼΪ��"+String.valueOf(df.format(Function.getAllPrice(year, num, wage, days)))+"��Ԫ");
			break;
		default:
			break;
		}
	}
}
