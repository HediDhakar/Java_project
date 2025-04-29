# Java_project
Student Grades Management System (Java - Console App)
# 🎓 Student Grades Management System (Java Console App)

This is a simple Java console-based application for managing student grades within multiple subjects and teaching units (Unités d'Enseignement - UE). Each subject contains a **DS grade**, an **exam grade**, and a **coefficient**, and each unit groups several subjects with its own coefficient.

The project was developed as part of an academic exercise to practice object-oriented programming, menu-driven interfaces, and data organization using **arrays** (no advanced collections like ArrayList or HashMap).

---

## 📌 Features

- ✅ Add a new subject to a UE (unit of teaching)
- 🗑️ Manage subjects (add/remove/edit limited to array size)
- 🧮 Calculate averages for each subject (based on DS and exam)
- 📊 Compute the overall average of a teaching unit (weighted)
- 📈 Display statistics:
  - Best-performing subject (highest average)
  - Lowest-performing subject
  - Average of all subject averages
  - Total number of subjects added
- 🆔 Retrieve and display a specific student’s grades using their ID
- 🔁 Menu interface using `switch` with continuous user interaction

---

## 📂 Project Structure

- `Matiere.java`: Represents a subject with DS grade, exam grade, and coefficient.
- `UniteEnseignement.java`: Holds an array of `Matiere` objects and provides logic for average and statistics.
- `Main.java`: Contains the main program loop, menu logic, and user interaction using `Scanner`.

---

## 🧠 Educational Objectives

This project helps learners practice:

- ✅ Object-Oriented Programming (OOP) in Java
- 🧱 Composition: a UE *has* multiple subjects
- 🔄 Array manipulation and loops
- 🎛️ Menu-driven programs using `switch` and `Scanner`
- 📊 Statistical operations over structured data

---

## 🧪 Example: Menu Display

```text
Menu:
1. Ajouter une matiere
2. Afficher les moyenne des matieres
3. Calculer la moyen generale de UE
4. Afficher les notes d un etudiant

