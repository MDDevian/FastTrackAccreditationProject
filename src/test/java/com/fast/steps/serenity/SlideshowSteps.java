package com.fast.steps.serenity;

import com.fast.pages.SlideshowPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SlideshowSteps extends ScenarioSteps {

    SlideshowPage slideshowPage;

    @Step
    public void navigateToHomepage() {
        slideshowPage.open();
    }

    @Step
    public void slideshowNextArrowButton() {
        slideshowPage.slideshowNextButton();
    }

    @Step
    public void checkSlideshowNextSuccess() {
        slideshowPage.verifyNextSlideSuccess();
    }

    @Step
    public void slideshowPrevArrowButton() {
        slideshowPage.slideshowPrevButton();

    }

    @Step
    public void checkSlideShowPrevSuccess(){
        slideshowPage.verifyPrevSlideSuccess();
    }
}
