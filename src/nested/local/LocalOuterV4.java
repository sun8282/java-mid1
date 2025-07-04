package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {

    private int outInstanceVar = 3;

    public Printer process(final int paramVar) {

        final int localVar = 1;

        class LocalPrinter implements Printer{
            int vlaue = 0;

            @Override
            public void print() {
                System.out.println("vlaue = " + vlaue);
                System.out.println("paramVar = " + paramVar);
                System.out.println("localVar = " + localVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();

        // 만약 localVar의 값을 변경한다면? 다시 캡처해야 하나??
        // localVar = 10; 컴파일 오류
        // paramVar = 20; 컴파일 오류
        //printer.print();
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2);
        printer.print();

        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
