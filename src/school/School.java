package school;
public class School {
    public static void main(String[] args) {
        Student Kazuto =  Student.addStudent("Kazuto",Person.Gender.Male,120,11);
        Student Shiroe =  Student.addStudent("Shiroe",Person.Gender.Male,115,12);
        Student Chitoge =  Student.addStudent("Chitoge",Person.Gender.Female,106,10);
        Student Akeno =  Student.addStudent("Akeno",Person.Gender.Female,113,12);        
        Student Chihiro =  Student.addStudent("Chihiro",Person.Gender.Female,98,10);        
        Student Ren =  Student.addStudent("Ren",Person.Gender.Male,138,11);        
                
        Teacher Kagami = Teacher.addTeacher("Kagami", Person.Gender.Male, 110,0.7);
        Teacher Mikdao = Teacher.addTeacher("Mikdao", Person.Gender.Female, 98,3.2);
        Teacher Katsuragi = Teacher.addTeacher("Katsuragi", Person.Gender.Male, 112,5.2);
        Teacher Akame = Teacher.addTeacher("Akame", Person.Gender.Female, 92,9.2);
        Teacher Yuki = Teacher.addTeacher("Yuki", Person.Gender.Female, 100,1.2);
        
        Course japanese =  Course.addCourse("Geometry", Course.Type.Language, 1);
        Course physics =  Course.addCourse("Photography", Course.Type.Math, 3);       
        Course biology =  Course.addCourse("Biology", Course.Type.Science, 2);       
        Course worldHistory =  Course.addCourse("WorldHistory", Course.Type.History, 2);       

        japanese.addStudent(Ren);
        biology.addStudent(Shiroe);
        physics.addStudent(Chitoge);
        worldHistory.addStudent(Chihiro);
        worldHistory.addStudent(Kazuto);
        worldHistory.addStudent(Akeno);
         
        japanese.addTeacher(Yuki);
        biology.addTeacher(Mikdao);
        physics.addTeacher(Kagami);
        worldHistory.addTeacher(Katsuragi);
        
        
        
        Course.printNames();
        Person.printNames();
        Student.printNames();
        Teacher.printNames();
        
        Katsuragi.printStudentsNames();
    }
}
