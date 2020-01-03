import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        students.add(new Student("강지훈", "01"));
        students.add(new Student("나영석", "02"));
        students.add(new Student("다사다", "03"));
        students.add(new Student("라면먹", "04"));


        String a = "";

        while (true) {
            boolean flag = false;
            System.out.println("검색하시겠습니까?");
            a = scanner.next();
            if (a.equals("n")) {
                System.out.println("종료합니다");
                return;
            } else if (a.equals("y")) {
                System.out.println("검색할 이름을 입력해주세요");
                a = scanner.next();
                for (Student student : students) {
                    if (student.getName().equals(a)) {
                        flag = true;
                        System.out.println(student.getName() + " 을 찾았습니다.");
                        System.out.println("학번 : " + student.getNo());
                        break;
                    }


                }
                if (!flag) {
                    System.out.println("없습니다.");
                }


            } else {
                System.out.println("y 또는 n만 입력해주세요");
            }
        }

    }
}
