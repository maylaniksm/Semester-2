package edu.praktikum.pbo.modul5;

public class Main {
public static void main(String[] args) {
Vehicle car = new Car();
car.move(); //Output: Car is accelerating and moving

car = new Vehicle();
car.move(); //Output: Vehicle is moving
}
}
class Car extends Vehicle {
@Override
public void move() {
System.out.println("Car is accelerating and moving");
}
}
class Vehicle {
public void move() {
System.out.println("Vehicle is moving");
}
}