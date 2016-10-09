package cube_engine;

public abstract class Block {
	/*a block represents a piece of the rubik's cube
	By default pieces are in a given position
	 * Corners in the top right front
	 * edge in the top front
	 * center in front
	 */
	Face fOne,fTwo,fThree;
	PieceType blockType;
	int posX,posY,posZ;

	public Face getfOne() {
		if(this.blockType!=PieceType.CUBE_CENTER){
			return fOne;
		}
		return null;
	}
	public Face getfTwo() {
		if(this.blockType!=PieceType.CUBE_CENTER&&
		   this.blockType!=PieceType.FACE_CENTER){
		return fTwo;
		}
		return null;
	}
	public Face getfThree() {
		if(this.blockType==PieceType.CORNER){
			return fThree;
		}
		return null;
	}
	
	public PieceType getBlockType() {
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
	
	abstract public void rotate(char axis);
	abstract public void move(char axis);
}
