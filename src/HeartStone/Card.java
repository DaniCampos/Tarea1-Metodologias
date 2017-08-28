package HeartStone;

public interface Card {

	void hasBeenDamaged(int points);

	int getLifePoints();

	String getName();

	boolean stillAlive();

	int getActionPoints();
	
	void attack(Card card);
	
	void receivesAttack(Card card);
	
	void receivesAttackAssassin(Card card);
	
	void receivesAttackDruid(Card card);
	
	void receivesAttackHealer(Card card);
	
	void receivesAttackHunter(Card card);
	
	void receivesAttackKnight(Card card);
	
	void receivesAttackMage(Card card);
	
	void receivesAttackPaladin(Card card);
	
	void receivesAttackShaman(Card card);
	
	void receivesAttackWarlock(Card card);
}
