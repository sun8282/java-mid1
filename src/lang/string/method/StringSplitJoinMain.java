package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana, Orange";

        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }

        String joinStr = "";
        for (String s : splitStr) {
            joinStr += s + "-";
        }

        System.out.println("joinStr = " + joinStr);

        String joniedStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열 = " + joniedStr);

        String result = String.join("-", splitStr);
        System.out.println("result = " + result);
    }
}
