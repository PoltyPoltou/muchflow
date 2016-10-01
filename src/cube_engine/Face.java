package cube_engine;

public class Face {
	//A block has 6 faces but some are unused
	Orientations orient;
	Colors color;
	
	public Face(Orientations orient, Colors color) {
		this.orient = orient;
		this.color = color;
	}
	 
}
