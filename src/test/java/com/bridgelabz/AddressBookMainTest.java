package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

    public class AddressBookMainTest {

        AddressbookMain addressbook = null;

        @Before
        public void setUp() {
            addressbook = new AddressbookMain();
        }

        @Test
        public void given_AddingContactInList_IfSuccssful_ShouldReturnCorrectSizeOfList() throws CustomException {
            int result = addressbook.createContact("Ganesh", "Gavh", "abcd", "Mumbai",
                    "Delhi", "12345","917775827779","abc@gmail.com");
            Assert.assertEquals(1, result);
        }

        @Test
        public void given_CreatingContactInListAddressbook_WhenFirstNameIncorrect_ShouldThrowCustomException() {
            try {
                int result = addressbook.createContact("gane", "U", "abcd", "mumbai",
                        "delhi", "12345","777582","abc@gmail.com");
                Assert.assertEquals(0, result);

            }
            catch(CustomException e){
                Assert.assertEquals(CustomException.Exception.FIRST_NAME_INCORRECT,e.type);
            }
        }
    }
