import java.util.Scanner;

/*
 * 자바 익히기 위한 간단한 콘솔게임
 * 작성일 : 2019/06/06
 */
public class MainClass {

    public static void main(String[] args) {

        System.out.println("\n+++ 게임 시작 +++ \n");

        System.out.println("캐릭터를 선택하세요");
        System.out.println("1. 마법사 2. 궁수 3. 힐러 4. 전사");

        Scanner in = new Scanner(System.in);
        String msg;
        int job = 0;

        String a;

        for (;;) {
            System.out.print("입력 : ");
            msg = in.nextLine();
            job = Integer.parseInt(msg);

            if (job == 1) {
                a = "마법사";
                break;
            } else if (job == 2) {
                a = "궁수";
                break;
            } else if (job == 3) {
                a = "힐러";
                break;
            } else if (job == 4) {
                a = "전사";
                break;
            } else {
                System.out.println("다시 입력해주세요");
            }
        }

        System.out.println("선택된 직업 : " + a + "\n");

        System.out.print("이름 입력 : ");
        msg = in.nextLine();
        System.out.println(msg + "님 환영합니다");

        int hp = 100;
        int mp = 100;
        int lv = 1;

        System.out.print("\n튜토리얼을 진행하시겠습니까? (y/n) \n");
        msg = in.nextLine();

        if (msg.equals("y") || msg.equals("Y")) {
            int dal = 10;

            for (;;) {
                if (dal == 0) {
                    System.out.println("튜토리얼 종료");
                    break;
                }

                System.out.println("달팽이 " + dal + "마리 잡아오기");
                System.out.println("1. 공격 2. 점프 3. 종료");
                msg = in.nextLine();

                if (msg.equals("1")) {
                    System.out.println("달팽이 1마리 잡음 \n");
                    dal--;
                } else if (msg.equals("2")) {
                    System.out.println("껍질을 떨어뜨렸습니다.");
                } else if (msg.equals("3")) {
                    System.out.println("종료");
                    break;
                } else {
                    System.out.println("야이 삐리리야!");
                }
            }
        } else {
            System.out.println("스킵");
        }
    }
}
