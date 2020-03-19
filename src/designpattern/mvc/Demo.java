package designpattern.mvc;

/**
 * @author zq.huang
 * @date 2020/2/21
 */
public class Demo {

    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model,view);

        controller.updateView();
        controller.setStudentName("John");
        controller.updateView();

    }

    private static Student retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}