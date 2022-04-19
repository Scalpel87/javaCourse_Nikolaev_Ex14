public class Road implements Runnable{
     int person = 0;
     int cars = 0;

    @Override
    public void run() {

            do {
                try {
                    check();
                    Thread.currentThread().sleep(2000);
                    person += 1 + (int) (Math.random() * 8);//Пусть каждый раз приходит случайное число пешеходов от 1 до 8
                    check();
                    Thread.currentThread().sleep(3000);
                    cars += 1 + (int) (Math.random() * 6);//Пусть каждый раз приезжает случайное число машин от 1 до 8
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (true);

    }
    public void check(){
        if (person > 4) {
            System.out.println(Thread.currentThread().getName() + ": Светофор для пешеходов включен");
            person = 0;
        }
        if (cars > 3){
            System.out.println(Thread.currentThread().getName() + ": Светофор для машин включен");
            cars = 0;
        }
    }
}
