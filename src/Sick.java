public class Sick extends Person implements SomeSay {

    @Override
    public void say() {
        System.out.println("Меня зовут  " + getName());
    }
    public void setNameComplaints() {
        if (getComplaints() == 1) {
            System.out.println("У меня болит колено ");
        }
        if (getComplaints() == 2) {
            System.out.println("У меня болит горло ");
        }
        if (getComplaints() == 3) {
            System.out.println("У меня болит зуб ");
        }
    }public void setNameComplaints(int c) {
            if (getComplaints() == 1) {
                System.out.println("Я вас поняла проходите в 1 первый кабинет к хирургу");
            }
            if (getComplaints() == 2) {
                System.out.println("Я вас поняла проходите в 2 второй кабинет к терапевту ");
            }
            if (getComplaints() == 3) {
                System.out.println("Я вас поняла проходите в 3 кабинет к стоматологу ");
            }
    }
}



