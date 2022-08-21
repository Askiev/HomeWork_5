public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        int currentNum = 0;

        while (currentNum < 10) {
            System.out.print(++ currentNum + " ");
        }

        System.out.println();

        for (;currentNum > 0; currentNum --) {
            System.out.print(currentNum + " ");
        }



    }

    private static void task2() {
        int fridayFirst = 7;
        int daysPerWeek = 7;
        int daysPerMonth = 31;
        for (int count = 1; count <= daysPerMonth; count++) {
            if (count == fridayFirst) {
                System.out.println("Сегодня пятница," + count + "-е число. Необходимо подготовить отчет.");
                fridayFirst = fridayFirst + daysPerWeek;
            }
        }
    }

    private static void task3() {
        int yearInitial = 1822;
        int yearFinal = 2122;
        int yearApproach = 0;
        while (yearApproach < yearFinal) {
            if (yearApproach >= yearInitial) {
                System.out.println(yearApproach);
            }
            yearApproach = yearApproach + 79;
        }
    }
}
