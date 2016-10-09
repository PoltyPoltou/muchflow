package cube_engine;

public enum Colors {
	RED,
	ORANGE,
	WHITE,
	YELLOW,
	GREEN,
	BLUE;
	
	Colors opposite;
	Colors(){
		this.opposite=this.OppositeColor();
	}
	
	private Colors OppositeColor(){
		switch(this){
		case BLUE:
			return GREEN;
		case GREEN:
			return BLUE;
		case ORANGE:
			return RED;
		case RED:
			return ORANGE;
		case WHITE:
			return YELLOW;
		case YELLOW:
			return WHITE;
		default: 
			return null;
		
		}
		
	}
	
}
