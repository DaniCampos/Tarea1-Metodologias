package HeartStone;

public abstract class AbstractCard implements Card{
	
	protected String name;
	protected int lifePoints;
	protected int damagePoints;
	protected int actionPoints;
	
	
	public String getName() {
		return name;
	}
	
	
	public int getLifePoints() {
		return lifePoints;
	}
	
	public int getActionPoints() {
		return actionPoints;
	}
	
	public void hasBeenDamaged(int points) {
		damagePoints += points;
	}
	
	
	public boolean stillAlive() {
		if(damagePoints >= lifePoints) {
			return false;
		}
		return true;
	}
	
	public void receivesAttack(Card card) {
		hasBeenDamaged(card.getActionPoints());
	}
	
	public abstract void attack(Card card);
	
	
	
	
}
