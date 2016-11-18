package singleton;

//����ģʽ������˫������(Double-Check Locking)������֤�̰߳�ȫ
public class Singleton_3 {

	// �������Ψһʵ��
	private static Singleton_3 instance = null;

	// �����췽��˽�л����������ⲿֱ�Ӵ�������
	private Singleton_3() {
	}

	// �ṩ���ڻ�ȡʵ���ķ���
	public static Singleton_3 getInstance() {
		//���ж�ʵ���Ƿ���ڣ��������ټ�������
		if (instance != null) {

		} else {
			synchronized (Singleton_3.class) {//������ͬʱֻ����һ���߳̽���
				//�ڶ����жϣ��ж�֮ǰ���߳��Ƿ��Ѿ�������ʵ����û�еĻ��򴴽�
				if (instance == null) {
					instance = new Singleton_3();
				}
			}
		}
		return instance;
	}
}
