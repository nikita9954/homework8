public class Surgeon extends Sick{
    public void cabinet() {
        if (getComplaints() == 1) {
            System.out.println("Здравствуйте, я хирург я буду сейчас вас лечить");}
            else {
                System.out.println("Здравствуйте, вам в другой кабинет");
            }
        }
}

