package slider;

import base.BaseTests;
import org.testng.annotations.Test;

public class SliderTests extends BaseTests {
    @Test
    public void testSliderRight() {
        var slider = homePage.clickSlider();
        slider.moveSliderRight(4);
    }
}
