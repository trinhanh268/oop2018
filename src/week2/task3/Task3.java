package week2.task3;

class person{
    private String name;
    private int age;
    private String job;
    public void Greeting(){
      System.out.print("Hello. My name is " + this.name);
    }
    public void Introduce(){
      System.out.print("I am " + age + " years old");
    }
    public void myjob(){
      System.out.print(this.job);
    }
}
 class animal{
    private String kind;
    private int age;
    private int amount;
    public void kind(){
      System.out.println(this.kind);
      System.out.println(this.amount + " left ");
    }
    public void check(){
     if (age < 10) System.out.println("Still small. Need help");
     else System.out.println("This is growning");
    }
    public void sell(){
      if(amount > 10000) System.out.println("Cheap");
      else System.out.println("Expensive");
    }
}
class car{
      private String color;
      private int price;
      private int speed;
      public void color(){
        System.out.println(this.color);
        }
      public void price(){
        System.out.println(this.price);
      }
      public void speed(){
        System.out.println(this.speed);
      }
}
public class Task3 {
  public static void main(String[] args){
 
  }
}
    

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
