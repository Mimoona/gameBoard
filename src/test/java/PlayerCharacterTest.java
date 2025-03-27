import org.example.PlayerCharacter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerCharacterTest {
    PlayerCharacter playerFigure = new PlayerCharacter();

    @BeforeEach
    void getX_shouldReturnZero(){
        assertEquals(0, playerFigure.getX());
    }
    @BeforeEach
    void getY_shouldReturnZero(){
        assertEquals(0, playerFigure.getX());
    }

    @Test
    void move_shouldReturnZeroOne_whenTypedW(){
        int [] actualPosition = playerFigure.move("W");
        assertArrayEquals(new int []{0,1}, actualPosition);

    }

    @Test
    void move_shouldReturnZeroOne_whenTypedS(){
        int [] actualPosition = playerFigure.move("S");
        assertArrayEquals(new int []{0,-1}, actualPosition);

    }

    @Test
    void move_shouldReturnZeroOne_whenTypedD(){
        int [] actualPosition = playerFigure.move("D");
        assertArrayEquals(new int []{1,0}, actualPosition);

    }

    @Test
    void move_shouldReturnZeroOne_whenTypedA(){
        int [] actualPosition = playerFigure.move("A");
        assertArrayEquals(new int []{-1,0}, actualPosition);

    }
}