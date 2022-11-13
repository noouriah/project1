ئpublic class Person {
    protected String name,gender,idNumber;
    protected int age;

    public Person(String name, String gender, String idNumber, int age) {
        this.name = name;
        this.gender = gender;
        this.idNumber = idNumber;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + idNumber + '\'' +
                ", age=" + age +
                '}';
    }
}

