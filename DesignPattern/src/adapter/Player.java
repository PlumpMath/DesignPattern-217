package adapter;

//��Ա������
abstract class Player {
	
	protected String name;
	
	public Player(String name){
		this.name = name;
	}
	
	//�������󷽷�
	public abstract void Attack();
	//���س��󷽷�
	public abstract void Defense();
}
