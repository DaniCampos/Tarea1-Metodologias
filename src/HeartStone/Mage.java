package HeartStone;

public class Mage extends AbstractCard {
	
	public Mage(String aName, int initial_Life_Points, int attackPoints) {
		name = aName;
		lifePoints = initial_Life_Points;
		actionPoints = attackPoints;
		
	}
	
	@Override
	public void attack(Card card) {
		if (this.stillAlive() & card.stillAlive()){
			card.receivesAttackMage(this);	
		}
		
	}
	
	@Override
	public void receivesAttackAssassin(Card card) {
		hasBeenDamaged(card.getActionPoints() * 2);
		
	}

	@Override
	public void receivesAttackWarlock(Card card) {
		hasBeenDamaged(card.getActionPoints() / 2);
		
	}

}
