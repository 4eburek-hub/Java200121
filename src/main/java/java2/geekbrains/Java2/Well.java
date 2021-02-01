package java2.geekbrains.Java2;

public class Well extends Barrier {
    private int heigth;

    public Well(String name, int heigth) {
        super(name);

        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    protected boolean moving(Human human) {
        System.out.println("Стена " + super.getName() + " Высота: " + this.heigth);

        human.jump();

        if (getHeigth() <= human.getJumpHeight()) {
            System.out.println("Человек прыгает удачно");

            return true;
        } else {
            System.out.println("Человек прыгает неудачно");
            return false;
        }
    }

    @Override
    protected boolean moving(Robot robot) {

        System.out.println("Стена " + super.getName() + " Высота: " + this.heigth);

        robot.jump();

        if (getHeigth() <= robot.getJumpHeight()) {
            System.out.println("Робот прыгает удачно");

            return true;
        } else {
            System.out.println("Робот прыгает неудачно");
            return false;
        }
    }

    @Override
    protected boolean moving(Cat cat) {
        System.out.println("Стена " + super.getName() + " Высота: " + this.heigth);

        cat.jump();

        if (getHeigth() <= cat.getJumpHeight()) {
            System.out.println("Кот прыгает удачно");

            return true;
        } else {
            System.out.println("Кот прыгает неудачно");
            return false;
        }
    }
}

