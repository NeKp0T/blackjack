package com.example.blackjack;

import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameControllerTest {


    private GameController controller = new GameController();

    //
//    @BeforeEach
//    void kek() {
//
//        controller.setStack();
//    }

    void getStatusTest() {
        assertEquals(controller.getStatus(), GameController.Status.GAME);
        controller.getCard();

        assertEquals(controller.getStatus(), GameController.Status.GAME);
    }

    void getStatusTest2() {

    }

    void firstCardTest() {
        Stack.Card card = controller.getCropier();
        assertNotNull(card);
    }

    void checkCropierCardTest() {
        List<Stack.Card> cards = controller.getCropierCards();

    }

    void getCardTest() {

    }

    void getCroupierTest() {

    }

    void getCroupierCardTest() {

    }


    void getScorePlayerTest() {
        Stack.Card card = controller.getPlayerCard();
        assertEquals(controller.getPlayerScore(), card.number);
        assertEquals(controller.getCropierScore(), 0);
    }

    void getScoreCroupierTest() {
        Stack.Card card = controller.getCropierCard();
        assertEquals(controller.getCropierScore(), card.number);
        assertEquals(controller.getPlayerScore(), 0);
    }

}