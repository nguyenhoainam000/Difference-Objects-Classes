
public class Main {
    public static void main(String[] args) {
        // Creating objects
        Subject math = new Subject("Maths", "Nathan", 4);
        Subject chemical = new Subject("Chemical", "Peter", 3);

        // Using objects
        math.print();
        chemical.print();

        // Accessing and modifying object fields
        math.setCredits(5);
        math.setProfessor("Wilson");
        System.out.println("Updated for Math: Credit:  " + math.getCredits()+" and Professor:  " + math.getProfessor());
    }
}
