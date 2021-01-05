
public class CircleWithStaticMembers {

	double radius;
	static int numberOfObjects = 0;
	void CircleWithStaticMembers(){
		radius = 1;
		numberOfObjects++;
	}
	void CircleWithStaticMembers(double newRadius){
		radius=newRadius;
		numberOfObjects++;
	}
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	double getArea() {
		return radius * radius * Math.PI;
		
	}
	

}

