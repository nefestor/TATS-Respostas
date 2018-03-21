
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SalarioTeste {

    public SalarioTeste() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void salarioDev() {
        Funcionario asa = new Funcionario("Tiago", "tiago@email.com", 5000.0, "DESENVOLVEDOR");
        assertEquals(4000.0, asa.calcSalario(), 0.00001);

    }

    @Test
    public void salarioDba() {
        Funcionario asa = new Funcionario("Tiago", "tiago@email.com", 5000.0, "DBA");
        assertEquals(3750.0, asa.calcSalario(), 0.00001);
    }

    @Test
    public void salarioTestador() {
        Funcionario asa = new Funcionario("Tiago", "tiago@email.com", 5000.0, "TESTADOR");
        assertEquals(3750.0, asa.calcSalario(), 0.00001);
    }
    @Test
    public void salarioGerente() {
        Funcionario asa = new Funcionario("Tiago", "tiago@email.com", 5000.0, "GERENTE");
        assertEquals(3500.0, asa.calcSalario(), 0.00001);
    }
    @Test(expected = IllegalArgumentException.class)
    public void salarioVazio() {
        Funcionario asa = new Funcionario("Tiago", "tiago@email.com", 0.0, "GERENTE");
        asa.calcSalario();
    }
    @Test(expected = IllegalArgumentException.class)
    public void salarioNegativo() {
        Funcionario asa = new Funcionario("Tiago", "tiago@email.com", -10.0, "GERENTE");
        asa.calcSalario();
    }
}
