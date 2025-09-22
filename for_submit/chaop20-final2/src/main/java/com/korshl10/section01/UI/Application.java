package com.korshl10.section01.UI;

import com.korshl10.section01.domain.User;
import com.korshl10.section01.persistence.FileUserStorage;
import com.korshl10.section01.persistence.UserRepository;
import com.korshl10.section01.userService.UserService;
import java.util.Scanner;

public class Application {
    private final Scanner scanner;
    private final UserService userService;
    private boolean user;

    private Application() {
        UserRepository userRepository = new UserRepository(new FileUserStorage());
        this.userService = new UserService(userRepository);
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("\n======회원 관리 프로그램======");
            System.out.println("1. 모든 회원 조회");
            System.out.println("2. 회원 찾기 ");
            System.out.println("3. 회원 가입 ");
            System.out.println("4. 회원 수정 ");
            System.out.println("5. 회원 삭제 ");
            System.out.println("9. 프로그램 종료 ");
            System.out.println("메뉴 선택: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    case 1 -> showAllUsers();
                    case 2 -> findUserByNo();
                    case 3 -> registerUser();
                    case 4 -> modifyUser();
                    case 5 -> removeUser();
                    case 9 -> {
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    }
                    default -> System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                }
            } catch (Exception e) {
                System.out.println("오류" + e.getMessage());
            }
        }
    }

    private void showAllUsers() {
        userService.findAllUsers().forEach(System.out::println);
    }

    public void findUserByNo() {
        System.out.println("조회할 회원 번호 입력: ");
        int no = scanner.nextInt();
        scanner.nextLine();

        User user = userService.findUserByNo(no);
        if (user != null ) {
            System.out.println(user);
        } else {
            System.out.println("해당 번호의 회원을 찾을 수 없습니다.");
        }
    }

    private void registerUser() {
        try {
            System.out.print("아이디 입력: ");
            String id = scanner.nextLine();

            System.out.println("이름을 입력하세요.");
            scanner.nextLine();

            System.out.println("비밀번호를 입력하세요.");
            String pwd = scanner.nextLine();

            System.out.println("나이를 입력하세요.");
            int age = scanner.nextInt();

            System.out.println("계좌번호를 입력하세요.");
            scanner.nextInt();

            int nextUserNo = userService.findAllUsers().size() + 1;
            User newUser = new User(nextUserNo, pwd, id, age);

            userService.registerUser(newUser);
            System.out.println("회원 가입 성공: " + id);

        } catch (IllegalArgumentException e) {
            System.out.println("회원 가입 실패: " + e.getMessage());
        }
    }
        private void modifyUser() {
            try {

                System.out.println("수정할 회원 번호 입력: ");
                int no = scanner.nextInt();
                scanner.nextLine();

                User existingUser = userService.findUserByNo(no);
                if (existingUser == null) {
                    System.out.println("해당 번호의 회원을 찾을 수 없습니다.");
                    return;
                }

                System.out.println("비밀번호 확인");
                String currentPassword = scanner.nextLine();

                System.out.println("수정할 정보를 입력하세요 ( 변경하지 않으려면 Enter 입력)");

                System.out.println("새로운 비밀번호 입력 (비밀번호 변경 시 입력, 아니면 Enter): ");
                String newPassword = scanner.nextLine();
                if (newPassword.isEmpty()) newPassword = existingUser.getPwd();

                System.out.println("수정할 계좌번호 입력 (계좌번호 변경 시 입력, 아니면 Enter): ");
                int newAccount = scanner.nextInt();
                scanner.nextLine();

                User updatedUser = new User(no, newPassword, newAccount);
                userService.modifyUser(updatedUser, currentPassword);
                System.out.println("회원 정보 수정 완료: ");

            } catch (IllegalArgumentException e) {
                System.out.println("회원 정보 수정 실패: " + e.getMessage());
            }
        }

    private void removeUser() {
        try {
            System.out.println("삭제할 회원 번호 입력");
            int no = scanner.nextInt();
            scanner.nextLine();

            userService.removeUser(no);
            System.out.println("회원 삭제 완료");
        } catch (IllegalArgumentException e) {
            System.out.println("회원 삭제 실패 " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Application().run();
    }
}