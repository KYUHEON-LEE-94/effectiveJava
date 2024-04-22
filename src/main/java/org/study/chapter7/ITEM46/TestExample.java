package org.study.chapter7.ITEM46;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * packageName    : org.study.chapter7.ITEM46
 * fileName       : TestExample
 * author         : heon
 * date           : 2024-04-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-22           heon               최초 생성
 */
public class TestExample {
    /*Stream API의 이점을 살리지 못함*/
    public void AsIs (){
        Map<String, Long> testMap = new HashMap<>();

        try (Stream<String> words = new Scanner("file").tokens()) {
            words.forEach(word -> {
                testMap.merge(word.toLowerCase(), 1L, Long::sum); // 외부 상태 수정
            });
        }
    }

    /*Sream api의 이점을 살림*/
    public void Tobe (){
        Map<String, Long> testMap;

    try (Stream<String> words = new Scanner("file").tokens()) {
            testMap = words.collect(groupingBy(String::toLowerCase, counting()));
        }
    }

    public void CollectorExam () {
        Map<String, Long> freq = new HashMap<>();

        List<String> topTen = freq.keySet().stream()
                .sorted(Comparator.comparing(freq::get).reversed()) // 정렬 (비교자.역순)
                .limit(10) // 10개 제한
                .collect(Collectors.toList()); // 리스트로
    }

    public void toMapExam () {
        List<Person> people = List.of(
                new Person("John", 25),
                new Person("Emily", 30),
                new Person("Michael", 35)
        );

        // Stream을 사용하여 Person 객체 리스트를 이름을 키로 하는 Map<String, Person>으로 변환
        Map<String, Person> nameToPersonMap = people.stream()
                .collect(Collectors.toMap(Person::getName, person -> person));

        // 출력
        System.out.println("Name to Person Map: " + nameToPersonMap);
    }

    public void groupByExam(){
            List<Person> people = List.of(
                    new Person("John", 25),
                    new Person("Emily", 30),
                    new Person("Michael", 35),
                    new Person("Emily", 28),
                    new Person("John", 40)
            );

            // Stream을 사용하여 이름을 키로 하는 Map<String, List<Person>>으로 그룹화
            Map<String, List<Person>> peopleByName = people.stream()
                    .collect(Collectors.groupingBy(Person::getName));

            // 출력
            System.out.println("People grouped by name: " + peopleByName);

            // 나이를 기준으로 그룹화하고, 각 그룹의 평균 연령을 계산
            Map<String, Double> averageAgeByName = people.stream()
                    .collect(Collectors.groupingBy(
                            Person::getName,
                            Collectors.averagingInt(Person::getAge)
                    ));

            // 출력
            System.out.println("Average age by name: " + averageAgeByName);
    }

    public  void countingExam() {
        List<Person> people = List.of(
                new Person("John", 25),
                new Person("Emily", 30),
                new Person("Michael", 35),
                new Person("Emily", 28),
                new Person("John", 40)
        );

        // Stream을 사용하여 특정 조건을 만족하는 요소의 개수 계산
        long numberOfPeopleWithNameJohn = people.stream()
                .filter(person -> person.getName().equals("John"))
                .count();

        // 출력
        System.out.println("Number of people with name John: " + numberOfPeopleWithNameJohn);

        // 이름을 기준으로 그룹화하여 각 그룹의 사람 수 계산
        Map<String, Long> countByName = people.stream()
                .collect(Collectors.groupingBy(Person::getName, Collectors.counting()));

        // 출력
        System.out.println("Count of people by name: " + countByName);
    }
}
