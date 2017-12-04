import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestEightBall {

    MagicEightBall magicEightBall;

    @Before
    public void before() {
        magicEightBall = new MagicEightBall();
    }

    @Test
    public void canAddAnswer() {
        magicEightBall.addAnswer("Seems Likely");
        assertEquals(1, magicEightBall.getAnswerCount());
    }

    @Test
    public void returnAnyAnswer(){
        magicEightBall.addAnswer( "Seems Likely");
        magicEightBall.addAnswer( "Not likely");
        magicEightBall.addAnswer( "Maybe");
        System.out.println(magicEightBall.getRandomAnswer());
        assertNotNull(magicEightBall.getRandomAnswer());
    }

    @Test
    public void canRemoveAnswer(){
        magicEightBall.addAnswer( "Seems Likely");
        magicEightBall.addAnswer( "Not likely");
        magicEightBall.addAnswer( "Maybe");
        magicEightBall.removeAnswer("Maybe");
        assertEquals(2, magicEightBall.getAnswerCount());
    }

}
