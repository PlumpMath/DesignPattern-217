package memento;

//��Ϸ��ɫ��
class GameRole {
	private int hp;// ����ֵ
	private int attack;// ������
	private int defense;// ������

	// ���ó�ʼ״̬
	public void SetInitRoleState() {
		this.hp = 100;
		this.attack = 80;
		this.defense = 50;
	}

	// ������Ϸ��ɫ״̬
	public RoleStateMemento SaveState() {
		return (new RoleStateMemento(hp, attack, defense));
	}

	// �ָ���ɫ״̬
	public void RecoveryRoleState(RoleStateMemento rsm) {
		this.hp = rsm.getHp();
		this.attack = rsm.getAttack();
		this.defense = rsm.getDefense();
	}
	
	//ս��
	public void Fight(){
		this.hp = 0;
		this.attack = 0;
		this.defense = 0;
	}
	
	// չʾ��Ϸ��ɫ��ǰ״̬
	public void ShowRoleState() {
		System.out.println("��ǰ״̬----" + "HP:" + hp + " Attack:" + attack + " Defense:" + defense);
	}
	
}
