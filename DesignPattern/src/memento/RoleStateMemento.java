package memento;

//��ɫ״̬����¼�࣬������Ϸ��ɫ��ǰ״̬
class RoleStateMemento {
	
	private int hp;//����ֵ
	private int attack;//������
	private int defense;//������
	
	public RoleStateMemento(int hp,int attack,int defense){
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
	
}
