package memento;

//������
public class Test {

	public static void main(String[] args) {
		//������Ϸ��ɫ
		GameRole role = new GameRole();
		//��ʼ����ɫ״̬
		role.SetInitRoleState();
		
		//��ʾս��ǰ��ɫ״̬
		System.out.print("ս��ǰ:");
		role.ShowRoleState();
		
		//������ɫ״̬�����ߣ������浱ǰ��ɫ״̬
		RoleStateManager manager = new RoleStateManager();
		manager.setMemento(role.SaveState());
		
		//ս������ʾ��ɫ״̬
		role.Fight();
		System.out.print("ս����:");
		role.ShowRoleState();
		
		//�ص���ս��ǰ��ɫ״̬
		role.RecoveryRoleState(manager.getMemento());
		System.out.print("�ص���:");
		role.ShowRoleState();
		
//		ս��ǰ:��ǰ״̬----HP:100 Attack:80 Defense:50
//		ս����:��ǰ״̬----HP:0 Attack:0 Defense:0
//		�ص���:��ǰ״̬----HP:100 Attack:80 Defense:50
	}

}
