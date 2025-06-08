import javax.swing.*;

class Student {
    String name;
    int studentID;
    double cgpa;

    Student(String name, int studentID, double cgpa){
        this.name = name;
        this.studentID = studentID;
        this.cgpa = cgpa;
    }

    public void displayInfo(JTextArea textArea){
        textArea.append("  Student Name: " + name + "\n");
        textArea.append("  Student ID: " + studentID + "\n");
        textArea.append("  Student’s CGPA: " + cgpa + "\n");
        textArea.append("\n");
    }
}
