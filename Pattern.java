public class Pattern {


        public static void main(String[] args) {

            int star = 5;

            //increasing triangle right
            for (int i = 1; i <= star; i++) {

                for (int j = 1; j <= i; j++) {

                    System.out.print("*");
                }
                System.out.println();
            }
            //decreasing triangle right
            for (int i = 1; i <= star; i++) {

                for (int j = i; j <= star; j++) {

                    System.out.print("*");
                }
                System.out.println();
            }

            //decreasing triangle right
            for (int i = 1; i <= star; i++) {

                for (int j = i; j <= star; j++) {

                    System.out.print(" ");
                }

                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            //pyramid

            for (int i = 1; i <= star; i++) {

                for (int j = i; j <= star; j++) {

                    System.out.print(" ");
                }

                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                for (int l= 2; l <= i; l++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            //increasing triangle right  with number
            for (int i = 1; i <= star; i++) {

                for (int j = 1; j <= i; j++) {

                    System.out.print(i+"");
                }
                System.out.println();
            }


        }}


