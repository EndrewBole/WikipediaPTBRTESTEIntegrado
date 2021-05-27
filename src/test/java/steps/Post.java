package steps;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertTrue;

public class Post extends Base {

    private Base base;

    public Post(Base base){
        this.base = base;
    }

    @Dado("^que acesso a Wikipedia em Portugues$")
    public void que_acesso_a_Wikipedia_em_Portugues()  {
        base.driver.get(url);
    }

    @Quando("^pesquiso por \"([^\"]*)\"$")
    public void pesquiso_por(String produto){
        base.driver.findElement(By.id("searchInput")).sendKeys(produto + Keys.ENTER);
    }

    @Entao("^exibe a expressao \"([^\"]*)\" no titulo da guia$")
    public void exibeAExpressaoNoTituloDaGuia(String produto){
        assertTrue(base.driver.getTitle().contains(produto));
    }
}