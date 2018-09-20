package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name, id, group, email;
    // TODO: khai báo các phương thức getter, setter cho Student
    public void SetName( String n){
        this.name = n; }
    public String Getname(){
        return name;}
    public void SetID(String n){
        this.id = n;}
    public String GetID(){
        return id;}
    public void Setgroup(String n){
        this.group = n;}
    public String Getgroup(){
        return group;}
    public void Setemail( String n){
        this.email = n;}
    public String Getemail(){
        return email;}
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
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
        // TODO:
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
        // TODO:
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }

    String getInfo() {
        // TODO:
        System.out.println("Ten : " + name + " " + "MaSV : " + id + " " + "Group : " + group + " " + "Email : " + email);
     
    }
}
