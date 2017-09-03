package HeartStone;

public class Druid extends AbstractCard{

	
	public Druid(String aName, int initial_Life_Points, int attackPoints) {
		name = aName;
		lifePoints = initial_Life_Points;
		actionPoints = attackPoints;
		
	}

	@Override
	public void attack(Card card) {
		if (this.stillAlive() & card.stillAlive()){
			card.receivesAttackDruid(this);	
		}
		
	}
	
	@Override
	public void receivesAttackPaladin(Card card) {
		if(getDamagePoints() > 0) {
			hasBeenDamaged(-1*card.getActionPoints()*2/3);
		}
		actionPoints += card.getActionPoints()*2/3;
	}

	@Override
	public void receivesAttackShaman(Card card) {
		if(getActionPoints() > 0) {
			actionPoints -= card.getActionPoints()*2/3;
		}
		hasBeenDamaged(card.getActionPoints()*2/3);
		
	}

}
