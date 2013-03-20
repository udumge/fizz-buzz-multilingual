package jp.sf.fizzbuzz.test;

import static org.junit.Assert.*;
import jp.sf.fizzbuzz.FizzBuzz;

import org.junit.Before;
import org.junit.Test;

/**
 * @author sf
 * JUnit4でテストするFIZZBUZZ
 * 0とかマイナスとかはやる気ない。
 */
public class FizzBuzzTest {

    FizzBuzz fb = new FizzBuzz();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testVerifyFizzBuzz0() {
        assertTrue("FIZZBUZZ".equals(fb.verifyFizzBuzz(0)));
    }

    @Test
    public void testVerifyFizzBuzz1() {
        assertTrue("1".equals(fb.verifyFizzBuzz(1)));
    }

    @Test
    public void testVerifyFizzBuzz3() {
        assertTrue("FIZZ".equals(fb.verifyFizzBuzz(3)));
    }

    @Test
    public void testVerifyFizzBuzz9() {
        assertTrue("FIZZ".equals(fb.verifyFizzBuzz(9)));
    }

    @Test
    public void testVerifyFizzBuzz5() {
        assertTrue("BUZZ".equals(fb.verifyFizzBuzz(5)));
    }

    @Test
    public void testVerifyFizzBuzz10() {
        assertTrue("BUZZ".equals(fb.verifyFizzBuzz(10)));
    }

    @Test
    public void testVerifyFizzBuzz15() {
        assertTrue("FIZZBUZZ".equals(fb.verifyFizzBuzz(15)));
    }

    @Test
    public void testVerifyFizzBuzz30() {
        assertTrue("FIZZBUZZ".equals(fb.verifyFizzBuzz(30)));
    }

    @Test
    public void testVerifyFizzBuzzMinus() {
        assertTrue("-1".equals(fb.verifyFizzBuzz(-1)));
    }

}
