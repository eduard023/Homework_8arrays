        public class Main {
            public static void main(String[] args) {

                //Задание 1
                int[] number = new int[3];
                number[0] = 1;
                number[1] = 2;
                number[2] = 3;
                double[] num1 = {1.57, 7.654, 9.986};
                int[] num2 = {45, 48, 53, 60};
                //Задание 2
                System.out.println("Задание 2");
                for (int i = 0; i < number.length; i++) {
                    System.out.print(number[i] + ", ");
                }
                System.out.println();
                for (int i = 0; i < num1.length; i++) {
                    System.out.print(num1[i] + ", ");
                }
                System.out.println();
                for (int i = 0; i < num2.length; i++) {
                    System.out.print(num2[i] + ", ");
                }
                System.out.println();
                //Задание 3
                System.out.println("Задание 3");
                for (int i = number.length - 1; i >= 0; i--) {
                    System.out.print(number[i] + ", ");
                }
                System.out.println();
                for (int i = num1.length - 1; i >= 0; i--) {
                    System.out.print(num1[i] + ", ");
                }
                System.out.println();
                for (int i = num2.length - 1; i >= 0; i--) {
                    System.out.print(num2[i] + ", ");
                }
                System.out.println();


                //Задание 4
                System.out.println("Задание 4.");
                for (int i = 0; i < number.length; i++) {
                    number[0] += 1;
                    number[2] += 1;
                    System.out.print(number[i] + ", ");
                }


            }
        }


