


import static org.junit.Assert.*;


public class AddressBookTest {
    AddressBook test = new AddressBook("Book 1");

    @org.junit.Test
    public void addBuddy() {
        assertEquals("AddressBook{buddies=[]}", test.toString());
        test.addBuddy("Test", "1234");
        assertEquals("AddressBook{buddies=[BuddyInfo{pNumber='1234', name='Test'}]}", test.toString());
    }

    @org.junit.Test
    public void testToString() {

        test.addBuddy("Test2", "12345");
        assertEquals("AddressBook{buddies=[BuddyInfo{pNumber='12345', name='Test2'}]}", test.toString());
    }

    @org.junit.Test
    public void testRemoveBuddy() {
        test.addBuddy("Test", "1234");
        assertTrue(test.removeBuddy("Test"));


    }
}
