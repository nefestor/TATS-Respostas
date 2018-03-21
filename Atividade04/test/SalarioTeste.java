
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
        CalcSalario calculo = new CalcSalario(new Funcionario("Tiago", "tiago@email.com", 5000.0, "DESENVOLVEDOR"));
        assertEquals(4000.0, calculo.calcSalario(), 0.00001);

    }

    @Test
    public void salarioDba() {
        CalcSalario calculo = new CalcSalario(new Funcionario("Tiago", "tiago@email.com", 5000.0, "DBA"));
        assertEquals(3750.0, calculo.calcSalario(), 0.00001);
        
    }

    @Test
    public void salarioTestador() {
        CalcSalario calculo = new CalcSalario(new Funcionario("Tiago", "tiago@email.com", 5000.0, "TESTADOR"));
        assertEquals(3750.0, calculo.calcSalario(), 0.00001);
    }
    @Test
    public void salarioGerente() {
        CalcSalario calculo = new CalcSalario(new Funcionario("Tiago", "tiago@email.com", 5000.0, "GERENTE"));
        assertEquals(3500.0, calculo.calcSalario(), 0.00001);
    }
    @Test(expected = IllegalArgumentException.class)
    public void salarioVazio() {
        CalcSalario calculo = new CalcSalario(new Funcionario("Tiago", "tiago@email.com", 0.0, "GERENTE"));
        calculo.calcSalario();
    }
    @Test(expected = IllegalArgumentException.class)
    public void salarioNegativo() {
        CalcSalario calculo = new CalcSalario(new Funcionario("Tiago", "tiago@email.com", -10.0, "GERENTE"));
        calculo.calcSalario();
    }
    @Test(expected = IllegalArgumentException.class)
    public void cargoVazio() {
        CalcSalario calculo = new CalcSalario(new Funcionario("Tiago", "tiago@email.com", 3000.0, ""));
        calculo.calcSalario();
    }
    @Test(expected = IllegalArgumentException.class)
    public void emailVazio() {
        CalcSalario calculo = new CalcSalario(new Funcionario("Tiago", "", 3000.0, "TESTADOR"));
        calculo.calcSalario();
    }
    @Test(expected = IllegalArgumentException.class)
    public void cargoInexistente() {
        CalcSalario calculo = new CalcSalario(new Funcionario("Tiago", "tiago@email.com", 3000.0, "GERENTE DE PROJETOS"));
        calculo.calcSalario();
    }
    
}
