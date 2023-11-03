import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MallardDuckTest {
    private Duck d;
    private ByteArrayOutputStream out;

    public MallardDuckTest(){}

    @Before
    public void before() {
        d = new MallardDuck();
        out = new ByteArrayOutputStream();
        System.setOut( new PrintStream( out ) );
    }

    @Test
    public void testToString() {
        String esperado = "mallardduck{}";
        String obtenido = d.toString().toLowerCase();
        assertEquals( esperado, obtenido );
    }

    @Test
    public void testSwim() {
        d.swim();
        assertTrue( out.toString().toLowerCase().contains( "estoy nadando" ) );
    }

    @Test
    public void testPerformFly() {
        d.performFly();
        //out.toString().toLowerCase().contains( "estoy volando" )
        //String obtenido = out.toString().toLowerCase();
        //String esperado = "estoy volando";
        //assertEquals( obtenido, esperado );
        assertTrue( out.toString().toLowerCase().contains( "estoy volando" ) );
    }

    @Test
    public void testPerformSound() {
        d.performSound();
        assertTrue( out.toString().toLowerCase().contains( "quack" ) );
    }

    @Test
    public void testDisplay() {
        d.display();
        assertTrue( out.toString().toLowerCase().contains( "soy un pato" ) );
    }
}
