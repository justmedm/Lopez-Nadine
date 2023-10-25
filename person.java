public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String birthday;
    private String address;

    
    public Person(String firstName, String middleName, String lastName, int age, String birthday, String address) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.birthday = birthday;
        this.address = address;
    }

    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "\nfirstName=" + firstName + '\'' +
                " \nmiddleName=" + middleName + '\'' +
                " \nlastName=" + lastName + '\'' +
                " \nage=" + age +
                " \nbirthday=" + birthday + '\'' +
                " \naddress=" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Example usage of the Person class
        Person person = new Person("Nadine", "R", "Lopez", 30, "2003-15-12", "123 Main Street");
        System.out.println(person.toString());
    }
}
