package singleton;


//����ģʽ
public class Singleton_2 {
	
	//�������Ψһʵ��
	private static Singleton_2 instance = null;
	
	//�����췽��˽�л����������ⲿֱ�Ӵ�������
	private Singleton_2(){
	}
	
	//�ṩ���ڻ�ȡʵ���ķ���
	public static Singleton_2 getInstance(){
		if(instance == null)
			instance = new Singleton_2();
		return instance;
	}
}
