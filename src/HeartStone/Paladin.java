package HeartStone;

public class Paladin extends AbstractCard {
	public static int initial_Life_Points = 100;
	public int attackPoints = 10;
	
	public Paladin(String aName) {
		name = aName;
		lifePoints = initial_Life_Points;
		actionPoints = attackPoints;
		
	}
	
	@Override
	public void attack(Card card) {
		card.receivesAttackPaladin(this);
		
	}
	
	@Override
	public void receivesAttackAssassin(Card card) {
		receivesAttack(card);
		
	}

	@Override
	public void receivesAttackDruid(Card card) {
		actionPoints = actionPoints * 2;
		hasBeenDamaged(card.getActionPoints() /2);
		
	}

	@Override
	public void receivesAttackHealer(Card card) {
		if (stillAlive()) {
			hasBeenDamaged(-1*actionPoints/2);
		}
		
	}

	@Override
	public void receivesAttackHunter(Card card) {
		receivesAttack(card);
		
	}

	@Override
	public void receivesAttackKnight(Card card) {
		hasBeenDamaged(card.getActionPoints() / 2);
		
	}

	@Override
	public void receivesAttackMage(Card card) {
		hasBeenDamaged(card.getActionPoints() * 2);
		
	}

	@Override
	public void receivesAttackPaladin(Card card) {
		actionPoints += card.getActionPoints()/3;
		hasBeenDamaged(-1*card.getActionPoints()/3);
		
	}

	@Override
	public void receivesAttackShaman(Card card) {
		actionPoints -= card.getActionPoints()/3;
		hasBeenDamaged(card.getActionPoints()/3);
		
	}

	@Override
	public void receivesAttackWarlock(Card card) {
		receivesAttack(card);
		
	}

}
