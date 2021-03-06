package steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertTrue;

public class Post extends Base {

    private Base base;

    public Post(Base base){
        this.base = base;
    }

    @Given("^que acesso a Wikipedia em Portugues$")
    public void que_acesso_a_Wikipedia_em_Portugues()  {
        base.driver.get(url);
    }

    @When("^pesquiso por \"([^\"]*)\"$")
    public void pesquiso_por(String produto){
        base.driver.findElement(By.id("searchInput")).sendKeys(produto + Keys.ENTER);
    }

    @Then("^exibe a expressao \"([^\"]*)\" no titulo da guia$")
    public void exibeAExpressaoNoTituloDaGuia(String produto){
        assertTrue(base.driver.getTitle().contains(produto));
    }
}