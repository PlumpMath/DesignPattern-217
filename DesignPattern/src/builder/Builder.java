package builder;

//���������࣬ȷ����Ʒ��PartA��PartB��ɣ�������һ���õ���Ʒ�ķ���
abstract class Builder {
	
	//����PartA
	public abstract void BuildPartA();
	
	//����PartB
	public abstract void BuildPartB();
	
	//�õ���Ʒ
	public abstract Product getProduct();
}
