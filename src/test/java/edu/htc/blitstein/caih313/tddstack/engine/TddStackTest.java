package edu.htc.blitstein.caih313.tddstack.engine;
import static org.junit.Assert.*;

import edu.htc.blitstein.caih313.tddstack.IStackable;
import edu.htc.blitstein.caih313.tddstack.resource.campus.Faculty;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TddStackTest {
    TddStack tdd;
    IStackable obj1;
    IStackable obj2;
    IStackable obj3;

    @Before
    public void setUp() throws Exception {
        tdd = new TddStack();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void testSet(){

        long expected = TddStack.DEFAULT_DEPTH;
        TddStack objresult = new TddStack();
        long result = objresult.stackDepth;
        assertEquals(expected, result, 0.001);

    }
    @Test
    public void testNewStackIsEmpty() {
        TddStack tddStack = new TddStack();
        assertTrue(tddStack.isEmpty());
    }
    @Test
    public void testNewStackIsFull(){
        TddStack objresult = new TddStack();
        assertTrue(objresult.isFull());

    }
    @Test
    public void testPopIsPush() {
        TddStack tddStack = new TddStack();
        //Faculty implements IStackable
        IStackable iStackableOrig = new Faculty();
        tddStack.push(iStackableOrig);
        IStackable iStackablePopped = tddStack.pop();
        assertEquals(iStackableOrig, iStackablePopped);
    }
    @Test
    public void testPushEmpty(){
        TddStack objresult = new TddStack();
        objresult.push(obj1);
        assertFalse(objresult.isEmpty());


    }
    @Test
    public void testPushFull(){
        TddStack objresult = new TddStack(3);
        objresult.push(obj1);
        objresult.push(obj2);
        objresult.push(obj3);
        assertTrue(objresult.isFull());


    }


}