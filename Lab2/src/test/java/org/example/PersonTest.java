package org.example;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void testEquals() {
        EqualsVerifier.forClass(Person.class).verify();
    }
}