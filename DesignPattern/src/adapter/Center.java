package adapter;

//�з���
class Center extends Player {
	
	//���ø���Ĺ��췽��
	public Center(String name) {
		super(name);
	}

	@Override
	public void Attack() {
		System.out.println("�з�:"+name+" attack");
	}

	@Override
	public void Defense() {
		System.out.println("�з�:"+name+" defense");
	}

}
