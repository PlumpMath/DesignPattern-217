package command;

//����������
class HealCommand extends Command {

	public HealCommand(GameRole role) {
		super(role);
	}

	@Override
	public void ExcuteCommand() {
		role.Heal();
	}
	
	public String toString(){
		return "Heal";
	}

}
