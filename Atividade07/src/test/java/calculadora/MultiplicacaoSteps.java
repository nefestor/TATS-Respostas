package calculadora;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

/**
 *
 * @author nefestor
 */
public class SubtracaoSteps {

  Calculadora calc = new Calculadora();

  @Given("^que eu entrei com (.*)$")
  public void que_eu_entrei_com(int num) throws Exception {
      calc.entrarNumero01(num);
  }

  @Given("^entrei com(.*)$")
  public void entrei_com(int num) throws Exception {
      calc.entrarNumero02(num);
  }

  @When("^eu pressionei multiplicar$")
  public void eu_pressionei_multiplicar() throws Exception {
      calc.multiplicar();
  }

  @Then("^o resultado da subtracao deve ser (.*)$")
  public void o_resultado_da_multiplicacao_deve_ser(int num) throws Exception {
      int res = calc.getResultado();
      assertEquals(num, res);
  }

}
