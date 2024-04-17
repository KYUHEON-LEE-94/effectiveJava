package org.study.chapter7.ITEM43;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : org.study.chapter7.ITEM43
 * fileName       : PersonTest
 * author         : heon
 * date           : 2024-04-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-17           heon               최초 생성
 */
class PersonTest {

    @Test
    void test(){
        Person person1 = new Person("김OO");
        Person person2 = new Person("이OO");
        Person person3 = new Person("김OO");
        Person person4 = new Person("최OO");

        List<Person> people = Arrays.asList(person1, person2, person3, person4);

        //람다 방식
        Map<String, Integer> counts = new HashMap<>();
        for (Person person : people) {
            counts.merge(person.getName(), 1, (existingValue, providedValue) -> existingValue + providedValue);
        }
        System.out.println("counts = " + counts);

        //메서드 참조 방식
        Map<String, Integer> counts2 = new HashMap<>();
        for (Person person : people) {
            counts.merge(person.getName(), 1, Integer::sum);
        }
        System.out.println("counts2 = " + counts2);
    }

    @Test
    void only_kim(){
        Person person1 = new Person("김OO");
        Person person2 = new Person("이OO");
        Person person3 = new Person("김OO");
        Person person4 = new Person("최OO");


        List<Person> people = Arrays.asList(person1, person2, person3, person4);

        //익명 클래스 방식
        List<Person> onlyKim = people.stream()
                .filter(new Predicate<>() {
                    @Override
                    public boolean test(Person person) {
                        return person.getName().startsWith("김");
                    }
                })
                .collect(toList());

        //람다 방식
        List<Person> onlyKim2 = people.stream()
                .filter(person -> person.getName().startsWith("김"))
                .collect(toList());

        //메서드 참조 방식
        List<Person> onlyKim3 = people.stream()
                .filter(Person::isLastNameKim)
                .collect(toList());
    }


}