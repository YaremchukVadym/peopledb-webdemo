package com.neutrinosys.peopledbweb.biz.model;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

//class PersonTest {
//    @Test
//    public void canParse(){
//        String csvLine =
//                "1245;Mr.;Alex12;B;Hummer12;M;12alex@mail.com;Firsr_FN Last_FN12;Firsr_MN Last_MN12;MMN_Name12;01/01/0012;12:01:01 PM;35.12;71;11/11/1122;Q12;H2;2100";
//
//        Person person = Person.parse(csvLine);
//        assertThat(person.getDob().isEqual(LocalDate.of(0012,01,01)));
//
//    }
//
//
//
//}