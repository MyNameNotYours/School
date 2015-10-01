package school;
public class School {
    public static void main(String[] args) {
        Student Kazuto =  Student.addStudent("Kazuto",Person.Gender.Male,120,10);
        Student Shiroe =  Student.addStudent("Shiroe",Person.Gender.Male,115,12);
        Student Chitoge =  Student.addStudent("Chitoge",Person.Gender.Female,106,10);
        Student Akeno =  Student.addStudent("Akeno",Person.Gender.Female,113,12);        
        Student Chihiro =  Student.addStudent("Chihiro",Person.Gender.Female,98,10);        
        Student Rito =  Student.addStudent("Rito",Person.Gender.Male,138,11);        
                
        Teacher Kagami = Teacher.addTeacher("Kagami", Person.Gender.Male, 110,0.7);
        Teacher Mikdao = Teacher.addTeacher("Mikdao", Person.Gender.Female, 98,3.2);
        Teacher Katsuragi = Teacher.addTeacher("Katsuragi", Person.Gender.Male, 112,5.2);
        Teacher Akame = Teacher.addTeacher("Akame", Person.Gender.Female, 92,9.2);
        Teacher Yuki = Teacher.addTeacher("Yuki", Person.Gender.Female, 100,1.2);
        
        Course japanese =  Course.addCourse("Japanese", Course.Type.Language, 1, false);
        Course physics =  Course.addCourse("Photography", Course.Type.Math, 3, true);       
        Course biology =  Course.addCourse("Biology", Course.Type.Science, 2, true);       
        Course worldHistory =  Course.addCourse("WorldHistory", Course.Type.History, 2, false);
        Course choir =  Course.addCourse("Choir", Course.Type.Elective, 1, false);

        japanese.addStudent(Rito, 2.2);
        Rito.addCourse(worldHistory, 1.7);
        
        biology.addStudent(Shiroe, 3.4);
        Shiroe.addCourse(biology, 3.6);
        
        physics.addStudent(Chitoge, 4.3);
        Chitoge.addCourse(worldHistory, 3.5);
        japanese.addStudent(Chitoge, 5.0);
        
        japanese.addStudent(Akeno, 3.4);
        choir.addStudent(Akeno, 4.0);
        Akeno.addCourse(worldHistory, 2.2);
        
        worldHistory.addStudent(Chihiro, 1.6);
        japanese.addStudent(Chihiro, 3.4);
        Chihiro.addCourse(biology, 2.5);
        
        worldHistory.addStudent(Kazuto, 4.6);
        Kazuto.addCourse(choir, 5.0);
        Kazuto.addCourse(physics, 4.9);
        
         
        japanese.addTeacher(Yuki);
        biology.addTeacher(Mikdao);
        physics.addTeacher(Kagami);
        worldHistory.addTeacher(Katsuragi);
        choir.addTeacher(Akame);
         
        Course.printNames();
        Person.printNames();
        Student.printNames();
        Teacher.printNames();
        
        Katsuragi.printStudentsNames();
        Akeno.printTeachersNames();
        
        System.out.println("Akeno's GPA = " + Akeno.getGPA());
        Student.printNamesGPAGreaterThan(3.0);
        
        Student highGPA = Student.getHighestGPA();
        System.out.println(highGPA);
        
        Teacher mostElectives = Teacher.mostElectiveCourses();
        System.out.println(mostElectives);
        
        Katsuragi.printStudentsNamesInGrade(10);
        
        Student.printHonorStudents;
        
    }
}
