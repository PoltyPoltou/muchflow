package cube_engine;

public class Edge extends Block{
	Edge(Colors front, Colors up){
		blockType = PieceType.EDGE;
		fOne = new Face(Orientations.FRONT,front);
		fTwo = new Face(Orientations.UP,up);
	}

	@Override
	public void rotate(char axis) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(char axis) {
		// TODO Auto-generated method stub
		
	}
	
}
