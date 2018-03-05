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

    @Test
    public void shouldPrintPyramid(){
        AsteriskGenerator asteriskGenerator =  new AsteriskGenerator();
        Assert.assertEquals("  *\n ***\n*****", asteriskGenerator.generatePyramid(3));
    }

    @Test
    public void shouldPrintFourLevelsDiamond(){
        AsteriskGenerator asteriskGenerator =  new AsteriskGenerator();
        Assert.assertEquals("   *\n  ***\n *****\n*******\n *****\n  ***\n   *", asteriskGenerator.generateDiamond(4));
    }

    @Test
    public void shouldPrintFourLevelsDiamondWithName(){
        AsteriskGenerator asteriskGenerator =  new AsteriskGenerator();
        Assert.assertEquals("   *\n  ***\n *****\nMarcinha\n *****\n  ***\n   *", asteriskGenerator.generateDiamondWithName(4, "Marcinha"));
    }

}