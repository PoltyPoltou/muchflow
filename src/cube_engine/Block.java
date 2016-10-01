package cube_engine;

public class Block {
	/*a block represents a piece of the rubik's cube
	By default pieces are in a given position
	 * Corners in the top right front
	 * edge in the top front
	 * center in front
	 */
	
	Piece_Type blockType;
	int posX,posY,posZ;
	Block(Colors front, Colors up, Colors right){
		blockType = Piece_Type.CORNER;
		Face fOne,fTwo,fThree;
		fOne = new Face(Orientations.FRONT,front);
		fTwo = new Face(Orientations.UP,up);
		fThree = new Face(Orientations.RIGHT,right);
		
	}
	Block(Colors front, Colors up){
		blockType = Piece_Type.EDGE;
		Face fOne,fTwo;
		fOne = new Face(Orientations.FRONT,front);
		fTwo = new Face(Orientations.UP,up);
	}
	Block(Colors front){
		blockType = Piece_Type.FACE_CENTER;
		Face fOne;
		fOne = new Face(Orientations.FRONT,front);
	}
	Block(){
		blockType = Piece_Type.CUBE_CENTER;
	}
	
}
