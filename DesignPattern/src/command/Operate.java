package command;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//ִ��������
public class Operate {
	
	private List<Command> commands = new ArrayList<Command>();
	
	//��������
	public void SetCommands(Command command){
		commands.add(command);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		System.out.println(df.format(new Date())+" add command:"+command.toString());// new Date()Ϊ��ȡ��ǰϵͳʱ��
	}
	
	//ȡ��ĳһ������
	public void CancelCommand(Command command){
		commands.remove(command);
		System.out.println(command.toString());
	}
	
	//ִ֪ͨ����������
	public void Notify(){
		for(int i=0;i<commands.size();i++){
			if(commands.get(i).toString().equals("AttackFriends")){
				//�ܾ�ִ�й������ѵ�����
				System.out.println("Warning You can not attack your friends!!!");
			}else{
					commands.get(i).ExcuteCommand();
			}
		}
	}
	
}
