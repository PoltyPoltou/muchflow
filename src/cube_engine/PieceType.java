package cube_engine;

public enum PieceType {

	CORNER(3),
	EDGE(2),
	FACE_CENTER(1),
	CUBE_CENTER(0);
	
	int Faces;
	PieceType(int nbFaces){
		this.Faces = nbFaces;
	}
}
