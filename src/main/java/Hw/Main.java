package Hw;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание № 9");
        System.out.println("Задание 1");
        int[] payOfMonday = {25000, 30000, 28000, 35000, 33000};
        int sumOfMonth = 0;
        for (int i = 0; i < payOfMonday.length; i++) {
            sumOfMonth = sumOfMonth + payOfMonday[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumOfMonth + "  рублей");
        System.out.println("Задание 2");
        int[] payOfDay = {35000, 30000, 29000, 31000, 33000};
        int minOfPay = payOfDay[0];
        int maxOfPay = payOfDay[0];
        for (int i = 1; i < 5; i++) {
            final int current=payOfDay[i] ;
            if (current > maxOfPay) {
                maxOfPay = current;
            }
            if (current < minOfPay) {
                minOfPay = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minOfPay + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + maxOfPay + " рублей");
        //Задание 3 begin
        System.out.println("Задание 3 ");
        int[] payOfWeek = new int[5];
        sumOfMonth = 0;
        System.out.print("int[] payOfWeek ={");
        for (int j=0; j < payOfWeek.length; j++) {
            payOfWeek[j]=(int)(Math.random()*10000);
            if (j == payOfWeek.length - 1) {
                System.out.print(payOfWeek[j]);
            } else {
                System.out.print(payOfWeek[j] + ",");
            }
            sumOfMonth += payOfWeek[j];
        }
        String endOfWord="ей";
        System.out.println("}");
        int wholePart=sumOfMonth / payOfWeek.length;
        int fracPart=(sumOfMonth -wholePart*payOfWeek.length)*10/payOfWeek.length;
        if (1<(wholePart%10) && (wholePart%10) <=4 ) endOfWord="я";
        if (wholePart%10 ==1 ) endOfWord="ь";
        System.out.println("Cредняя сумма трат за месяц составила " + wholePart +
                " рубл" + endOfWord +" " +  fracPart + " коп");
        //Задание 3  end
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}