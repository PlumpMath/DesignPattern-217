package prototype;

class ConcreteResume2 extends Resume {

	private String name;
	private int age;
	private String gender;
	// ���ù�����������
	private WorkExperience we;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	// �ڼ�����1ʵ����ʱͬʱʵ����"��������"
	public ConcreteResume2(String name) {
		this.name = name;
		we = new WorkExperience();
	}
	
	//�ṩClone�������õ�˽�й��캯�����Ա��¡"��������"������
	private ConcreteResume2(WorkExperience we) {
		this.we = (WorkExperience) we.clone();
	}

	// ���ø�����Ϣ
	public void SetPersonInfo(int age, String gender) {
		this.age = age;
		this.gender = gender;
	}

	// ���ù�������
	public void SetWorkExperience(String workDate, String company) {
		we.setWorkDate(workDate);
		we.setCompany(company);
	}

	// ��ʾ
	public void Display() {
		System.out.println("Name:" + getName() + " Age:" + getAge() + "Gender:" + getGender());
		System.out.println("WorkExperience:" + we.getWorkDate() + " " + we.getCompany());
	}
	
	//���
	@Override
	public Resume Clone() {
		ConcreteResume2 obj = new ConcreteResume2(this.we);
		obj.name = this.name;
		obj.age = this.age;
		obj.gender = gender;
		return obj;
	}

}
