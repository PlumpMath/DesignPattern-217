package template;

abstract class Player {
	
	//ģ�巽���������߼����
	public void BuyGames(){
		System.out.println("������Ϸ����:");
		BuySonyGames();
		BuyEAGames();
		BuyBlizzardGames();
	}
	
	//������Ϊ�ŵ�����ȥʵ��
	public abstract void BuyBlizzardGames();
		

	public abstract void BuyEAGames();
		

	public abstract void BuySonyGames();
		
}
