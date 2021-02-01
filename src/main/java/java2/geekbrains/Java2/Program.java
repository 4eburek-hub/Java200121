package java2.geekbrains.Java2;

import java.util.Random;

public class Program {

    public static void main(String[] args) {
        Random random = new Random();
        Action[] actions = new Action[3];

        int distance = random.nextInt(10);
        int height = random.nextInt(10);
        actions[0] = new Human("Иван ", distance, height);

        distance = random.nextInt(10);
        height = random.nextInt(10);
        actions[1] = new Robot("Бэндер ", distance, height);

        distance = random.nextInt(10);
        height = random.nextInt(10);
        actions[2] = new Cat("Барсик ", distance, height);


        Barrier[] barriers = new Barrier[6];

        boolean isRoad;
        for (int i = 0; i < barriers.length; i++) {
            distance = random.nextInt(10);
            isRoad = random.nextBoolean();
            if (isRoad) {
                barriers[i] = new Road(" Беговая дорожка " + i, distance);
            } else {
                barriers[i] = new Well(" Стена " + i, distance);
            }
        }
        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {

                if (Human.class == actions[i].getClass()) {
                    result = barriers[j].moving((Human) actions[i]);
                }
                if (Robot.class == actions[i].getClass()) {
                    result = barriers[j].moving((Robot) actions[i]);
                }

                if (Cat.class == actions[i].getClass()) {
                    result = barriers[j].moving((Cat) actions[i]);
                }

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Успешно!!");
            } else {
                System.out.println("Безуспешно!!");
            }
        }
    }

}

