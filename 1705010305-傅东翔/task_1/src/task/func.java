package task;

public class func {	
	double mem;//�洢������
	double e = Math.E;
	
	//������洢�����������
	public String memory(int year) {
		mem = 4080 * (Math.pow(e, (0.28*(year-1960))));
		return String.format("%.3f", mem);
	}
	
	//�洢���۸����
	public String price(int year, int bit) { //bit--������ֳ�λ��
		double memoryPrice;
		mem = 4080 * (Math.pow(e, (0.28*(year-1960))));
		memoryPrice = 0.3 * (Math.pow(0.72, (year-1974))) * mem * bit * 0.01;
		return String.format("%.3f", memoryPrice);
	}
	
	//����װ���洢������ɱ�����
	public String cost(int year, int daily, int salary) { //daily--����Աÿ�տ���ָ������Ĭ��һ��ָ��һ���ֳ����� salary--����Ա�¹���
		double cost;//����ɱ�
		mem = 4080 * (Math.pow(e, (0.28*(year-1960))));
		cost = ((mem/daily)/30) * salary;
		return String.format("%.3f", cost);
	}
}
