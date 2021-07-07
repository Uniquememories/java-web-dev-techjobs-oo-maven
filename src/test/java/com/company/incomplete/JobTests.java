package com.company.incomplete;

import com.company.CoreCompetency;
import com.company.Employer;
import com.company.Job;
import com.company.Location;
import com.company.PositionType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class JobTests {

    // you can rename the tests, or delete them and rewrite them from scratch, but I went ahead and provided you the names of tests I created -- I followed the writeup pretty honestly
    @Test
    public void testSettingJobId() {
        //create two Job objects using the default/empty constructor
        Job jobOne = new Job();
        Job jobTwo = new Job();
        //check that the two ids of both objects differ & are sequential (1, 2)
        Assertions.assertEquals((jobOne.getId() != jobTwo.getId()), true);
        Assertions.assertEquals((jobTwo.getId() - jobOne.getId()), 1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        //declare and initialize a job object: new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //check that name, location, & employer, position type, core competency was checked properly
        Assertions.assertEquals(jobA.getName(), "Product tester");
        Assertions.assertEquals(jobA.getEmployer().getValue(), "ACME");
        Assertions.assertEquals(jobA.getLocation().getValue(), "Desert");
        Assertions.assertEquals(jobA.getPositionType().getValue(), "Quality control");
        Assertions.assertEquals(jobA.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job jobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobB = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assertions.assertEquals((jobA == jobB), false);
    }

    // I found the instructions around the three toString() tests a little confusing, so I created three tests following the three bullet points:
    // you can follow TDD if you want, or you can write the implementation first and then get the tests to pass, either is a fine approach
    @Test
    public void testToStringContainsBlankLines() {
        //When passed a Job object, it should return a string that contains a blank line before and after the job information.
    }

    @Test
    public void testToStringHasLabelsForEachField() {
        //The string should contain a label for each field, followed by the data stored in that field. Each field should be on its own line.
    }

    @Test
    public void testToStringDataNotAvailable() {
        //If a field is empty, the method should add, “Data not available” after the label.
    }
}
