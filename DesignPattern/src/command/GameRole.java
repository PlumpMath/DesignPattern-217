package command;

//��Ϸ��ɫ��
class GameRole {
	
	private String name;
	
	public GameRole(String name){
		this.name = name;
	}
	
	//��������
	public void Attack(){
		System.out.println(name+" Attack");
	}
	//��������
	public void Defense(){
		System.out.println(name+" Defense");
	}
	//��������
	public void Heal(){
		System.out.println(name+" Heal");
	}
	
	public void AttackFriends(){
		System.out.println(name+" AttackFriends");
	}
}
