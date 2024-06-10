public class Main {
    public static void main(String[] args) {

        Post post = new Post();
        post.birthday = new FormDate();

        post.birthday.day = 13;
        post.birthday.month = "октября";
        post.birthday.year = 2002;

        post.name = "Иван";
        post.passport = "5555 № 667788";
        post.patronymic = "Иванович";
        post.phone = "+7(444-55-33)";
        post.surname = "Иванов";
        post.subscription = true;
    }

}