package angelwing;

public class example {
    String name = "Stefan";
    String lastName = "Manoil";
    byte age = 18;
    String schoolName = "USM";
    public short height = 180;
    float weight = 74.4f;

    public example(){
        //No contruct
    }

    public example(String name, String lastName, byte age, String schoolName, short height, float weight) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.schoolName = schoolName;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "example{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", schoolName='" + schoolName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public short getHeight() {
        return height;
    }

    public void setHeight(short height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
