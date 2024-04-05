package org.study.chapter6.ITEM37;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : org.study.chapter6.ITEM37
 * fileName       : ClientTest
 * author         : heon
 * date           : 2024-04-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-05           heon               최초 생성
 */
class ClientTest {

    private List<Plant> garden;

    @BeforeEach
    void setUp() {
        garden = Arrays.asList(
                new Plant("ANNUAL_TREE_1", Plant.LifeCycle.ANNUAL),
                new Plant("ANNUAL_TREE_2", Plant.LifeCycle.ANNUAL),
                new Plant("ANNUAL_TREE_3", Plant.LifeCycle.ANNUAL),
                new Plant("BIENNIAL_TREE_1", Plant.LifeCycle.BIENNIAL),
                new Plant("PERENNIAL_TREE_1", Plant.LifeCycle.PERENNIAL)
        );
    }

    // ANNUAL: [ANNUAL_TREE_3, ANNUAL_TREE_2, ANNUAL_TREE_1]
    // PERENNIAL: [PERENNIAL_TREE_1]
    // BIENNIAL: [BIENNIAL_TREE_1]
    @DisplayName("정원에 있는 식물 등록하기")
    @Test
    void testCase1() {
        // given
        Client client = new Client();

        // then
        client.addPlantTypeEnumMap(garden);
    }
}