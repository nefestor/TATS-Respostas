/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nefestor
 */
public class SistemaFinanceiroTest {
    
    public SistemaFinanceiroTest() {
	
    }
    
    @Test
    public void testeFaixaAte1000(){
	SistemaFinanceiro sist = new SistemaFinanceiro();
	ArrayList<Proposta> propostas =  sist.gerarPropostas(500.0, 1000.0);
	assertEquals(2, propostas.size());
	
	Proposta p1 = propostas.get(0);
	assertEquals(2 * 1000.0, p1.getValorTotal(), 0.0000001);
	assertEquals(2, p1.getNumeroDeParcelas());
	assertEquals(2000.0/2, p1.getValorDaParcela(), 0.0000001);
	
	Proposta p2 = propostas.get(0);
	assertEquals(2 * 1000.0, p2.getValorTotal(), 0.0000001);
	assertEquals(3, p1.getNumeroDeParcelas());
	assertEquals(2000.0/3, p2.getValorDaParcela(), 0.0000001);
    }
    
    @Test
    public void testeFaixaDe1001Ate5000reais() {
	SistemaFinanceiro sist = new SistemaFinanceiro();
	ArrayList<Proposta> propostas =  sist.gerarPropostas(2000.0, 1000.0);
	assertEquals(3, propostas.size());
	
	Proposta p1 = propostas.get(0);
	assertEquals(1.3 * 1000.0, p1.getValorTotal(), 0.0000001);
	assertEquals(2, p1.getNumeroDeParcelas());
	assertEquals(1.3 * 1000.0/2, p1.getValorDaParcela(), 0.0000001);
    
	Proposta p2 = propostas.get(1);
	assertEquals(1.5 * 1000.0, p2.getValorTotal(), 0.0000001);
	assertEquals(4, p2.getNumeroDeParcelas());
	assertEquals(1.5 * 1000.0/4, p2.getValorDaParcela(), 0.000001);
	
	Proposta p3 = propostas.get(2);
	assertEquals(1.5 * 1000.0, p3.getValorTotal(), 0.0000001);
	assertEquals(10, p2.getNumeroDeParcelas());
	assertEquals(1.5 * 1000.0/10, p3.getValorDaParcela(), 0.000001);
    }
}
