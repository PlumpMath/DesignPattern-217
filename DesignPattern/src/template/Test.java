package template;

public class Test {
	public static void main(String args[]){
		Player a = new PlayerA();
		Player b = new PlayerB();
		
		a.BuyGames();
		System.out.println("=====================");
		b.BuyGames();
		
//		������Ϸ����:
//		������Ϸ:���غ���
//		EA��Ϸ:��Ʒ�ɳ�13
//		��ѩ��Ϸ:�����ȷ棬�����ƻ���3
//		=====================
//		������Ϸ����:
//		������Ϸ:���ջ���
//		EA��Ϸ:ս��1����԰ս��
//		��ѩ��Ϸ:ħ�����磬�Ǽ�����2
	}
}
