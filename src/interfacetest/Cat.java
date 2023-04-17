package interfacetest;

public class Cat implements Animal{

    String name;

    public Cat(String name){
        this.name = name;
    }

    @Override
    public void name() {
        System.out.println("내 이름은 "+this.name);
        System.out.println("내 나는 "+Animal.name+"이다");
    }

    @Override
    public void move() {
        System.out.println(this.name+" : 사뿐사뿐~~");
    }

    @Override
    public void bark() {
        System.out.println(this.name+" : 야옹~~");
    }

    @Override
    public void eat() {
        System.out.println(this.name+" : 고양이가 밥을 먹는 소리");
    }
}