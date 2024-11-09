public class Main {
    public static void main(String[] args) {

        Sum sum = new Sum();
        System.out.println(sum.calculateSum(10, 5));

        Subtraction sub = new Subtraction();
        System.out.println(sub.calculateSub(10, 5));

        Multiplication multi = new Multiplication();
        System.out.println(multi.calculateMulti(4, 7));

        Division div = new Division();
        System.out.println(div.calculateDiv(10, 2));
    }
}