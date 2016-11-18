package prototype;


//����������
 class WorkExperience implements Cloneable{
	private String workDate;
	private String company;
	
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	//������ǰ�����ǳ��������ǳ����
	public Object clone(){
		Object object = null;
		try{
			object = super.clone();
		}catch(CloneNotSupportedException e){
			System.err.println("not cloneable");
		}
		return object;
	}
}
