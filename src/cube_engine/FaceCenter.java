package cube_engine;

public class FaceCenter extends Block{
	FaceCenter(Colors front){
		blockType = PieceType.FACE_CENTER;
		fOne = new Face(Orientations.FRONT,front);
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
