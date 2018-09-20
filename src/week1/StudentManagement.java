package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    int MAX = 100;
    Student[] Students = new Student[MAX];

    public boolean sameGroup(Student s1, Student s2) {
        if(s1.GetGroup().equals(s2.GetGroup()))
            return true;
        else return false;

    }

    void studentsByGroup() {
        String[] groups = new String[MAX];
        int SizeGroup = 0;
 
        groups[0] = Students[0].GetGroup();
        boolean check = true;

        for(int i = 0; i < MAX; i++){
            for(int j = 0; j < SizeGroup; j++){
                if(Students[i].GetGroup().equals(groups[j])) {
                    check = false;
                    break;
                }
            }
            if(check){
                groups[SizeGroup] = Students[i].GetGroup();
                SizeGroup ++;
            }
        }


        for(int i = 0; i < SizeGroup; i++){
            for(int j = 0; j < MAX; j++){
                if(Students[j].GetGroup().equals(groups[i]))
                    Students[j].getInfo();
            }
        }
    }

    void removeStudent(String id) {
        for(int i = 0; i < MAX; i++){
            if (Students[i].GetId().equals(id)) {
                for(int j = i; j < MAX-1; j++){
                    Students[j].SetName(Students[j + 1].GetName());
                    Students[j].SetId(Students[j + 1].GetId());
                    Students[j].SetGroup(Students[j + 1].GetGroup());
                    Students[j].SetEmail(Students[j + 1].GetEmail());
                }
                MAX -= 1;
                return ;
            }
        }
    }

    public static void main(String[] args) {
        Student SV1 = new Student();
        Student SV2 = new Student("Student","000","uet@vnu.edu.vn");
        Student SV3 = new Student(SV1);

        System.out.println(SV1.GetName());
        SV1.getInfo();
        SV2.getInfo();
        SV3.getInfo();

        StudentManagement Stud = new StudentManagement();
        System.out.println(Stud.sameGroup(SV1,SV2));
        System.out.println(Stud.sameGroup(SV1,SV3));

        for(int i = 0; i < Stud.MAX; i++){
            Stud.Students[i] = new Student();
            Stud.Students[i].SetId("UET " + i);
            if(i%2==0){
                Stud.Students[i].SetGroup("INT22041");
            }
            else Stud.Students[i].SetGroup("INT22042");
                 
        }

        System.out.println("Sort by group");
        Stud.studentsByGroup();

        System.out.println("Delete Student");
        Stud.removeStudent("UET 5");
        for (int i = 0; i < Stud.MAX; i++) {
            Stud.Students[i].getInfo();
        }
    }
}
