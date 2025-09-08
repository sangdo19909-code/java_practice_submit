package comm.greedyy;

public class Calculator2 {
    // 함수 호출 확인용 메소드
    public void checkMathod() {
        System.out.println("메소드 호출 확인");
    }
    // 1부터 10까지 수를 더하여 값을 리턴함
    public int sum1to10() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }
    // 두 수를 입력받아 큰 수를 출력함
    public void checkMaxNumber(int a, int b) {
        int num = Math.max(a, b);
        System.out.println(num);
    }
    // 두 수를 입력받아 합을 리턴함
    public int sumTwoNumber(int a, int b) {
        int sum = a + b;
        return sum;
    }
    // 두 수를 입력받아 차를 리턴함
    public int minusTwoNumber(int a, int b) {
        int sub = a - b;
        return sub;
    }

}
