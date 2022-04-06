package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{


	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	JavascriptExecutor js = (JavascriptExecutor)driver;

	@FindBy(xpath = "//img[@class='dsg-nav-logo']")
	WebElement securianFinancialLogo;

	@FindBy(xpath = "//div[@class='dsg-hero-banner-copy']")
	WebElement securianBanner;

	@FindBy(xpath = "//a[@aria-label='Share on Facebook']//span[@class='fab fa-facebook']")
	WebElement facebookShareButton;

	@FindBy(xpath = "//a[@aria-label='Share on Twitter']//span[@class='fab fa-twitter']")
	WebElement twitterShareButton;

	@FindBy(xpath = "//a[@aria-label='Share on LinkedIn']//span[@class='fab fa-linkedin']")
	WebElement linkedInShareButton;

	@FindBy(xpath = "//h2[normalize-space()='Pre-retirement calculator']")
	WebElement retirementCalculatorHeaderText;

	@FindBy(xpath = "//p[contains(text(),'This calculator will help you determine how much y')]")
	WebElement instructionalText;

	@FindBy(xpath = "//h3[normalize-space()='Age']")
	WebElement ageLabel;

	@FindBy(xpath = "//label[@for='current-age']")
	WebElement currentAgeQuestion;

	@FindBy(xpath = "//input[@id='current-age']")
	WebElement currentAgeTextBox;
	
	@FindBy(xpath = "//label[@for='retirement-age']")
	WebElement retirementAgeQuestion;
	
	@FindBy(xpath = "//input[@id='retirement-age']")
	WebElement retirementAgeTextBox;
	
	@FindBy(xpath = "//h3[normalize-space()='Income/Savings']")
	WebElement incomeSavingsLabel;
	
	@FindBy(xpath = "//label[@for='current-income']")
	WebElement currentIncomeQuestion;
	
	@FindBy(xpath = "//input[@id='current-income']")
	WebElement currentIncomeTextBox;
	
	@FindBy(xpath = "//label[normalize-space()=\"What is your spouse's annual income?\"]")
	WebElement spouseIncomeQuestion;
	
	@FindBy(xpath = "//input[@id='spouse-income']")
	WebElement spouseIncomeTextBox;
	
	@FindBy(xpath = "//label[@for='current-total-savings']")
	WebElement currentSavingsQuestion;
	
	@FindBy(xpath = "//input[@id='current-total-savings']")
	WebElement currentSavingsTextBox;
	
	@FindBy(xpath = "//label[contains(text(),'How much are you currently saving each year for re')]")
	WebElement retirementSavingsQuestion;
	
	@FindBy(xpath = "//input[@id='current-annual-savings']")
	WebElement retirementSavingsTextBox;
	
	@FindBy(xpath = "//label[contains(text(),'What is the rate of increase in your savings each ')]")
	WebElement rateOfSavingsQuestion;
	
	@FindBy(xpath = "//input[@id='savings-increase-rate']")
	WebElement rateOfSavingsTextBox;
	
	@FindBy(xpath = "//h3[normalize-space()='Social Security income']")
	WebElement ssnLabel;
	
	@FindBy(xpath = "//legend[@id='include-social-label']")
	WebElement ssnQuestion;
	
	@FindBy(xpath = "//button[normalize-space()='Calculate']")
	WebElement calculateButton;
	
	@FindBy(xpath = "//button[normalize-space()='Clear form']")
	WebElement clearFormButton;
	
	@FindBy(xpath = "//label[@for='yes-social-benefits']")
	WebElement yesOption;
	
	@FindBy(xpath = "//label[@for='no-social-benefits']")
	WebElement noOption;
	
	@FindBy(xpath = "//legend[@id='marital-status-label']")
	WebElement maritalQuestion;
	
	@FindBy(xpath = "//label[normalize-space()='Single']")
	WebElement singleOption;
	
	@FindBy(xpath = "//label[normalize-space()='Married']")
	WebElement marriedOption;
	
	@FindBy(xpath = "//label[normalize-space()='Social Security override amount']")
	WebElement ssnAmountOverrideQuestion;
	
	@FindBy(xpath = "//input[@id='social-security-override']")
	WebElement ssnAmountTextBox;
	
	@FindBy(xpath = "//a[normalize-space()='Adjust default values']")
	WebElement defaultValuesLink;
	
	@FindBy(xpath = "//input[@id='additional-income']")
	WebElement additionalIncomeTextBox;
	
	@FindBy(xpath = "//input[@id='retirement-duration']")
	WebElement retirementDurationTextBox;
	
	@FindBy(xpath = "//label[@for='include-inflation']")
	WebElement includeInflationButton;
	
	@FindBy(xpath = "//input[@id='expected-inflation-rate']")
	WebElement expectedInflationRateTextBox;
	
	@FindBy(xpath = "//input[@id='retirement-annual-income']")
	WebElement retirementAnnualIncomeTextBox;
	
	@FindBy(xpath = "//input[@id='pre-retirement-roi']")
	WebElement preRetirementROITextBox;
	
	@FindBy(xpath = "//input[@id='post-retirement-roi']")
	WebElement postRetirementROITextBox;
	
	@FindBy(xpath = "//button[normalize-space()='Save changes']")
	WebElement saveChangesButton;
	
	@FindBy(xpath = "//h3[normalize-space()='Results']")
	WebElement resultsHeader;
	
	@FindBy(xpath = "//canvas[@id='results-chart']")
	WebElement resultsChart;

	// Verification Methods

	public boolean isSecurianLogoDisplayed() {
		return securianFinancialLogo.isDisplayed(); 
	}

	public boolean isSecurianBannerDisplayed() {
		return securianBanner.isDisplayed();
	}

	public boolean isFacebookShareButtonDisplayed() {
		return facebookShareButton.isDisplayed();
	}

	public boolean isTwitterShareButtonDisplayed() {
		return twitterShareButton.isDisplayed();
	}

	public boolean isLinkedInShareButtonDisplayed() {
		return linkedInShareButton.isDisplayed();
	}

	public boolean isRetirementCalculatorHeaderTextDisplayed() {
		return retirementCalculatorHeaderText.isDisplayed();
	}

	public boolean isInstructionalTextDisplayed() {
		return instructionalText.isDisplayed();
	}

	public boolean isAgeLabelDisplayed() {
		return ageLabel.isDisplayed();
	}

	public boolean isCurrentAgeQuestionDisplayed() {
		return currentAgeQuestion.isDisplayed();
	}

	public boolean isCurrentAgeTextBoxDisplayed() {
		return currentAgeTextBox.isDisplayed();
	}
	
	public boolean isRetirementAgeQuestionDisplayed() {
		return retirementAgeQuestion.isDisplayed();
	}
	
	public boolean isIncomeSavingsLabelDisplayed() {
		return incomeSavingsLabel.isDisplayed();
	}

	public boolean isCurrentIncomeQuestionDisplayed() {
		return currentIncomeQuestion.isDisplayed();
	}
	
	public boolean isSpouseIncomeQuestionDisplayed(){
		js.executeScript("arguments[0].scrollIntoView();", spouseIncomeQuestion);
		return spouseIncomeQuestion.isDisplayed();
	}
	
	public boolean isCurrentSavingsQuestionDisplayed() {
		return currentSavingsQuestion.isDisplayed();
	}
	
	public boolean isRetirementSavingsQuestionDisplayed() {
		return retirementSavingsQuestion.isDisplayed();
	}
	
	public boolean isRateOfSavingsQuestionDisplayed() {
		return rateOfSavingsQuestion.isDisplayed();
	}
	
	public boolean isSSNLabelDisplayed() {
		return ssnLabel.isDisplayed();
	}
	
	public boolean isSSNQuestionDisplayed() {
		return ssnQuestion.isDisplayed();
	}
	
	public boolean isCalculateButtonDisplayed() {
		return calculateButton.isDisplayed();
	}
	
	public boolean isClearFormButtonDisplayed() {
		return clearFormButton.isDisplayed();
	}
	
	public boolean isMaritalQuestionDisplayed() {
		return maritalQuestion.isDisplayed();
	}
	
	public boolean isSSNAmountOverrideQuestionDisplayed() {
		return ssnAmountOverrideQuestion.isDisplayed();
	}
	
	public boolean isResultsHeaderDisplayed() {
		return resultsHeader.isDisplayed();
	}
	
	public boolean isResultsChartDisplayed() {
		return resultsChart.isDisplayed();
	}
	
	// Action Methods

	public void enterAge(String currentAge) {
		currentAgeTextBox.sendKeys(currentAge);
	}
	
	public void retirementAgeTextBox(String retireAge) {
		retirementAgeTextBox.sendKeys(retireAge);
	}
	
	public void currentIncomeTextBox(String currentIncome) {
		currentIncomeTextBox.sendKeys(currentIncome);
	}
	
	public void spouseIncomeTextBox(String spouseIncome) {
		spouseIncomeTextBox.sendKeys(spouseIncome);
	}
	
	public void currentSavingsTextBox(String currentSavings) {
		currentSavingsTextBox.sendKeys(currentSavings);
	}
	
	public void retirementSavingsTextBox(String retirementSavings) {
		retirementSavingsTextBox.sendKeys(retirementSavings);
	}
	
	public void rateOfSavingsTextBox(String rateOfSavings) {
		rateOfSavingsTextBox.sendKeys(rateOfSavings);
	}
	
	public void ssnAmountTextBox(String ssnAmount) {
		ssnAmountTextBox.sendKeys(ssnAmount);
	}
	
	public void additionalIncomeTextBox(String additionalIncome) {
		additionalIncomeTextBox.sendKeys(additionalIncome);
	}
	
	public void retirementDurationTextBox(String retirementDuration) {
		retirementDurationTextBox.sendKeys(retirementDuration);
	}
	
	public void expectedInflationRateTextBox(String expectedInflationRate) {
		expectedInflationRateTextBox.sendKeys(expectedInflationRate);
	}
	
	public void retirementAnnualIncomeTextBox(String retirementAnnualIncome) {
		retirementAnnualIncomeTextBox.sendKeys(retirementAnnualIncome);
	}
	
	public void preRetirementROITextBox(String preROI) {
		preRetirementROITextBox.sendKeys(preROI);
	}
	
	public void postRetirementROITextBox(String postROI) {
		postRetirementROITextBox.sendKeys(postROI);
	}
	
	
	
	//Click Actions
	
	public void calculateButton() {
		calculateButton.click();
	}
	
	public void clearFormButton() {
		clearFormButton.click();
	}
	
	public void yesOption() {
		yesOption.click();
	}
	
	public void noOption() {
		noOption.click();
	}
	
	public void singleOption() {
		singleOption.click();
	}
	
	public void marriedOption() {
		marriedOption.click();
	}
	
	public void defaultValuesLink() {
		defaultValuesLink.click();
	}
	
	public void saveChangesButton() {
		saveChangesButton.click();
	}
	
	public void includeInflationButton() {
		includeInflationButton.click();
	}

}
