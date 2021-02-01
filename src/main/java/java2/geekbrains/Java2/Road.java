package java2.geekbrains.Java2;

public class Road extends Barrier {

    private int length;

    public Road(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Human human) {
        System.out.println(" Дорога " + super.getName() + " Длина: " + this.length);

        human.run();

        if (getLength() <= human.getRunDistance()) {
            System.out.println("Успех человека");
            return true;
        } else {
            System.out.println("Человек бежит неудачно");
            return false;
        }
    }

    @Override
    protected boolean moving(Robot robot) {
        System.out.println(" Дорога " + super.getName() + " Длина: " + this.length);

        robot.run();

        if (getLength() <= robot.getRunDistance()) {
            System.out.println(" Успех робота");

            return true;
        } else {
            System.out.println(" Робот бежит неудачно");

            return false;
        }
    }

    @Override
    protected boolean moving(Cat cat) {
        System.out.println(" Дорога " + super.getName() + " Длина: " + this.length);

        cat.run();

        if (getLength() <= cat.getRunDistance()) {
            System.out.println("Успех кота");

            return true;
        } else {
            System.out.println("Кот бежит неудачно");

            return false;
        }
    }
}