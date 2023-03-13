package aufgabe1.bird;

import aufgabe1.food.Nut;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BlackbirdTest {

    // TODO Test für `Blackbird` schreiben (keine Logik von `Bird` testen!)

    @Test
    public void testHasPreferredFood(){

        //given
        //when
        Blackbird blackbird = new Blackbird();
        //then
        assertEquals(2, blackbird.getPreferredFoods().size());
    }

}
