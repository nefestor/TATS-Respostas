
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nefestor
 */
class SistemaFinanceiro {

    ArrayList<Proposta> gerarPropostas(double d, double d0) {
	ArrayList<Proposta> propostas = new ArrayList<>();
	Proposta p1 = new Proposta();
	p1.setValorTotal(2000.0);
	p1.setNumeroDeParcelas(2);
	p1.setValorDaParcela(1000.0);
	propostas.add(p1);
	
	Proposta p2 = new Proposta();
	p1.setValorTotal(2000.0);
	p1.setNumeroDeParcelas(3);
	p1.setValorDaParcela(2000.0/3);
	propostas.add(p1);
	
	return propostas;
    }
    
}
