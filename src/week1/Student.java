package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name, id, group, email;

    // TODO: khai báo các phương thức getter, setter cho Student
    public void SetName(String n){
        this.name = n;
    }
    public String GetName(){
        return name;
    }
    public void SetId(String n){
        this.id = n;
    }
    public String GetId(){
        return id;
    }
    public void SetGroup(String n){
        this.group = n;
    }
    public String GetGroup(){
        return group;
    }
    public void SetEmail(String n){
        this.email = n;
    }
    public String GetEmail(){
        return email;
    }
    /**
     * Constructor 1
     */
    Student() {
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        name = n;
        id = sid;
        email = em;
        group = "INT22042";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }

    String getInfo() {
        System.out.println("Ten : " + name + " " + "MaSV : " + id + " " + "Group : " + group + " " + "Email : " + email);
        return null; // xóa dòng này sau khi cài đặt
    }
}
