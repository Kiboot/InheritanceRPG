package rpgsample;

public class Hero extends Characters{
	
	private Hero Mage, Assassin, Thief, Palladin;
	private int heroID;
	private double baseSTR, baseAGI, baseINT;
	private int level;
	
	
	
	
	public Hero(Hero Mage, String name, double baseHP, double baseMP, double basePdef, double baseMdef, double baseSTR, double baseAGI, double baseINT) {
		
		super(name);
		super.setStatics(baseHP, baseMP, basePdef, baseMdef);
		this.baseSTR = baseSTR;
		this.baseAGI = baseAGI;
		this.baseINT = baseINT;

	}
	
	
	
	public int getHeroID() {
		return heroID;
	}
	
	private void setHeroID(int heroID) {
		this.heroID = heroID;
	}
	
	public double baseHPwStat (double baseSTR) {		
		return super.getBaseHP() + (20*baseSTR); //20 Health Points per 1 STR point
	}
	public double baseMPwStat (double baseINT) {		
		return super.getBaseMP() + (12*baseINT); //12 Magic Points per 1 STR point
	}

}
