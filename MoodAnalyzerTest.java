import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad()  {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a Sad message");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a Happy message");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }
}
