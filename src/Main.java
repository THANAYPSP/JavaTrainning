public class Main {
    public static void main(String[] args) {
//        String fname = args[0];
//        String lname = args[1];
//        Employee na = new Employee(fname, lname); // Default constructor
        Employee na = new Employee();
        String result = na.getFullName();
        System.out.println(result);
    }

}