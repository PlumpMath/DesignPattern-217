package command;

//���������
abstract class Command {
	protected GameRole role;
	
	//�ù��췽�����󶨽�ɫ
	public Command(GameRole role) {
		this.role = role;
	}
	
	//ִ��������󷽷����ɾ��������ȥʵ��
	abstract public void ExcuteCommand();
}
