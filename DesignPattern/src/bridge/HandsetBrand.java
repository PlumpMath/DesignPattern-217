package bridge;

//�ֻ�Ʒ�Ƴ�����
abstract class HandsetBrand {
	
	protected HandsetSoft handsetSoft;
	
	//�����ֻ����
	public void SetHandsetSoft(HandsetSoft handsetSoft){
		this.handsetSoft = handsetSoft;
	}
	
	//�����ֻ����
	public abstract void run();
}
