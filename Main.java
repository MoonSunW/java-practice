// Frist week task
public class Main {
    public static void main(String[] args) {
        // runAssignment1();  // 과제 1: 변수 연습
        // runAssignment2();  // 과제 2: 계산기
        runAssignment3();     // 과제 3: 학생 클래스 (현재 이것만 실행됨)

    }


    // 과제 1 실행 로직
    public static void runAssignment1() {
        System.out.println("=== 과제 1: 변수 연습 ===");
        int num1 = 4;
        int num2 = 3;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
    }

    // 과제 2 실행 로직
    public static void runAssignment2() {
        System.out.println("\n=== 과제 2: 계산기 클래스 ===");
        Calculator calc = new Calculator();
        System.out.println("덧셈: " + calc.add(10, 5));
        System.out.println("뺄셈: " + calc.subtract(10, 5));
        System.out.println("곱셈: " + calc.multiply(10, 5));
        System.out.println("나눗셈: " + calc.divide(10, 5));
    }

    // 과제 3 실행 로직
    public static void runAssignment3() {
        System.out.println("\n=== 과제 3: Student 클래스 ===");
        Student student1 = new Student("홍길동", "2024001", 1);
        student1.displayInfo();
    }
}



// 클래스 정의 (데이터와 기능 정의)


// 과제 2용 클래스
class Calculator {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public int divide(int a, int b) { return a / b; }
}

// 과제 3용 클래스
class Student {
    private String name;
    private String studentId;
    private int grade;

    public Student(String name, String studentId, int grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("이름: " + name);
        System.out.println("학번: " + studentId);
        System.out.println("학년: " + grade);
    }


}