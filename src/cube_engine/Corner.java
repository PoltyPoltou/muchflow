package cube_engine;

public class Corner extends Block{
	
	Corner(Colors front, Colors up, Colors right){
		blockType = PieceType.CORNER;
		fOne = new Face(Orientations.FRONT,front);
		fTwo = new Face(Orientations.UP,up);
		fThree = new Face(Orientations.RIGHT,right);
		
	}


	public void rotate(char axis) {
		
		
	}


	public void move(char axis) {
		
		
	}

}
