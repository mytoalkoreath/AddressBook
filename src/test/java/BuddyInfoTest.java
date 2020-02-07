



import SpringApp.BuddyInfo;

import static org.junit.Assert.*;


public class BuddyInfoTest {
    private BuddyInfo test = new BuddyInfo("Test", "1234", "432 test lane");


    @org.junit.Test
    public void testToString() {
        assertTrue(test.toString().equals("BuddyInfo{name='Test', pNumber='1234', address='432 test lane'}"));

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

    @org.junit.Test
    public void testGetAddress() {
        assertTrue(test.getAddress().equals("432 test lane"));
    }

    @org.junit.Test
    public void testSetAddress() {
        test.setName("Not 432 test lane");
        assertTrue(test.getAddress().equals("Not 432 test lane"));
    }
}
