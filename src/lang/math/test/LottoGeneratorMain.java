package lang.math.test;

public class LottoGeneratorMain {

    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        int[] lottoNubmers = generator.generate();

        System.out.println("로또 번호: ");
        for (int lottoNubmer : lottoNubmers) {
            System.out.println(lottoNubmer + " ");
        }
    }
}
