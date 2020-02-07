



import SpringApp.BuddyInfo;

import static org.junit.Assert.*;


public class BuddyInfoTest {
    private BuddyInfo test = new BuddyInfo("Test", "1234");


    @org.junit.Test
    public void testToString() {
        assertTrue(test.toString().equals("BuddyInfo{pNumber='1234', name='Test'}"));

    }

    @org.junit.Test
    public void testGetpNumber() {
        assertTrue(test.getpNumber().equals("1234"));
    }

    @org.junit.Test
    public void testSetpNumber() {
        test.setpNumber("4321");
        assertTrue(test.getpNumber().equals("4321"));
    }

    @org.junit.Test
    public void testGetName() {
        assertTrue(test.getName().equals("Test"));
    }

    @org.junit.Test
    public void testSetName() {
        test.setName("tseT");
        assertTrue(test.getName().equals("tseT"));
    }
}
