package rpgengine;

public abstract class AbstractCharacter {
	// BASSIC SKILLS
	// points to increase level
	Integer exp;
	// increasing the required points above lvl
	Integer lvl;
	// three basic skills which can add point of ability
	Integer hp;
	Integer str;
	Integer dex;

	// OTHER SKILLS FOR WARRIOR AND MAGE
	Double st; // this is stamina = pl:wytrzymaloœæ
	Double mp; // this is mannaPoints = pl:punktyManny

}
