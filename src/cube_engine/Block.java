package cube_engine;

public class Block {
	/*a block represents a piece of the rubik's cube
	By default pieces are in a given position
	 * Corners in the top right front
	 * edge in the top front
	 * center in front
	 */
	Face fOne,fTwo,fThree;
	Piece_Type blockType;
	int posX,posY,posZ;
	Block(Colors front, Colors up, Colors right){
		blockType = Piece_Type.CORNER;
		fOne = new Face(Orientations.FRONT,front);
		fTwo = new Face(Orientations.UP,up);
		fThree = new Face(Orientations.RIGHT,right);
		
	}
	
	Block(Colors front, Colors up){
		blockType = Piece_Type.EDGE;
		fOne = new Face(Orientations.FRONT,front);
		fTwo = new Face(Orientations.UP,up);
	}
	
	Block(Colors front){
		blockType = Piece_Type.FACE_CENTER;
		fOne = new Face(Orientations.FRONT,front);
	}
	
	Block(){
		blockType = Piece_Type.CUBE_CENTER;
	}

	public Face getfOne() {
		return fOne;
	}
	public Face getfTwo() {
		return fTwo;
	}
	public Face getfThree() {
		return fThree;
	}
	public Piece_Type getBlockType() {
		return blockType;
	}
	public int getPosX() {
		return posX;
	}
	public int getPosY() {
		return posY;
	}
	public int getPosZ() {
		return posZ;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public void setPosZ(int posZ) {
		this.posZ = posZ;
	}
	
	public void rotate(String axis){
		
	}
	
	public void move(String axis){
		
	}
}
