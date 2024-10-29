package Question3;

public class VaccinationSuccessfull extends Vaccine{
    public VaccinationSuccessfull(int age, String nationality) {
        super(age, nationality);
    }



    public void boosterDose() {
        System.out.println("Booster dose taken successfully.");
    }
}



