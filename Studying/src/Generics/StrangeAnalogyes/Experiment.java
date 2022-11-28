package Generics.StrangeAnalogyes;

public class Experiment {
    public static void main(String[] args) {
        Body body = new Body();
        SmallHead smallHead = new SmallHead();
        MediumHead mediumHead = new MediumHead();
        BigHead bigHead = new BigHead();
        Robot [] arr = new Robot[3];
        Robot <SmallHead> shRobot = new Robot<>(smallHead, body);
        Robot <MediumHead> mhRobot = new Robot<>(mediumHead, body);
        Robot <BigHead> bhRobot = new Robot<>(bigHead, body);
        arr[0] = shRobot;
        arr[1] = mhRobot;
        arr[2] = bhRobot;
        for (Robot robot:arr){
              /* robot.head.burn(); тут то и скрывается вся суть дженериков: я могу создать "роботов" с разными типами
              "голов" (да, тупая аналогия), и пользоваться эксклюзивными методами этих голов, но как только дело доходит
              до чего то обобщенного типо массива объектов, то тут плюшками пользоваться нельзя по очевидным причинам.
              В этом и отличие дженериков от простого использования родительского класса: когда я обращаюсь к ссылке
              робота с маленькой головой, то использую виртуальную эксклюзивную виртуальную версию класса для роботов
              с маленькой головой, но если насобирать рандомных роботов в массив, то тут уже плюшек от наследников
              класса Head не будет.*/
        }
    }
}
