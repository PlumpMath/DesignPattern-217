package command;

//���������
abstract class Command {
	protected GameRole role;

	public Command(GameRole role) {
		this.role = role;
	}
	
	//ִ��������󷽷����ɾ��������ȥʵ��
	abstract public void ExcuteCommand();
}
