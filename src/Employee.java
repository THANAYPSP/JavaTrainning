public class Employee {
        private int id;
        private String fname;
        private String lname;
        //    Position pos;
        private String pos;


        //Constructor
        public Employee(){
                this("Thana","Yok");

        }

        public Employee(String fname , String lname){
                this.fname= fname;
                this.lname=lname;
        }

        public String getFullName() {
            return fname + " : " + lname;
        }


        String getPositionName() {
            return "";
        }

}
