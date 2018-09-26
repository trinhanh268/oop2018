package week2.task3;

public class Task3 {
  public person(){
    public String name;
    public int age;
    public String job;
    public void Greeting(){
      System.out.print("Hello. My name is " + this.name);
    }
    public void Introduce(){
      System.out.print("I am " + age + " years old");
    }
    public void myjob(){
      System.out.print(this.job);
    }}
  public animal(){
    public String kind;
    public int age;
    public int amount;
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
    }}
    public car(){
      public String color;
      public int price;
      public int speed;
      public void color(){
        System.out.println(this.color);
        }
      public void price(){
        System.out.println(this.price);
      }
      public void speed(){
        System.out.println(this.kind);
      }
    }
}
    

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
