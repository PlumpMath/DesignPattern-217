package adapter;

//�⼮��Ա
class ForeignPlayer {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//�������뱾����Ա��������ͬ
	public void Jinggong(){
		System.out.println("�⼮��Ա:"+getName()+ " attack");
	}
	//���أ��뱾����Ա��������ͬ
	public void Fangshou(){
		System.out.println("�⼮��Ա:"+getName()+ " defense");
	}
	
}
