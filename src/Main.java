public class Main {
    public static void main(String[] args) {

        //    задача 1
        {
            {


                int start = 1;
                while (start < 11) {
                    System.out.print(start + " ");
                    start++;

                }
                {
                    System.out.println(" ");
                }
                {


                    for (int x = 10; x > 0; x--) {

                        System.out.print(x + " ");
                    }
                }


            }
        }

        //   задача 2
        {
            System.out.println(" ");

            for (int z = 1; z < 31; z = z + 7) {
                System.out.println("Сегодня пятница, " + z + "-е число. Необходимо подготовить отчёт");
            }
        }

        //    задача 3

        {
            int end = 2122;
            int beginning = 1822;

            for ( int year = 0; year  < end; year = year + 79 )
            {
                if (year > beginning)  System.out.println(year);
            }
        }



    }
}




