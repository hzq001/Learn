package designpattern.mvc;

/**
 * @author zq.huang
 * @date 2020/2/21
 */
public class StudentView {

    public void printStudentDetails(String studentName,String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: "+studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
