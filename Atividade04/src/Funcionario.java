
class Funcionario {

    String nome;
    String email;
    double salario;
    String cargo;
    
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
}
