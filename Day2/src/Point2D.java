class Point2D{
	private double x;
	private double y;
	Point2D(double x, double y){
		this.x = x;
		this.y = y;
	}
	public String show(){
		return "x: "+x+" y: "+y;
	}
	boolean isEqual(Point2D anotherPoint){
		if(this.x == anotherPoint.x && this.y == anotherPoint.y){
			return true;
		} else 
			return false;
	}
	double calculateDistance(Point2D anotherPoint){
		return Math.sqrt(Math.pow((this.x-anotherPoint.x),2)+Math.pow((this.y-anotherPoint.y),2));
	}
}