package calculadora;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

/**
 *
 * @author andreendo
 */
public class SomaSteps {

    Calculadora calc = new Calculadora();
    
    @Given("^que eu entrei (.*) na calculadora$")
    public void que_eu_entrei_na_calculadora(int num) throws Exception {
        calc.entrarNumero01(num);
    }

    @Given("^eu entrei (.*) na calculadora$")
    public void eu_entrei_na_calculadora(int num) throws Exception {
        calc.entrarNumero02(num);
    }

    @When("^eu pressionar add$")
    public void eu_pressionar_add() throws Exception {
        calc.adicionar();
    }

    @Then("^o resultado deve ser (.*)$")
    public void o_resultado_deve_ser(int num) throws Exception {
        int res = calc.getResultado();
        assertEquals(num, res);
    }
}
