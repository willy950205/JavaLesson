package generics.fruits;

public class Fruit {


    private String name = "그냥 과일이야";

    String name(){
        return this.name;
    }
    
    void taste(){
        System.out.println("과일마다 맛이 다르겠지요");
    }
    
    void smell(){
        System.out.println("과일마다 향이 다르겠지요.");
    }

    void color(){
        System.out.println("과일 색이 거기서 거기겠지요");
    }
    
}
