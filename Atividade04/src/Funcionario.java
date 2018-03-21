
class Funcionario {

    String nome;
    String email;
    double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Funcionario(String nome, String email, double salario, String cargo) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
        this.cargo = cargo;
    }
    String cargo;
    
    
    
    double calcSalario() {
        if(salario == 0)
            throw new IllegalArgumentException("Você não pode trabalhar de graça.");
        if(salario < 0)
            throw new IllegalArgumentException("Você não pode pagar para trabalhar");
        if(cargo == "DESENVOLVEDOR") {
            if(salario >= 3000)    
                return salario * 0.8;
            else
                return salario * 0.9;
        }
        if(cargo == "DBA") {
            if(salario >= 2000)
                return salario * 0.75;
            else
                return salario * 0.85;
        }
        if(cargo == "TESTADOR") {
            if(salario >= 2000)
                return salario * 0.75;
            else
                return salario * 0.85;
        }
        if(cargo == "GERENTE") {
            if(salario >= 2000)
                return salario * 0.70;
            else
                return salario * 0.80;
        }
        return 0;
    }
    
    
}
