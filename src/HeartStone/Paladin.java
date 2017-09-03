package HeartStone;

public class Paladin extends AbstractCard {
	
	public Paladin(String aName, int initial_Life_Points, int attackPoints) {
		name = aName;
		lifePoints = initial_Life_Points;
		actionPoints = attackPoints;
		
	}
	
	@Override
	public void attack(Card card) {
		if (this.stillAlive() & card.stillAlive()){
			card.receivesAttackPaladin(this);	
		}
		
	}
	
	@Override
	public void receivesAttackKnight(Card card) {
		hasBeenDamaged(card.getActionPoints() / 2);
		
	}

	@Override
	public void receivesAttackMage(Card card) {
		hasBeenDamaged(card.getActionPoints() * 2);
		
	}

}
