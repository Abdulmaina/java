/**
 * Write a description of class Box here.
 * 
 * @author (ABDULLAHI MAIMUNAT) 
 * @U16/FNS/CSC/2104
 */
public class Box {
private double length , width , height; //instance variables
public Box(double boxLength , double boxWidth , double boxHeight) { //constructor
length = boxLength;
width = boxWidth;
height = boxHeight;
}
public double volume() { //instant methods
return length * width * height;
}
public double surfaceArea() {
return 2*(length*width + length*height + width*height);
}
}
