package asterisk;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AsteriskGeneratorTest {

    @Test
    public void shouldPrintOneAsterisk(){
        AsteriskGenerator asteriskGenerator =  new AsteriskGenerator();
        Assert.assertEquals("*", asteriskGenerator.generate());

    }

    @Test
    public void shouldPrintThreeAsterisk(){
        AsteriskGenerator asteriskGenerator =  new AsteriskGenerator();
        Assert.assertEquals("***", asteriskGenerator.generateHorizontal(3));
    }

    @Test
    public void shouldPrintFourVerticalAsterisk(){
        AsteriskGenerator asteriskGenerator =  new AsteriskGenerator();
        Assert.assertEquals("*\n*\n*\n*", asteriskGenerator.generateVertical(4));
    }

    @Test
    public void shouldPrintThreeLevelRightTriangle(){
        AsteriskGenerator asteriskGenerator =  new AsteriskGenerator();
        Assert.assertEquals("*\n**\n***", asteriskGenerator.generateRightTriangle(3));
    }

}