package rpgsample;

public class Characters {
	
	
	private String name;
	private double baseHP, baseMP, basePdef, baseMdef;
	
	public Characters(String name, double baseHP, double baseMP) {
		this.name = name;
		this.baseHP = baseHP;
		this.baseMP = baseMP;
	}
	
	
	public Characters(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBaseHP() {
		return baseHP;
	}
	
	public Double getBaseMP() {
		return baseMP;
	}
	
	public Double getBasePdef() {
		return basePdef;
	}
	
	public Double getBaseMdef() {
		return baseMdef;
	}
	public void setStatics(double baseHP, double baseMP, double basePdef, double baseMdef) {
		this.baseHP   = baseHP;
		this.baseMP   = baseMP;
		this.basePdef = basePdef;
		this.baseMdef = baseMdef;
		
	}



}
