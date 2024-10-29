package Question3;

public  abstract class Vaccine {
    int age;
    String nationality;


    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }


    public void firstDose() {
        if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {
            System.out.println("First dose taken successfully. Please pay Rs. 250.");
        } else {
            System.out.println("You are not eligible for the first dose.");
        }
    }


    public void secondDose(boolean firstDoseCompleted) {
        if (firstDoseCompleted) {
            System.out.println("Second dose taken successfully.");
        } else {
            System.out.println("You need to take the first dose before the second dose.");
        }
    }


    public abstract void boosterDose();
}

