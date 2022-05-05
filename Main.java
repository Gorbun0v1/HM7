public class Main {
    public static void main(String[] args) {
        int sum = 0;

        int[] arr = generateRandomArray();{
            for (int i: arr){
                sum += i;
            }

            System.out.println("Сумма трат за месяц составила " + sum +  " рублей");

            int maxMoney = 1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > maxMoney) {
                    maxMoney = arr[i];
                }
            }
            System.out.println("Максимальная сумма трат за день составила "+ maxMoney +" рублей");

            int minMoney = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < minMoney) {
                    minMoney = arr[i];
                }
            }
            System.out.println("Минимальная сумма трат за день составила "+ minMoney +" рублей");
            
            float days = 30;
            for (int i: arr){
                sum += i;
            }
            System.out.println("Средняя сумма трат за месяц составила " + sum / days + " рублей");
    }

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i>=0; i--){
            System.out.print(reverseFullName[i] );

        }

    }//30 рандом чисел, готовый массив



    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;

        }
        return arr;

    }

}