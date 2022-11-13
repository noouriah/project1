public class Employee extends Person {

    public Employee(String name, String gender, String idNumber, int age) {
            super(name, gender, idNumber, age);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public String getGander() {
            return gender;
        }

        public void setGander(String name) {
            this.gender = gender;
        }

        public String getidNumber() {
            return idNumber;
        }
        public void setidnumber(String name) {
            this.idNumber = idNumber;
        }




    }
