package ma.geo.local.dtos;

import ma.geo.local.models.StudentIdDtos;

import java.util.List;

public class StudentDtos {

    private StudentIdDtos studentId;
    private String name;
    private List<CourseDtos> courses;
    private AdresseDtos adresse;

    public StudentIdDtos getStudentId() {
        return studentId;
    }

    public void setStudentId(StudentIdDtos studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CourseDtos> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseDtos> courses) {
        this.courses = courses;
    }

    public AdresseDtos getAdresse() {
        return adresse;
    }

    public void setAdresse(AdresseDtos adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                ", adresse=" + adresse +
                '}';
    }
}
