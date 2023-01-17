public class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
        super.Do(name, age);
    }

    @Override
    public String toString(){
        Do(getName(), getAge());
        return "Student okuit Name " + getName() + " Age " + getAge();
    }
}
