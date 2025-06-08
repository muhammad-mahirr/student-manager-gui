import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem{

    static boolean isModified = false;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Management System");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);


        frame.setSize(800, 540);
        frame.setLayout(null);

        JMenuBar mb = new JMenuBar();
        frame.setJMenuBar(mb);

        JMenu fileMenu = new JMenu("File");
        mb.add(fileMenu);
        JMenu editMenu = new JMenu("Edit");
        mb.add(editMenu);
        JMenu searchMenu = new JMenu("Search");
        mb.add(searchMenu);
        JMenu toolsMenu = new JMenu("Themes");
        mb.add(toolsMenu);
        JMenu helpMenu = new JMenu("Help");
        mb.add(helpMenu);

        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem saveAsItem = new JMenuItem("Save As");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(saveAsItem);
        fileMenu.add(exitItem);

        JMenuItem themeItem = new JMenuItem("Dark Theme");
        toolsMenu.add(themeItem);

        JMenuItem themeItem1 = new JMenuItem("Light Theme");
        toolsMenu.add(themeItem1);

        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JLabel nameLabel = new JLabel("Name");
        frame.add(nameLabel);
        nameLabel.setBounds(30,23,40,30);

        JTextField nameField = new JTextField();
        frame.add(nameField);
        nameField.setBounds(150,27,200,25);
        nameField.setFont(new Font(null, Font.PLAIN, 12));

        JLabel idLabel = new JLabel("Student ID");
        frame.add(idLabel);
        idLabel.setBounds(30,73,100,30);

        JTextField idField = new JTextField();
        frame.add(idField);
        idField.setBounds(150,77,200,25);
        idField.setFont(new Font(null, Font.PLAIN, 12));

        JLabel gpaLabel = new JLabel("CGPA");
        frame.add(gpaLabel);
        gpaLabel.setBounds(30,123,100,30);

        JTextField gpaField = new JTextField();
        frame.add(gpaField);
        gpaField.setBounds(150,127,200,25);
        gpaField.setFont(new Font(null, Font.PLAIN, 12));

        JButton btn1 = new JButton("Add Student");
        frame.add(btn1);
        btn1.setBounds(400, 25, 150,25);
        btn1.setBorder(BorderFactory.createEmptyBorder());
        btn1.setBackground(new Color(102, 187, 106));
        btn1.setFocusable(false);
        btn1.setToolTipText("Click to add a new student");

        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn1.setBackground(new Color(82, 144, 82));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1.setBackground(new Color(102, 187, 106));
            }
        });

        JButton btn2 = new JButton("Search Student");
        frame.add(btn2);
        btn2.setBounds(400, 75, 150,25);
        btn2.setBorder(BorderFactory.createEmptyBorder());
        btn2.setBackground(new Color(171, 140, 228));
        btn2.setFocusable(false);

        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn2.setBackground(new Color(149, 122, 199));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2.setBackground(new Color(171, 140, 228));
            }
        });

        JButton btn3 = new JButton("View Students");
        frame.add(btn3);
        btn3.setBounds(400, 125, 150,25);
        btn3.setBorder(BorderFactory.createEmptyBorder());
        btn3.setBackground(new Color(100, 181, 246));
        btn3.setFocusable(false);

        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn3.setBackground(new Color(66, 165, 245));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3.setBackground(new Color(100, 181, 246));
            }
        });

        JButton btn4 = new JButton("Update Student");
        frame.add(btn4);
        btn4.setBounds(600, 25, 150,25);
        btn4.setBorder(BorderFactory.createEmptyBorder());
        btn4.setBackground(new Color(255, 213, 79));
        btn4.setFocusable(false);

        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn4.setBackground(new Color(255, 202, 40));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn4.setBackground(new Color(255, 213, 79));
            }
        });

        JButton btn5 = new JButton("Delete Student");
        frame.add(btn5);
        btn5.setBounds(600, 75, 150,25);
        btn5.setBorder(BorderFactory.createEmptyBorder());
        btn5.setBackground(new Color(239, 83, 80));
        btn5.setFocusable(false);

        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn5.setBackground(new Color(211, 47, 47));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn5.setBackground(new Color(239, 83, 80));
            }
        });

        JButton btn6 = new JButton("Exit");
        frame.add(btn6);
        btn6.setBounds(600, 125, 150,25);
        btn6.setBorder(BorderFactory.createEmptyBorder());
        btn6.setBackground(new Color(84, 84, 84));
        btn6.setForeground(Color.WHITE);
        btn6.setFocusable(false);

        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn6.setBackground(new Color(64, 64, 64));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn6.setBackground(new Color(84, 84, 84));
            }
        });

        JTextArea textArea = new JTextArea();
        frame.add(textArea);
        textArea.setBounds(30, 180, 420, 270);
        textArea.setEditable(false);
        textArea.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(30, 180, 420, 270);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        frame.add(scrollPane);

        JTextArea textArea1 = new JTextArea();
        frame.add(textArea1);
        textArea1.setBounds(470, 180, 280, 270);
        textArea1.setEditable(false);
        textArea1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));

        ArrayList<Student> students = new ArrayList<>();
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                confirmAndExit(frame, students, saveItem);
            }
        });

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String name = nameField.getText().trim();
                    int studentID = Integer.parseInt(idField.getText().trim());
                    double cgpa = Double.parseDouble(gpaField.getText().trim());
                    if (cgpa > 4 || cgpa < 0){
                        JOptionPane.showMessageDialog(null,"Enter a Valid CGPA");
                    } else{
                        students.add(new Student(name, studentID, cgpa));
                        isModified = true;
                        JOptionPane.showMessageDialog(null, "Student added Successfully!!");
                    }

                    nameField.setText("");
                    idField.setText("");
                    gpaField.setText("");
                    textArea.setText("");
                    btn3.doClick();
                } catch(NumberFormatException e1){
                    JOptionPane.showMessageDialog(null,"You didn't enter any student details");
                }
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int searchID = Integer.parseInt(idField.getText().trim());

                    boolean found = false;
                    for (Student student : students) {
                        if (student.studentID == searchID) {
                            textArea.setText("");
                            student.displayInfo(textArea);
                            found = true;
                        }
                    }
                    if (!found) {
                        JOptionPane.showMessageDialog(null, "No Students Found");
                    }
                    nameField.setText("");
                    idField.setText("");
                    gpaField.setText("");
                } catch (NumberFormatException e3){
                    JOptionPane.showMessageDialog(null, "Enter a Student ID to Search");
                }
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int count = students.size();
                double sum = 0;
                double maxCgpa = 0;
                double topGpa = 0;
                Student topStudent = null;
                for(Student student: students){
                    sum = sum + student.cgpa;
                }
                double avrg = 0;
                avrg = sum / students.size();

                for (Student student : students) {
                    if (student.cgpa > maxCgpa) {
                        maxCgpa = student.cgpa;
                        topStudent = student;
                    }
                }

                if (topStudent != null) {
                    topGpa = topStudent.cgpa;
                }

                textArea1.setText("\n  Total Students: " + String.valueOf(count) + "\n\n" +
                        "  Average Cgpa: " + String.format("%.2f", avrg) + "\n\n" +
                        "  Highest CGPA: " + String.format("%.2f", topGpa));
                textArea.setText("");
                if(students.isEmpty()){
                    JOptionPane.showMessageDialog(null,"No Students Found");
                } else {
                    for(Student student: students){
                        student.displayInfo(textArea);
                    }
                }
            }
        });

        btn4.addActionListener(new ActionListener() {
            private boolean readyToUpdate = false;
            private int targetID = -1;

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!readyToUpdate) {
                        int updateID = Integer.parseInt(idField.getText().trim());
                        boolean found = false;

                        for (Student student : students) {
                            if (student.studentID == updateID) {
                                nameField.setText(student.name);
                                gpaField.setText(String.valueOf(student.cgpa));
                                textArea.setText("Update the student info and press again...");


                                idField.setEditable(false);
                                targetID = updateID;
                                readyToUpdate = true;
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            JOptionPane.showMessageDialog(null, "Student not Found");
                        }

                    } else {
                        for (Student student : students) {
                            if (student.studentID == targetID) {
                                student.name = nameField.getText().trim();
                                student.cgpa = Double.parseDouble(gpaField.getText().trim());
                                btn3.doClick();
                                JOptionPane.showMessageDialog(null, "  \rUpdated Successfully!!");
                                isModified = true;
                                break;
                            }
                        }

                        idField.setEditable(true);
                        nameField.setText("");
                        idField.setText("");
                        gpaField.setText("");
                        readyToUpdate = false;
                        targetID = -1;
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Enter a valid Student ID");
                }
            }
        });


        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int deleteID = Integer.parseInt(idField.getText().trim());
                    boolean found = false;
                    for(int i = 0; i < students.size(); i++){
                        if(students.get(i).studentID == deleteID){
                            students.remove(i);
                            JOptionPane.showMessageDialog(null, "\nStudent deleted!!\n");
                            found = true;
                            isModified = true;
                            nameField.setText("");
                            idField.setText("");
                            gpaField.setText("");
                            textArea.setText("");
                        }
                    }
                    btn3.doClick();
                    if (!found){
                        JOptionPane.showMessageDialog(null,"Student not Found");
                    }
                }catch (NumberFormatException e1){
                    JOptionPane.showMessageDialog(null,"Enter Student ID to Delete any Info");
                }
            }
        });

        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                confirmAndExit(frame, students, saveItem);
            }
        });

        newItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                students.clear();
                nameField.setText("");
                idField.setText("");
                gpaField.setText("");
                nameField.setEditable(true);
                idField.setEditable(true);
                gpaField.setEditable(true);
                textArea1.setText("");
            }
        });

        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File("."));
                int response = fileChooser.showOpenDialog(null);

                if(response == JFileChooser.APPROVE_OPTION){
                    File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                    FileState.currentFile = file;
                    try (Scanner fileReader = new Scanner(file)){
                        while(fileReader.hasNextLine()){
                            String nameLine = fileReader.nextLine();
                            String idLine = fileReader.nextLine();
                            String cgpaLine = fileReader.nextLine();
                            if (fileReader.hasNextLine()){
                                fileReader.nextLine();
                            }

                            String name = nameLine.split(": ")[1];
                            int studentID = Integer.parseInt(idLine.split(": ")[1]);
                            double cgpa = Double.parseDouble(cgpaLine.split(": ")[1]);

                            students.add(new Student(name, studentID, cgpa));
                        }
                    } catch (FileNotFoundException e1){
                        System.out.println(e1.getMessage());
                    }
                    btn3.doClick();
                }
            }
        });


        saveAsItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isModified = false;
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File("."));
                fileChooser.setDialogTitle("Save Student Details");

                int response = fileChooser.showSaveDialog(null);
                if (response == JFileChooser.APPROVE_OPTION) {
                    FileState.currentFile = fileChooser.getSelectedFile();
                    File fileToSave = fileChooser.getSelectedFile();

                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileToSave))) {
                        for (Student student : students) {
                            bw.write("Student Name: " + student.name);
                            bw.newLine();
                            bw.write("Student ID: " + student.studentID);
                            bw.newLine();
                            bw.write("CGPA: " + student.cgpa);
                            bw.newLine();
                            bw.newLine();
                        }
                        JOptionPane.showMessageDialog(null, "Student details saved successfully!");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Error saving file: " + ex.getMessage());
                    }
                }
            }
        });

        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (FileState.currentFile != null) {
                    isModified = false;
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(FileState.currentFile))) {
                        for (Student student : students) {
                            bw.write("Student Name: " + student.name);
                            bw.newLine();
                            bw.write("Student ID: " + student.studentID);
                            bw.newLine();
                            bw.write("CGPA: " + student.cgpa);
                            bw.newLine();
                            bw.newLine();
                        }
                        JOptionPane.showMessageDialog(null, "File saved successfully.");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No file to save. Use 'Save As' first.");
                }
            }
        });

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn6.doClick();
            }
        });

        themeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(new Color(36,41,46));
                nameField.setBackground(new Color(26,30,33));
                nameField.setForeground(Color.WHITE);
                nameField.setCaretColor(Color.WHITE);
                nameField.setBorder(BorderFactory.createEmptyBorder());
                nameLabel.setForeground(Color.WHITE);

                idField.setBackground(new Color(26,30,33));
                idField.setForeground(Color.WHITE);
                idField.setCaretColor(Color.WHITE);
                idField.setBorder(BorderFactory.createEmptyBorder());
                idLabel.setForeground(Color.WHITE);

                gpaField.setBackground(new Color(26,30,33));
                gpaField.setForeground(Color.WHITE);
                gpaField.setCaretColor(Color.WHITE);
                gpaField.setBorder(BorderFactory.createEmptyBorder());
                gpaLabel.setForeground(Color.WHITE);

                mb.setBackground(new Color(26,30,33));
                mb.setBorder(BorderFactory.createEmptyBorder());
                fileMenu.setForeground(Color.WHITE);
                editMenu.setForeground(Color.WHITE);
                toolsMenu.setForeground(Color.WHITE);
                helpMenu.setForeground(Color.WHITE);
                searchMenu.setForeground(Color.WHITE);

                textArea.setBackground(new Color(26,30,33));
                textArea.setForeground(Color.WHITE);

                scrollPane.setBorder(BorderFactory.createEmptyBorder());

                scrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
                    @Override
                    protected void configureScrollBarColors() {
                        this.thumbColor = new Color(80, 80, 80);    // scrollbar thumb
                        this.trackColor = new Color(30, 30, 30);    // scrollbar track
                    }
                    @Override
                    protected JButton createDecreaseButton(int orientation) {
                        return createZeroButton();
                    }

                    @Override
                    protected JButton createIncreaseButton(int orientation) {
                        return createZeroButton();
                    }

                    private JButton createZeroButton() {
                        JButton button = new JButton();
                        button.setPreferredSize(new Dimension(0, 0)); // invisible
                        button.setVisible(false);
                        return button;
                    }

                });

                textArea1.setBackground(new Color(26,30,33));
                textArea1.setForeground(Color.WHITE);
            }
        });

        themeItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(new Color(230,230,230));
                nameField.setBackground(Color.WHITE);
                nameField.setForeground(Color.BLACK);
                nameField.setCaretColor(Color.BLACK);
                nameField.setBorder(BorderFactory.createEtchedBorder());
                nameLabel.setForeground(Color.BLACK);

                idField.setBackground(Color.WHITE);
                idField.setForeground(Color.BLACK);
                idField.setCaretColor(Color.BLACK);
                idField.setBorder(BorderFactory.createEtchedBorder());
                idLabel.setForeground(Color.BLACK);

                gpaField.setBackground(Color.WHITE);
                gpaField.setForeground(Color.BLACK);
                gpaField.setCaretColor(Color.BLACK);
                gpaField.setBorder(BorderFactory.createEtchedBorder());
                gpaLabel.setForeground(Color.black);

                mb.setBackground(new Color(250,250,250));
                mb.setBorder(BorderFactory.createEmptyBorder());
                fileMenu.setForeground(Color.BLACK);
                editMenu.setForeground(Color.BLACK);
                toolsMenu.setForeground(Color.BLACK);
                helpMenu.setForeground(Color.BLACK);
                searchMenu.setForeground(Color.BLACK);

                textArea.setBackground(Color.WHITE);
                textArea.setForeground(Color.BLACK);

                scrollPane.setBorder(BorderFactory.createEtchedBorder());

                scrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
                    @Override
                    protected void configureScrollBarColors() {
                        this.thumbColor = Color.GRAY;
                        this.trackColor = Color.LIGHT_GRAY;
                    }
                    @Override
                    protected JButton createDecreaseButton(int orientation) {
                        return createZeroButton();
                    }

                    @Override
                    protected JButton createIncreaseButton(int orientation) {
                        return createZeroButton();
                    }

                    private JButton createZeroButton() {
                        JButton button = new JButton();
                        button.setPreferredSize(new Dimension(0, 0)); // invisible
                        button.setVisible(false);
                        return button;
                    }

                });

                textArea1.setBackground(Color.WHITE);
                textArea1.setForeground(Color.BLACK);
            }
        });



    }

    private static void confirmAndExit(JFrame frame, ArrayList<Student> students, JMenuItem saveItem) {
        if (isModified && FileState.currentFile != null) {
            int choice = JOptionPane.showConfirmDialog(
                    frame,
                    "Do you want to save this file before exiting?",
                    "Exit Confirmation",
                    JOptionPane.YES_NO_CANCEL_OPTION
            );

            if (choice == JOptionPane.CANCEL_OPTION) {
                return;
            }

            if (choice == JOptionPane.YES_OPTION) {
                saveItem.doClick();
            }
        }

        frame.dispose();
        System.exit(0);
    }

    public class FileState {
        public static File currentFile = null;
    }

    public static void loadFromFile(ArrayList<Student> students, File file){
        try (Scanner fileReader = new Scanner(file)){
            while(fileReader.hasNextLine()){
                String nameLine = fileReader.nextLine();
                String idLine = fileReader.nextLine();
                String cgpaLine = fileReader.nextLine();
                if (fileReader.hasNextLine()){
                    fileReader.nextLine();
                }

                String name = nameLine.split(": ")[1];
                int studentID = Integer.parseInt(idLine.split(": ")[1]);
                double cgpa = Double.parseDouble(cgpaLine.split(": ")[1]);

                students.add(new Student(name, studentID, cgpa));
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}