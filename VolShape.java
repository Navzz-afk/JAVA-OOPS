abstract class Shape{
int dim1;
int dim2;
abstract void printArea();
}

class Rectangle extends Shape{
Rectangle(int l,int b){
dim1=l;
dim2=b;
}



void printArea(){
System.out.println("The area is"+dim1*dim2);
}

}

class Triangle extends Shape{


Triangle(int h , int b){
	dim1=h;
	dim2=b;
	}


void printArea(){
System.out.println("The area is"+0.5*dim1*dim2);
}

}

class Circle extends Shape{

 Circle(int r){
	dim1=r;
	dim2=r;
	}

void printArea(){
System.out.println("The area is"+3.14*dim1*dim2);
}

}

class VolShape{
public static void main(String args[]){

Rectangle fig1=new Rectangle(10,20);
Triangle fig2=new Triangle(10,20);
Circle fig3=new Circle(10);
fig1.printArea();
fig2.printArea();
fig3.printArea();
}
}