package singleton;

//����ģʽ��ֻҪ������ˣ�ʵ�����Ѿ�������
public class Singleton_1 {
	
	//�������Ψһʵ��
	private static Singleton_1 instance = new Singleton_1();
	
	//�����췽��˽�л����������ⲿֱ�Ӵ�������
	private Singleton_1(){
	}
	
	//�ṩ���ڻ�ȡʵ���ķ���
	public Singleton_1 getInstance(){
		return instance;
	}
}
