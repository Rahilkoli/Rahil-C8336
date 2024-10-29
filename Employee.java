public class Employee {


        private String name;
        private String empID;
        private String empDepartment;


        public Employee() {}


        public Employee(String name, String empID, String empDepartment) {
            this.name = name;
            this.empID = empID;
            this.empDepartment = empDepartment;
        }



        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


        public String getEmpID() {
            return empID;
        }

        public void setEmpID(String empID) {
            this.empID = empID;
        }


        public String getEmpDepartment() {
            return empDepartment;
        }

        public void setEmpDepartment(String empDepartment) {
            this.empDepartment = empDepartment;
        }


        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Employee ID: " + empID);
            System.out.println("Department: " + empDepartment);
        }
    }


