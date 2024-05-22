package rafaativ;
import java.util.ArrayList;
import java.util.Scanner;
public class Empregado{
    private double salario;
    private String nome;
    private int idade;

    Scanner input = new Scanner(System.in);
    public Empregado(String nome, int idade, double salario){
        this.nome = nome;
        if(idade > 14){
            this.idade = idade;
        }
        this.salario = salario;

    }

    public void setEmpregado(String nome, int idade, double salario){
        this.nome = nome;
        if(idade > 14){
            this.idade = idade;
        }
        this.salario = salario;
    }
    public String toString(){
        int idade = getIdade();
        double salario = getSalario();
        String nome = getNome();

        return  nome + " tem " + idade + " anos, e ganha " + salario + " reais.";
    }
    public double getSalario() {
        return this.salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setSalario(double novoSalario) {
        this.salario = novoSalario;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setIdade(int novaIdade) {
        this.idade = novaIdade;
    }

    public void aumentarSalario(double aumentoSalario){
	this.salario = ((salario*aumentoSalario)/100 )+ salario;
	}

    public String promover(){
	if(idade >= 18){
	this.salario = ((salario*25)/100) + salario;
    return "Empregado promovido!";
	}
	else
	return "Empregado menor de idade";
	}

    public String demitir(int motivo) {
        if (motivo == 1) {
            return "Faça um aviso prévio";
        } else if (motivo == 2) {
        double multa;
        multa = ((getSalario() * 40) / 100);
        return "Você terá que pagar a multa de " + multa;
        }
        else if(motivo == 3){
            if(getSalario() >= 1000 && getSalario()<= 2000){
                return "Ele receberá R$1500,00 de salário";
            }
            else if(getSalario() > 2000 && getSalario()<= 3000){
                return "Ele receberá R$2500,00 de salário";
            }
            else if(getSalario() > 3000 && getSalario()<= 4000){
                return "Ele receberá R$3500,00 de salário";
            }
            else if(getSalario() > 4000){
                return "Ele receberá R$4000,00 de salário";
            }
            else{
                return "Salário muito baixo para receber aposentadoria";
            }
        }
        else{
            return "Motivo inválido";
        }
    }
    public void aniversario(){
        int idadeNova = getIdade();
        idadeNova++;
        setIdade(idadeNova);
    }
}
