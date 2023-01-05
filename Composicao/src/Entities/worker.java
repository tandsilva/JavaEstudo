package Entities;

import Entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class worker {
    private System name;
    private WorkerLevel level;

    private Double baseSalary;
//para realizar uma associacao ente as classes
    private Departament departament;
//como o relacionamento eh de um para muitos foi usada uma lista
    //a lista esta incluida no construtor por ser uma relacao (tem muitos)
    private List<HourContract> contracts = new ArrayList<>();

    public worker() {
    }

    public worker(System name, WorkerLevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;

    }

    public System getName() {
        return name;
    }

    public void setName(System name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

//    public void setContracts(List<HourContract> contracts) {
//        this.contracts = contracts;
//    }
    //metodo que adiciona o contrato que veio como argumento
    public void addContract(HourContract contract){
        contracts.add(contract);
    }
    public void RemoveContract(HourContract contract){
        contracts.remove(contract);
    }
    public double income(int year,int month){
        double soma = baseSalary;
        Calendar cal = Calendar.getInstance();

        for (HourContract c: contracts) {

            //para cada instancia do contrato chamado c sera setada a hora do contrato
           //defini a data do meu contrato como sendo a data do meu calendario //vai implementar basedo nas datas que nos colocarmos
            cal.setTime(c.getDate());

            int V_year =cal.get(Calendar.YEAR);
            int V_month = 1 +cal.get(Calendar.MONTH);//o mes do callender começa com zero
            //agora nos vamos validar, ta vendo preguiça nao quis fazer facul hahahah
            //brinks vai fazer uma verificação logica usando o operador &&
            if(year == V_year && month == V_month){
                soma=+ c.totalValue();
            }
        }
        return soma;
    }

}
