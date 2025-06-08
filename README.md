# Student Manager GUI 📚

A Java Swing application to manage student records.

You can add, search, update, delete, and view student information. It also shows helpful statistics like average CGPA and the top student.


## ✨ Features

- ➕ Add new students with name, ID, and CGPA  
- 🔍 Search for students by their ID  
- ✏️ Update or Delete student records by their ID 
- 📊 View total students, average CGPA, and highest CGPA  
- 💾 Save and load student data from a text file  
- 🎨 Switch between light and dark themes


## 🚀 How to Run

1. **Download or Clone the Repository**

   ```
   git clone https://github.com/muhammad-mahirr/student-manager-gui.git

   ```
2. **Open Command Prompt (Windows) or Terminal (Mac/Linux)**

   Navigate to the directory of the project (any folder where you placed this project code), which must contain the `StudentManagementSystem.java` and `Student.java`

   Compile the Java files:
   ```
   javac StudentManagementSystem.java

   ```
   Run the program:
   ```
   java StudentManagementSystem

   ```

## 🖱️ How to Use the Student Manager GUI

**➕ 1. Add a Student**

- Fill in the Name, Student ID, and CGPA fields.

- Click the `Add Student` button.

- A confirmation message will appear.


**🔍 2. Search for a Student**

- Enter the Student ID in the ID field.

- Click `Search Student`.

- The student’s details will be shown in the left text area.


**🧐 4. View All Students & Statistics**

   Click the `View Students` button.

   It will show all students on the left and summary (total students, average CGPA, highest CGPA) on the right.


**✏️ 5. Update a Student**

   Enter the Student ID you want to update.

- Click `Update Student` and the student's name and CGPA will be filled in for editing.

- Edit the Name or CGPA, then click `Update Student` again.

A success message will confirm the update.


**🗑 6. Delete a Student**

- Enter the Student ID.

- Click `Delete Student` to remove them from the list.

A message will confirm if the deletion was successful.


**💾 7. Save or Load Data**

*Use the `File` menu in the top bar:*

- *New:* Restart the app and no data stored.

- *Open:* Load student data from a .txt file.

- *Save:* Save changes to the last opened file.

- *Save As:* Save student data to a new file.


**🎨 8. Change Theme**

  From the `Themes` menu:

  Choose `Dark Theme` or `Light Theme` to change the app’s appearance.


**❌ 9. Exit the Program**

  Click the `Exit` button, or use the ``File > Exit menu``.

  If you’ve made changes, the app will ask if you want to save before quitting.

   
