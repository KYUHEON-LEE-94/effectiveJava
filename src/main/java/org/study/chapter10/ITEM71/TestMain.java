package org.study.chapter10.ITEM71;

import java.util.Arrays;
import java.util.List;

/**
 * packageName    : org.study.chapter10.ITEM71
 * fileName       : TestMain
 * author         : LEE KYUHEON
 * date           : 2024-06-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-01        LEE KYUHEON       최초 생성
 */
public class TestMain {
    public static void main(String[] args) {
        // init
        User u1 = new User(1L);
        u1.setName("bb");
        u1.setJob("Student");
        User u2 = new User(2L);
        u2.setJob("developer");
        User u3 = new User(3L);

        List<User> users = Arrays.asList(u1, u2, u3);
        users.stream()
                .map(User::introducing)
                .forEach(System.out::println);

        users.stream()
                .map(User::introducing2)    // Compile error: Unhandled Exception
                .forEach(System.out::println);
    }

    public static class User {
        private final Long id;
        private String name;
        private String job;

        public User(Long id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setJob(String job) {
            this.job = job;
        }

        // Normal
        public String introducing() {
            if (name == null || job == null) {
                name = "default name";
                job = "default job";
            }
            return String.valueOf(id) + " " + name + " " + job;
        }

        // Exception
        public String introducing2() {
            if (name == null || job == null) {
                return "";
            }
            return String.valueOf(id) + " " + name + " " + job;
        }
    }
}
