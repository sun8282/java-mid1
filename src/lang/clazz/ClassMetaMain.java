package lang.clazz;

import java.lang.reflect.Field;

public class ClassMetaMain {

    public static void main(String[] args) throws Exception {
        //Class 조회
        Class clazz = String.class; // 1. 클래스에서 조회
        Class clazz1 = new String().getClass(); // 2. 인스턴스에서 조회
        Class clazz2 = Class.forName("java.lang.String"); // 3. 문자열로 조회

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
