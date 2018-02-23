/**
 * This file contains useful tools and methods used with JUnit test cases.
 *
 * This file and its contents are intended to be used for the Introduction
 * to Object Oriented Programming course, CS18000. Any use of this file
 * within CS18000 should cite any use of this file or its contents, as
 * well as the original author.
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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.*;
import org.junit.Assert;
import org.junit.rules.Timeout;
import static org.junit.Assert.assertEquals;

public class JUnitTools {

    private final InputStream originalSysin = System.in;
    private final PrintStream originalSysout = System.out;
    private ByteArrayOutputStream recordingSysout;

    @Before
    public void setup() {
        System.setIn(originalSysin);
        System.setOut(originalSysout);
    }

    @Rule
    public Timeout globalTimeout = Timeout.seconds(2);

    @After
    public void tearDown() {
        stopRecording();
    }

    /**
     * Terminates all lines with a system dependent newline
     * character and replaces System.in
     *
     * @param inputLines The lines of input, one string per line.
     */
    private void setSystemIn(String... inputLines) {
        byte[] bytes = multiline(inputLines).getBytes();
        ByteArrayInputStream newInput = new ByteArrayInputStream(bytes);
        System.setIn(newInput);
    }

    /**
     * Terminates all lines with a system dependent newline
     * character and replaces System.in
     *
     * @param inputLines The lines of input, one string per line.
     * @return A string with all lines concatenated and ended with the system newline character.
     */
    private static String multiline(String... inputLines) {
        StringBuilder sb = new StringBuilder();

        for(String line : inputLines) {
            sb.append(line);
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }

    /**
     * Starts recording the stdout of the application.
     */
    private void recordOutput() {
        recordingSysout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(recordingSysout));
    }

    /**
     * Stops recording the stdout of the application.
     */
    private void stopRecording() {
        System.setOut(originalSysout);

        if(recordingSysout != null) {
            getRecording();
        }

        recordingSysout = null;
    }

    /**
     * Gets the recording of sysout.
     * @return All the lines put in stdout since calling recordOutput
     */
    private String getRecording() {
        String output = recordingSysout.toString();
        recordingSysout.reset();

        originalSysout.print(output);
        return output;
    }

    /**
     * Does a "fuzzy" equals on two strings. This is comparable to running diff
     * with the -wiB flags. Ignores whitespace differences, case and blank lines.
     *
     * @param description The human readable description if the strings don't compare.
     * @param expected The expected value of the program output
     * @param actual The actual value of the program output
     */
    private void assertFuzzyEquals(String description, String expected, String actual) {
        if(normalize(expected).equals(normalize(actual))) {
            return;
        }

        assertEquals(description, expected, actual);
    }

    /**
     * Does a "fuzzy" startsWith on two strings. This is comparable to running diff
     * with the -wiB flags. Ignores whitespace differences, case and blank lines.
     *
     * @param description The human readable description if the strings don't compare.
     * @param expectedStart The string actual is expected to start with
     * @param actual The actual value of the program output
     */
    private void assertFuzzyBegins(String description, String expectedStart, String actual) {
        if(normalize(actual).startsWith(normalize(expectedStart))) {
            return;
        }

        assertEquals(description, expectedStart, actual);
    }

    /**
     * Normalizes a given string, removing whitespace differences,
     * case and blank lines.
     *
     * @param str The actual value of the string to be normalized.
     * @return The normalized value of the string.
     */
    private static String normalize(String str) {
        str = str.toLowerCase();
        str = str.replaceAll("\\s+","");
        return str;
    }


}
