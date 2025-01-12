public class Main {
    public static void main(String[] args) {
        String nameJohn = "";
        String[] names = {"John", "Sarah"};
        int[] ages = {13, 30};
        for (int i = 0; i < names.length; i++) {
            System.out.printf("Name - %s \nAge - %s\n", names[i], ages[i]);
        }
        person sarah = new person();
        sarah.name = "Sarah";
        System.out.println("sarah.name = " + sarah.name);
        sarah.age = 12;
        System.out.println("sarah.age = " + sarah.age);
    }
}