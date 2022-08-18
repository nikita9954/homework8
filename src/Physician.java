public class Physician extends Sick{
    public void cabinet() {
        if (getComplaints() == 2) {
            System.out.println("Здравствуйте, я терапевт я буду сейчас вас лечить");}
        else   {
            System.out.println("Здравствуйте, вам в другой кабинет");
        }
    }
}
