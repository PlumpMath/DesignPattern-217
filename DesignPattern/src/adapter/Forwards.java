package adapter;

//ǰ����
class Forwards extends Player {
	
	//���ø���Ĺ��췽��
	public Forwards(String name) {
		super(name);
	}
	
	@Override
	public void Attack() {
		System.out.println("ǰ��:"+name+" attack");
	}

	@Override
	public void Defense() {
		System.out.println("ǰ��:"+name+" defense");
	}

}
