package pl.grafiszti.obiektowe.answers.zad26;

public class Point3D extends Point2D {
	int z;

	public Point3D() {
		super();
		z = 0;
	}

	public Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public String toString() {
		return x + " " + y + " " + z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
}
