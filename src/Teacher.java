public class Teacher extends Person{
    public Teacher(String name, int age) {
        super(name, age);
        super.Do(name, age);
    }
    @Override
    public String toString(){
        Do(getName(),getAge());
        return "Teacher okutat Name " + getName() + " Age " + getAge();
    }
}
