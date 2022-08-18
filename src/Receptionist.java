public class Receptionist extends Person implements SomeSay {
    @Override
    public void say() {
        System.out.println("Здравствуйте меня зовут " + getName() + " я Администратор  клиники.Какие у вас жалобы на здоровье?");
    }
}



