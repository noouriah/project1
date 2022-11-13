public class Patient extends Person implements Interface {
    private String idType,phoneNumber;

    boolean HasFamily;

    public Patient() {
        super(name,
                gender,
                idNumber,
                age);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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




    public String getidNumber() {
        return idNumber;
    }
    public void setidnumber(String name) {
        this.idNumber = idNumber;
    }
    public String getIdType() {
        return idType;}

    public void setIdType(String name) {
        this.idType = idType;
    }
    public int getAge() {
        return age;}
    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasFamily() {
        return HasFamily;}
    public void setHasFamily(int age) {
        this.HasFamily = HasFamily;
    }

    @Override
    public Object search() {
        return null;
    }
}
