package adapter;

//������
public class Test {

	public static void main(String[] args) {
		Player player_1 = new Forwards("Tom");
		Player player_2 = new Center("Jack");
		Player player_3 = new Translator("Ҧ��");
		
		player_1.Attack();
		player_1.Defense();
		
		System.out.println("=============");
		
		player_2.Attack();
		player_2.Defense();
		
		System.out.println("=============");
		
		player_3.Attack();
		player_3.Defense();
		
//		ǰ��:Tom attack
//		ǰ��:Tom defense
//		=============
//		�з�:Jack attack
//		�з�:Jack defense
//		=============
//		�⼮��ԱҦ�� attack
//		�⼮��ԱҦ�� defense
		
	}

}
