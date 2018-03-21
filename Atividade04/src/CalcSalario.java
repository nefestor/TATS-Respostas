/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiago
 */
public class CalcSalario {

    Funcionario asa;
     
    public CalcSalario(Funcionario asa) {
        this.asa = asa;
    }
    
    double calcSalario() {
        if(asa.salario == 0)
            throw new IllegalArgumentException("Você não pode trabalhar de graça.");
        if(asa.salario < 0)
            throw new IllegalArgumentException("Você não pode pagar para trabalhar");
        if(asa.cargo == "")
            throw new IllegalArgumentException("Você não pode ficar sem cargo na empresa");
        if(asa.email == "")
            throw new IllegalArgumentException("Você precisa de um e-mail para trabalhar");
        if(asa.cargo == "DESENVOLVEDOR") {
            if(asa.salario >= 3000)    
                return asa.salario * 0.8;
            else
                return asa.salario * 0.9;
        }
        if(asa.cargo == "DBA") {
            if(asa.salario >= 2000)
                return asa.salario * 0.75;
            else
                return asa.salario * 0.85;
        }
        if(asa.cargo == "TESTADOR") {
            if(asa.salario >= 2000)
                return asa.salario * 0.75;
            else
                return asa.salario * 0.85;
        }
        if(asa.cargo == "GERENTE") {
            if(asa.salario >= 2000)
                return asa.salario * 0.70;
            else
                return asa.salario * 0.80;
        }
        return 0;
    }
}
