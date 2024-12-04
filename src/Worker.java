public class Worker {
    String fullName;
    String job;
    String email;
    long phone;
    Double salary;
    int age;
    public Worker(String fullName, String job, String email, long phone, Double salary, int age) {
        this.fullName = fullName;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
        public static void main(String[] args) {
        Worker worker1 = new Worker("Иванов Иван Иванович", "Кассир", "kassir1@mail.ru", 89553554433L, 35000.00, 27);
        System.out.println("ФИО: " + worker1.fullName +"\nДолжность: " + worker1.job + "\nEmail: " + worker1.email + "\nТелефон:: " + worker1.phone +"\nЗарплата: " + worker1.salary + "\nВозраст: " + worker1.age);
        Worker[] workerArray = new Worker[5];
        workerArray[0] = new Worker("Иванов Иван Иванович", "Кассир", "kassir1@mail.ru", 89553554433L, 35000.00, 27);
        workerArray[1] = new Worker("Воронюк Мария Ивановна", "Цветовод", "cvetovod1@mail.ru", 89327772343L, 35000.00, 30);
        workerArray[2] = new Worker("Шелби Томас Сергеевич", "Дворник", "dvornik1@mail.ru", 89631239867L, 35000.00, 21);
        workerArray[3] = new Worker("Богатырская Елена Васильевна", "Кладовщик", "Klad1@mail.ru", 89663663366L, 45000.00, 45);
        workerArray[4] = new Worker("Дубровин Александр Евгеньевич", "Администратор", "Admin1@mail.ru", 89998887766L, 135000.00, 38);
    }
}
class Park {
    class InnerClass {
        String attraction;
        String time;
        int cost;
    }
}