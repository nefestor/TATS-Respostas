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
    public void salario() {
        Funcionario asa = new Funcionario('Tiago', 'tiago@email.com', 5000.0, 'DESENVOLVEDOR');
        assertEquals(4000.0, asa.calcSalario(), 0.00001);
        
        
    }
    
}
