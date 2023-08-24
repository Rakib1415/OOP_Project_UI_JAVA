
package salarycalculator;

public class Student {
    private String name;
    private String email;
    private String regNo;
    
    public Student(){}
    public Student(String name, String email){
        this.name = name;
        this.email = email;
    }
    public Student(String name, String email, String regNo){
        this.name = name;
        this.email = email;
        this.regNo = regNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getRegNo() {
        return regNo;
    }
    
    
}
