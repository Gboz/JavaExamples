package rpgengine;

public class Player extends AbstractCharacter {

	Player() {
		this.exp = 0;
		this.lvl = 0;
		this.hp = 50;
		this.str = 5;
		this.dex = 5;
		this.st = 50.0;
		this.mp = 0.0;
	}
	
//	public Integer hit(Player player, Enemy enemy) {
//		
//		return;
//	}

	@Override
	public String toString() {
		return "Player [exp=" + exp + ", lvl=" + lvl + ", hp=" + hp + ", str=" + str + ", dex=" + dex + ", st=" + st
				+ ", mp=" + mp + "]";
	}

}
