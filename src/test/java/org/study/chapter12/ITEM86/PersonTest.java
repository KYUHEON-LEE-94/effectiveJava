package org.study.chapter12.ITEM86;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : org.study.chapter12.ITEM86
 * fileName       : PersonTest
 * author         : LEE KYUHEON
 * date           : 2024-06-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-27        LEE KYUHEON       최초 생성
 */
class PersonTest {
    private static final String SERIALIZE_OBJECT_FILE_PATH = "filePath";

    @Test
    void serialize() throws IOException {
        Person person = new Person("pkch", 28);

        try (FileOutputStream fileOutputStream = new FileOutputStream(SERIALIZE_OBJECT_FILE_PATH)) {
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
                objectOutputStream.writeObject(person);
            }
        }
    }

        @Test
        void deserialize() throws IOException {
            Person person = null;

            try (FileInputStream fileInputStream = new FileInputStream(SERIALIZE_OBJECT_FILE_PATH)) {
                try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                    person = (Person) objectInputStream.readObject();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
            assertEquals(person.getName(), "pkch");
            assertEquals(person.getAge(), 28);
        }

    @Test
    void serialize_employee() throws IOException {
        Employee employee = new Employee("woowabros", "서비스개발팀");

        try (FileOutputStream fileOutputStream = new FileOutputStream(SERIALIZE_OBJECT_FILE_PATH)) {
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
                objectOutputStream.writeObject(employee);
            }
        }
    }
}