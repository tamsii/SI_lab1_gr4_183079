class Point {
	String id ;
	double x,y;
	//new variable
	String color;

	//constructor
	public Point(String id, double x, double y, String color) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.color = color;
	}
	//setters and getters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}



	public void move (char xDirection, char yDirection) {
		// (L,R,U,D) left right up down
		if(xDirection=='L'){
			this.x--;
		}
		if(xDirection=='R'){
			this.x++;
		}
		if(yDirection=='U'){
			this.y++;
		}
		if(yDirection=='D'){
			this.y--;
		}

	}

	public void draw () {
		//TODO
		System.out.println("("+this.x +", "+this.y+ ")");
	}


}