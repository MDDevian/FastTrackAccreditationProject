package com.fast.features.search;

import com.fast.steps.serenity.SlideshowSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class SlideshowTests {
    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    SlideshowSteps slideshowSteps;

    @Test
    public void slideshowTest(){
        slideshowSteps.navigateToHomepage();
        slideshowSteps.slideshowNextArrowButton();
        slideshowSteps.checkSlideshowNextSuccess();
        slideshowSteps.slideshowPrevArrowButton();
        slideshowSteps.checkSlideShowPrevSuccess();
    }

}
