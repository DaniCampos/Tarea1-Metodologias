package HeartStone;

public class Warlock extends AbstractCard {
	public static int initial_Life_Points = 100;
	public int attackPoints = 10;
	
	public Warlock(String aName) {
		name = aName;
		lifePoints = initial_Life_Points;
		actionPoints = attackPoints;
		
	}
	
	@Override
	public void attack(Card card) {
		card.receivesAttackWarlock(this);
		
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
		hasBeenDamaged(card.getActionPoints() * -1);
		
	}

	@Override
	public void receivesAttackHunter(Card card) {
		receivesAttack(card);
		
	}

	@Override
	public void receivesAttackKnight(Card card) {
		receivesAttack(card);
		
	}

	@Override
	public void receivesAttackMage(Card card) {
		receivesAttack(card);
		
	}

	@Override
	public void receivesAttackPaladin(Card card) {
		actionPoints += card.getActionPoints()/3;
		hasBeenDamaged(-1*card.getActionPoints()/3);
		
	}

	@Override
	public void receivesAttackShaman(Card card) {
		actionPoints -= card.getActionPoints() * 2/3;
		hasBeenDamaged(card.getActionPoints() * 2/3);
		
	}

	@Override
	public void receivesAttackWarlock(Card card) {
		receivesAttack(card);
		
	}

}
