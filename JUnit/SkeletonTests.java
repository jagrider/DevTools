/**
 * This file contains a skeleton for JUnit test cases.
 *
 * This file and its contents are intended to be used for the Introduction
 * to Object Oriented Programming course, CS18000.
 *
 * Any use outside of the CS18000 course must adhere to the following
 * license and additional conditions:
 *
 * =========================================================================
 * Copyright (C) 2018  Jonathan Grider
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Additional terms:
 *
 * Use of this file and its contents must be presented with information
 * specifying the authors of such works, including the original copyright
 * holders.
 *
 * Any additions or modifications to this file or its contents must
 * document the original copyright holders and the copyright holders of
 * said additions or modifications, including but not limited to
 * when the additions or modifications in question were made.
 * =========================================================================
 *
 * @author Jonathan Grider, jagrider@purdue.edu
 * @version 2/22/18
 */


import org.junit.*;
import org.junit.Assert.*;
import org.junit.rules.Timeout;
import static org.junit.Assert.assertEquals;


/**
 * TODO: COMPLETE THIS DOCUHEADER
 * CS18000 - SEMESTER YYYY
 *
 * ASSIGNMENT # -[ optional: assignment name ]- Test Cases
 *
 * TODO: DESCRIBE YOUR PROJECT TESTS HERE -- be sure to mention if there is anything manually graded!
 *
 * @author YOUR NAME, YOUREMAIL@purdue.edu
 * @version TODAY'S DATE
 */
public class SkeletonTests {

    /* TODO: REMOVE THIS COMMENT BLOCK
     * Declare any global static variables used in all tests here.
     *
     * These are typically private and, in some cases, final.
     */


    /**
     * Initialize any global static variables used in all tests.
     *
     * If you do not have any global static variables, this method is not needed.
     */
    @Before
    public void setup() {

    }

    /**
     * Set up any global rules here
     *
     * To set up any subsequent rules, make sure to include
     * the @Rule tag above each rule.
     *
     * The rule below sets the global timeout. You may remove
     * or modify it as needed.
     */
    @Rule
    public Timeout globalTimeout = Timeout.seconds(2);

    /**
     * Tear down any global static variables used in all tests.
     *
     * If you do not have any global static variables, this method is not needed.
     */
    @After
    public void tearDown() {

    }


    /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
    /*                                BEGIN TEST CASES                                 */
    /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

    /**
     * TODO: REMOVE THIS COMMENT BLOCK
     *
     * Below is a table outlining the different parts of the test cases
     * within this file, as well as their overall weight on the total score of the
     * assignment. You should modify, expand or condense this table as you see fit.
     */

    /*
     *      _____________________________________
     *     |         Total Score Summary:        |
     *     |-------------------------------------|
     *     | Part 1 Tests      |             XX% |
     *     | Part 2 Tests      |             XX% |
     *     | Part 3 Tests      |             XX% |
     *     | Part 4 Tests      |             XX% |
     *     ---------------------------------------
     *
     */

    /**
     * TODO: REMOVE THIS COMMENT BLOCK
     *
     * General CS180 JUnit etiquette:
     *
     * Your test cases should adhere to CS18000 Coding standards at all times.
     *
     * Your test cases need to have meaningful names that make it clear as to
     * what it is testing. Some examples:
     *      - A name like "test_1" is not acceptable.
     *      - A name like "testConstructor1" is acceptable.
     *      - A name like "testMultpleInputs1" is acceptable
     *      - If there are multiple tests with the same purpose, number them accordingly.
     *
     * Your test cases need to have scoring weight tags. This tag signifies the weight of
     * the specific test case, to be used in Vocareum. When making and running the
     * test cases, these tags should be commented out.
     *      - All of the scoring weight tags should add up to 1.
     *      - I.e., if a test would count for 50% of the assignment, the tag would be as follows:
     *      //@ScoringWeight(0.5)
     *
     * It is recommended that you document where the different parts of an assignment
     * are located within your test cases.
     *
     * It may also be helpful to include print statements signifying when different
     * types / parts of the test cases begin. I.e.,
     *
     *      "*** BEGIN TESTING PART 1 ***"
     *
     *      or
     *
     *      "*** BEGIN CONSTRUCTOR TESTS ***"
     *  An example test case can be found below.
     */


    /**
     * TODO: REMOVE THIS COMMENT BLOCK AND METHOD
     *
     * This is an example test case. This is how tests should generally be formatted.
     */
    @Test (timeout = 100)  // This test will time out after 100 milliseconds. You can do 1000 for longer tests.
    //@ScoringWeight(0.035)  // This test is worth 3.5% of the assignment grade
    public void meaningfulTestName1() {

        // TODO: Declare any variables here
        int expected = 5;

        // TODO: Declare meaningful error message(s) here
        String message = "This is an example error message. There should be one for each assertion call!";

        // TODO: Perform any logic here
        int actual = 6;  // This would be replaced by the value return by the student's program.

        /*
         * TODO: REMOVE THIS COMMENT BLOCK AND STATEMENT
         *
         * Place assertion statements below
         *
         * It is okay to have multiple assertions, so long as they are asserting different things
         * and preferably have different error messages (if at all possible).
         *
         * message --> The error message that will be printed upon failure of the assertion
         * expected --> The value we are expecting the student's program to return
         * actual --> The actual value that the student's program returned
         */
        assertEquals(message, expected, actual);
    }

    /**
     * TODO: REMOVE THIS COMMENT BLOCK
     *
     * You may find it useful to organize your tests in the groups you made in the table above.
     */

    /* Begin Part 1 Tests */

    // Create part 1 tests here

    /* End Part 1 Tests */

    /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
    /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */


    /* Begin Part 2 Tests */

    // Etc....


}
