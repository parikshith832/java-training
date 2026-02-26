package Day4;

class student2 {
    String name;

    student2(String name) {
        this.name = name;
    }
}

class department {
    String deptname;
    student2 stud;

    department(String deptname, student2 stud) {
        this.deptname = deptname;
        this.stud = stud;
    }

    void show() {
        System.out.println(stud.name + " belongs to " + deptname);
    }
}

public class prg4 {
    public static void main(String[] args) {
        student2 s = new student2("pari");
        department ob = new department("ise", s);
        ob.show();
    }

}
