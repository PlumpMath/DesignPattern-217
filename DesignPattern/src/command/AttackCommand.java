package command;

//����������
public class AttackCommand extends Command {

	public AttackCommand(GameRole role) {
		//��ɸ���Ĺ��캯��
		super(role);
	}
	
	@Override
	public void ExcuteCommand() {
		role.Attack();
	}
	
	//���ر�ʶ�ַ�
	public String toString(){
		return "Attack";
	}
}
