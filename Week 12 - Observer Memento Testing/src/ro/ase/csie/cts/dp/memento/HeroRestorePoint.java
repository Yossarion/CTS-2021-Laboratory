package ro.ase.csie.cts.dp.memento;

import java.util.Date;

public class HeroRestorePoint {
	String name; 
	int lifePoints;
	private String magic;
	
	private Date timestamp;
	
	public HeroRestorePoint(String name, int lifePoints, String magic) {
		this.name = name;
		this.lifePoints = lifePoints;
		this.magic = magic;
		this.timestamp = new Date();
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMagic() {
		return magic;
	}
}
