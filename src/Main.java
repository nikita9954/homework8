import java.util.Random;

/*Создать программу для имитации работы клиники.

        Пусть в клинике будет три врача: хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но каждый врач лечит по-своему.

        Так же предусмотреть класс «Пациент» с полями: имя, возраст, врач, план лечения. Добавить метод, который будет назначать врача пациенту согласно плану лечения. Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить. Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить. Если план лечения имеет любой другой код – назначить терапевта и выполнить метод лечить.

        В Main Создать объект класса «Пациент» и добавить пациенту имя, возраст и план лечения. Вызвать метод который назначает врача пациенту согласно плану лечения.

        Дополнительные классы/методы/поля/логику добавлять на своё усмотрение.*/
public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        Receptionist receptionist=new Receptionist();
        Person person=new Person();
        Dentist dentist=new Dentist();
        Physician physician=new Physician();
        Surgeon surgeon=new Surgeon();
        Sick sick=new Sick();
        sick.setName("Nikita");
        receptionist.setName("Elena");
        receptionist.say();
        sick.say();
        sick.setComplaints(random.nextInt(1,4));
        person.getComplaints();
        sick.setNameComplaints();
        sick.setNameComplaints(2);
        dentist.cabinet();
        physician.cabinet();
        surgeon.cabinet();
    }
}
