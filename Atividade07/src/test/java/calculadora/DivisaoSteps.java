package calculadora;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

/**
 *
 * @author andreendo
 */
public class DivisaoSteps {

    Calculadora c = new Calculadora();

    @Given("^que eu entrei com (\\d+)$")
    public void que_eu_entrei_com(int num) throws Exception {
        c.entrarNumero01(num);
    }

    @Given("^entrei com (\\d+)$")
    public void entrei_com(int num) throws Exception {
        c.entrarNumero02(num);
    }

    @When("^eu pressionei dividir$")
    public void eu_pressionei_dividir() throws Exception {
        c.dividir();
    }

    @Then("^o resultado da divisao deve ser (\\d+)$")
    public void o_resultado_da_divisao_deve_ser(int num) throws Exception {
        int res = c.getResultado();
        assertEquals(num, res);
    }

    @Then("^o resultado da divisao dever ser um numero negativo$")
    public void o_resultado_da_divisao_dever_ser_um_numero_negativo() throws Exception {
        int res = c.getResultado();
        assertTrue(res < 0);
    }

    @Then("^a mensagem \"([^\"]*)\" deve aparecer$")
    public void a_mensagem_deve_aparecer(String msg) throws Exception {
        assertEquals(msg, c.getMensagem());
    }
}