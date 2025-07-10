package com.iensu.montyhall;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class EqualsNumOfDoorsTest {
    @Test
    public void NumOfDoorsTest() {
        //given
        int numDoors = 3;
        //when
        GameSession gameSession = new GameSession(numDoors);
        List<Door> doors = gameSession.getDoors();
        //then
        assertEquals(numDoors, doors.size());
    }

}