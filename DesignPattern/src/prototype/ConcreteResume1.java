package prototype;

class ConcreteResume1 extends Resume implements Cloneable{

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
	public ConcreteResume1(String name) {
		this.name = name;
		we = new WorkExperience();
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
		System.out.println("Name:" + getName() + " Age:" + getAge() + " Gender:" + getGender());
		System.out.println("WorkExperience:" + we.getWorkDate() + " " + we.getCompany());
	}
	
	//ǳ����
	@Override
	public Resume Clone() {
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println("not cloneable");
		}
		return (Resume) object;
	}

}
