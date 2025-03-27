import org.example.PlayerCharacter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerCharacterTest {

    @Test
    void getX_shouldReturnZero(){

        PlayerCharacter obj = new PlayerCharacter();
        assertEquals(0, obj.getX());
    }
    @Test
    void getY_shouldReturnZero(){

        PlayerCharacter obj = new PlayerCharacter();
        assertEquals(0, obj.getX());

    }



}