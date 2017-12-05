import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestEightBall {

    MagicEightBall magicEightBall;

    @Before
    public void before() {
        magicEightBall = new MagicEightBall();
        magicEightBall.addAnswer( "Seems Likely");
        magicEightBall.addAnswer( "Not likely");
        magicEightBall.addAnswer( "Maybe");
        magicEightBall.addAnswer( "Answer Unclear");
        magicEightBall.addAnswer( "Ask Again");
        magicEightBall.addAnswer( "Run For The Hills");
    }

    @Test
    public void canAddAnswer() {
        assertEquals(6, magicEightBall.getAnswerCount());
    }

    @Test
    public void returnAnyAnswer(){
        System.out.println(magicEightBall.getRandomAnswer());
        assertNotNull(magicEightBall.getRandomAnswer());
    }

    @Test
    public void canRemoveAnswer(){
        magicEightBall.removeAnswer("Maybe");
        assertEquals(5, magicEightBall.getAnswerCount());
    }

}
