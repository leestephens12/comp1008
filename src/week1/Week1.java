package week1;

public class Week1 {

    public static void main(String[] args) {
        divLoop();
    }

    static void downLoop(){
        for(int i = 100; i >= 0; i -= 5) {
            System.out.println(i);
        }
    }

    static void upLoop(){
        for(int i = 0; i <= 100; i += 10) {
            System.out.println(i);
        }
    }

    static void divLoop() {
        for (int i = 0; i <= 100; i += 10) {

            if(i == 20 || i == 40 || i == 60 || i == 80 || i == 100) {
                System.out.println(i + " java");
            }

            else {
                System.out.println(i);
            }
        }
    }
}
