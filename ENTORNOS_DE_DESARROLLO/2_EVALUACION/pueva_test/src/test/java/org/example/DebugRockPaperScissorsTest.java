package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

import static org.junit.jupiter.api.Assertions.*;

class DebugRockPaperScissorsTest {


    @Test
    @DisplayName("Guanya: Pedra vs Tisores")
    void pedraGuanyaTisores(){
        assertEquals(1, DebugRockPaperScissors.guanya("pedra","tisores"));
    }

    @Test
    @DisplayName("Empat: Tisores vs Tisores")
    void tisoresEmpataTisores(){
        assertEquals(0, DebugRockPaperScissors.guanya("tisores", "tisores"));
    }

    @Test
    @DisplayName("Empat: Pedra vs Pedra")
    void pedraEmpataPedra(){
        assertEquals(0,DebugRockPaperScissors.guanya("Pedra","Pedra"));
    }







}