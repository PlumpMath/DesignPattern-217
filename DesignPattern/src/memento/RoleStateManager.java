package memento;

//��ɫ״̬������
class RoleStateManager {
	
	private RoleStateMemento memento;

	public RoleStateMemento getMemento() {
		return memento;
	}

	public void setMemento(RoleStateMemento memento) {
		this.memento = memento;
	}
	
}
