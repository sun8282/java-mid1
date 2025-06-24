package enumeration.test;

public class AuthGradeMain1 {

    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            System.out.println("등급 =" + value.name() + ", 인증 level=" + value.getLevel() + ", 설명 =" +value.getDescription());
        }
    }
}
