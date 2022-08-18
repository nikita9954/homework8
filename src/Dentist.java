public class Dentist extends Sick{
    public void cabinet(){
        if (getComplaints()==3) {
            System.out.println("Здравствуйте, я стоматолог я буду сейчас вас лечить");}
        else {
            System.out.println("Здравствуйте, вам в другой кабинет");
        }
    }
}
