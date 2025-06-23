package enumeration.ref3;


public class EnumRefMain3_2 {

    public static void main(String[] args) {
        int price = 10000;

        printDiscount(Grade.BASIC);

        Grade.BASIC.discount(price);
        Grade.GOLD.discount(price);
        Grade.DIAMOND.discount(price);
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + "grade = " + grade.discount(price));
    }
}