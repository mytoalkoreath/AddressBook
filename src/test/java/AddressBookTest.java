


import SpringApp.AddressBook;

import static org.junit.Assert.*;


public class AddressBookTest {
    AddressBook test = new AddressBook();

    @org.junit.Test
    public void addBuddy() {
        assertEquals("AddressBook{buddies=[]}", test.toString());
        test.addBuddy("Test", "1234", "432 test lane");
        assertEquals("AddressBook{buddies=[BuddyInfo{name='Test', pNumber='1234', address='432 test lane'}]}", test.toString());
    }

    @org.junit.Test
    public void testToString() {

        test.addBuddy("Test2", "12345", "432 test lane");
        assertEquals("AddressBook{buddies=[BuddyInfo{name='Test2', pNumber='12345', address='432 test lane'}]}", test.toString());
    }

    @org.junit.Test
    public void testRemoveBuddy() {
        test.addBuddy("Test", "1234", "432 test lane");
        assertTrue(test.removeBuddy("Test"));


    }
}
