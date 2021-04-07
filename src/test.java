public class test {
    private int age = 22;
    private int year_of_passing = 2020;
    private String college_name = "mount zion college of engineering and technology";
    private String department = "Electronics and communication engineering";
    private int year_of_birth = 1999;
    private int month_of_birth = 3;
    private int date_of_birth = 9;

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setYear_of_passing(int year){
        year_of_passing = year;
    }
    public int getYear_of_passing(){
        return year_of_passing;
    }
    public void setCollege_name(String college_name){
        this.college_name = college_name;
    }
    public String getCollege_name(){
        return college_name;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }
    public void setYear_of_birth(int year_of_birth){
        this.year_of_birth = year_of_birth;
    }
    public int getYear_of_birth(){
        return year_of_birth;
    }
    public void setMonth_of_birth(int month_of_birth){
        this.month_of_birth = month_of_birth;
    }
    public int getMonth_of_birth(){
        return month_of_birth;
    }
    public void setDate_of_birth(int date_of_birth){
        this.date_of_birth = date_of_birth;
    }
    public int getDate_of_birth(){
        return date_of_birth;
    }

    public String dob(){
        return Integer.toString(date_of_birth) +"-"+ month_of_birth +"-" + year_of_birth;
    }
    public static void main(String[] args) {
        test object = new test();
        System.out.println(object.age);
    }
}
