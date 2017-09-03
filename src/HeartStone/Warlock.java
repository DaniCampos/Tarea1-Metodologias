package HeartStone;

public class Warlock extends AbstractCard {
	
	public Warlock(String aName, int initial_Life_Points, int attackPoints) {
		name = aName;
		lifePoints = initial_Life_Points;
		actionPoints = attackPoints;
		
	}
	
	@Override
	public void attack(Card card) {
		if (this.stillAlive() & card.stillAlive()){
			card.receivesAttackWarlock(this);	
		}
		
	}

	@Override
	public void receivesAttackHealer(Card card) {
		hasBeenDamaged(card.getActionPoints());
		
	}

	@Override
	public void receivesAttackShaman(Card card) {
		if(getActionPoints() > 0) {
			actionPoints -= card.getActionPoints() * 2/3;
		}	
		hasBeenDamaged(card.getActionPoints() * 2/3);
		
	}

}
