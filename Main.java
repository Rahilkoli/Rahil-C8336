package Question3;

public class Main {
    public static void main(String[] args) {

        VaccinationSuccessfull user = new VaccinationSuccessfull(22, "Indian");


        user.firstDose();


        boolean firstDoseCompleted = true;

        user.secondDose(firstDoseCompleted);


        user.boosterDose();
    }
}

