package moodanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyzerTest {
    /**
     * Method under test: default or parameterless constructor of {@link MoodAnalyzer}
     */
    @Test
    public void testConstructor() {
        assertEquals("Not all who wander are lost", (new MoodAnalyzer("Not all who wander are lost")).message);
    }

    /**
     * Method under test: {@link MoodAnalyzer#analyseMood()}
     */
    @Test
    public void testAnalyseMood() {
        assertEquals("no match", (new MoodAnalyzer("Not all who wander are lost")).analyseMood());
        assertEquals("Sad", (new MoodAnalyzer("I am in sad mood.")).analyseMood());
        assertEquals("Happy", (new MoodAnalyzer("I am in happy mood.")).analyseMood());
    }
}

