/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;
public class Teacher extends Person{
    private double meanLevel;
    private Course courses[] = new Course[Course.numPeriods];
    
    public static Teacher addTeacher(String _name,
    Gender _gender, int _weight,double _meanLevel)
    {
        Teacher temp = new Teacher(_name,_gender,_weight,
        _meanLevel);
        addPerson(temp);
        return(temp);
    }    
    Teacher (String _name,Gender _gender,int _weight,
    double _meanLevel)
    {
        super(_name,_gender,_weight);
        meanLevel = _meanLevel;
    }

    public boolean addCourse(Course _course)
    {
        if (!setCourseOK(_course))
            return(false);
        if (!_course.setTeacherOK(this))
            return(false);
        _course.setTeacherDoIt(this);
        setCourseDoIt(_course);
        return(true);
    } 
    public void setCourseDoIt(Course _course)
    {
        courses[_course.getPeriod()] = _course;
    }
    
    public boolean setCourseOK(Course _course)
    {
        if (_course == null)
            return(false);        
        if (courses[_course.getPeriod()] != null)
            return(false);
        return(true);
    }
    public void setMeanLevel(int _meanLevel)
    {
        meanLevel = _meanLevel;
    }
    public double getMeanLevel()
    {
        return(meanLevel);
    }  
    
    public static Teacher getMostElectiveCourses()
    {
        Teacher teacher = null;
        for (Person temp : people)
        {
            if (temp instanceof Teacher)
            {
//                int numElectiveCourses = 0;
//                for(int index = 0; index < Course.numPeriods; index++)
//                {
//                    if(courses[index].getType() == Course.Type.Elective)
//                    {
//                        numElectiveCourses++;
//                    }
//                }
//                if(teacher == null || )
//                    teacher = (Teacher)temp;
            }
        } 
        return(teacher);
    }       
    public static void printNames()
    {
        System.out.println(
        "===printNamesOfTeachers=== ");
        for (Person temp : people)
        {
            if (temp instanceof Teacher)
                System.out.println(temp.getName());
        }
    }   
    
    
    public void printStudentsNames()
    {
       System.out.println("===============");
       System.out.println(getName() + " teaches");
        for (Course temp : courses)
        {
            if (temp != null)
            {
                for (int index = 0;index < temp.getNumStudents();index++)
                {
                    System.out.println(temp.getStudent(index).getName());
                }
            }
        }
    }
}
