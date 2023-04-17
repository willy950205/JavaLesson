package interfacetest;

public class Dog implements Animal{

    String name;

    public Dog(String name){
        this.name = name;
    }

    @Override
    public void name() {
        System.out.println("내 이름은 "+this.name);
        System.out.println("내 나는 "+Animal.name+"이다");
    }

    @Override
    public void move() {
        System.out.println(this.name+" : 슥슥~~");
    }

    @Override
    public void bark() {
        System.out.println(this.name+" : 멍멍!");
    }

    @Override
    public void eat() {
        System.out.println(this.name+" : 개가 밥을 먹는 소리");
    }
}