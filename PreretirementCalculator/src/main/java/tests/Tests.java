package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import pages.HomePage;

public class Tests extends BaseTestClass {

	SoftAssert softAssert = new SoftAssert();

	List<ArrayList<String>> xlsRowList = new ArrayList<ArrayList<String>>();
	ArrayList<String> xlsRow = new ArrayList<String>();

	@BeforeTest
	public void browserlaunch() {
		BaseTestClass.StartBrowser("Chrome", "https://www.securian.com/insights-tools/retirement-calculator.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

	public void dataSource() throws IOException {

		File file = new File("/Users/chanu/Documents/GitHub/SeleniumFrameWorkDesign/PreretirementCalculator/Data.xls");
		DataFormatter fmt = new DataFormatter();
		FileInputStream inputStream = new FileInputStream(file);
		HSSFWorkbook wb = new HSSFWorkbook(inputStream);
		HSSFSheet sheet = wb.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

		for (int i = 1; i <= rowCount; i++) {
			Row row = sheet.getRow(i);
			xlsRow.clear();
			for (int j = 0; j < row.getLastCellNum(); j++) {
				xlsRow.add(fmt.formatCellValue(row.getCell(j)));
			}

			xlsRowList.add(xlsRow);
		}
	}

	@Test(description = "Verifing all the UI Elements")
	public void UIElementsVerification() {
		HomePage hp = new HomePage(driver);
		softAssert.assertEquals(hp.isSecurianBannerDisplayed(), true);
		softAssert.assertEquals(hp.isSecurianBannerDisplayed(), true);
		softAssert.assertEquals(hp.isFacebookShareButtonDisplayed(), true);
		softAssert.assertEquals(hp.isTwitterShareButtonDisplayed(), true);
		softAssert.assertEquals(hp.isLinkedInShareButtonDisplayed(), true);
		softAssert.assertEquals(hp.isRetirementCalculatorHeaderTextDisplayed(), true);
		softAssert.assertEquals(hp.isInstructionalTextDisplayed(), true);
		softAssert.assertEquals(hp.isAgeLabelDisplayed(), true);
		softAssert.assertEquals(hp.isCurrentAgeQuestionDisplayed(), true);
		softAssert.assertEquals(hp.isRetirementAgeQuestionDisplayed(), true);
		softAssert.assertEquals(hp.isIncomeSavingsLabelDisplayed(), true);
		softAssert.assertEquals(hp.isCurrentIncomeQuestionDisplayed(), true);
		softAssert.assertEquals(hp.isSpouseIncomeQuestionDisplayed(), true);
		softAssert.assertEquals(hp.isCurrentSavingsQuestionDisplayed(), true);
		softAssert.assertEquals(hp.isRetirementSavingsQuestionDisplayed(), true);
		softAssert.assertEquals(hp.isRateOfSavingsQuestionDisplayed(), true);
		softAssert.assertEquals(hp.isSSNLabelDisplayed(), true);
		softAssert.assertEquals(hp.isSSNQuestionDisplayed(), true);
		softAssert.assertEquals(hp.isCalculateButtonDisplayed(), true);
		softAssert.assertEquals(hp.isClearFormButtonDisplayed(), true);
		softAssert.assertEquals(hp.isMaritalQuestionDisplayed(), true);
		softAssert.assertEquals(hp.isSSNAmountOverrideQuestionDisplayed(), true);

	}

	@Test(description = "Entering Data Values")
	public void enterDataValues() throws IOException {
		HomePage hp2 = new HomePage(driver);
		dataSource();
		xlsRowList.forEach((xlsRowValues) -> {
			hp2.enterAge(xlsRowValues.get(0));
			hp2.retirementAgeTextBox(xlsRowValues.get(1));
			hp2.currentIncomeTextBox(xlsRowValues.get(2));
			hp2.spouseIncomeTextBox(xlsRowValues.get(3));
			hp2.currentSavingsTextBox(xlsRowValues.get(4));
			hp2.retirementSavingsTextBox(xlsRowValues.get(5));
			hp2.rateOfSavingsTextBox(xlsRowValues.get(6));
			hp2.yesOption();
			hp2.marriedOption();
			hp2.ssnAmountTextBox(xlsRowValues.get(7));
			hp2.defaultValuesLink();
			hp2.additionalIncomeTextBox(xlsRowValues.get(8));
			hp2.retirementDurationTextBox(xlsRowValues.get(9));
			hp2.includeInflationButton();
			hp2.expectedInflationRateTextBox(xlsRowValues.get(10));
			hp2.retirementAnnualIncomeTextBox(xlsRowValues.get(11));
			hp2.preRetirementROITextBox(xlsRowValues.get(12));
			hp2.postRetirementROITextBox(xlsRowValues.get(13));
			hp2.saveChangesButton();
			hp2.calculateButton();
			timeouts(100);
			softAssert.assertEquals(hp2.isResultsHeaderDisplayed(), true);
			softAssert.assertEquals(hp2.isResultsChartDisplayed(), true);
		});
	}
	
	public void timeouts(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}

}
