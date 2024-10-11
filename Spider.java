import java.util.Scanner;

import static java.lang.Math.pow;

public class Spider {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scan scan1 = new Scan();
        scan1.setN(scanner.nextInt());
        scan1.setLeft(scanner.nextInt());
        scan1.setRight(scanner.nextInt());

        int left = scan1.getLeft(), right = scan1.getRight(), reverse, countR = 0, countL = 0;;
        while (true){
            if (left-1 == right){
                reverse = left;
                left = right;
                right = reverse;
            }

            if (left <= scan1.getN() && left > 0){
                left--;
                countL++;
            }
            else if (left == 0){
                countL++;
                System.out.println("Левый закончил быстрее, сделано " + countL + " шагов.");
                break;
            }
            if (left == right+1){
                reverse = left;
                left = right;
                right = reverse;
            }
            if (right < scan1.getN() && right >= 0){
                right++;
                countR++;
            }
            else if (right == scan1.getN()){
                countR++;
                System.out.println("Правый закончил быстрее, сделано " + countR + " шагов.");
                break;
            }


        }

    }

}
class Scan{
    private int n, left, right;

    public void setN(int n){
            if (n >= 1 && n <= pow(10,4)) {
                this.n = n;
            }
            else System.out.println("Введите значение n повторно");

    }
    public int getN(){
        return n;
    }
    public void setLeft(int left){
            if (left >= 1 && left <= pow(10,4)) {
                this.left = left;

            }
            else System.out.println("Введите значение left повторно");
    }
    public int getLeft(){
        return left;
    }
    public void setRight(int right){
            if (right >= 1 && right <= pow(10,4) && right!=left) {
                this.right = right;
            }
            else System.out.println("Введите значение right повторно");

    }
    public int getRight(){
        return right;
    }

}
