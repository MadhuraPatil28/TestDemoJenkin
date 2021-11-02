import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @org.junit.Test
    public void add() {
        int result = addition.add(3,3);
        int correct = 6;
        asserEquaals(expected 6, result);
    }
}