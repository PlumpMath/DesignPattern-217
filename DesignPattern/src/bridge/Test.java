package bridge;


//������
public class Test {

	public static void main(String[] args) {
		HandsetBrand brand = null;
		
		//ʵ����M�ֻ�
		brand = new HandsetBrandM();
		//��װ�������
		brand.SetHandsetSoft(new HandsetMusicPlayer());
		//����
		brand.run();
		
		//ʵ����N�ֻ�
		brand = new HandsetBrandN();
		//��װ��Ϸ���
		brand.SetHandsetSoft(new HandsetGame());
		//����
		brand.run();
		
//		MƷ���ֻ�: �����ֻ����ֲ�����
//		NƷ���ֻ�: �����ֻ���Ϸ
	}
}
