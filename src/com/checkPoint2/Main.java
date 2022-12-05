package com.checkPoint2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Long cnpj1;

        try {
            System.out.println("Digite o cnpj da Empresa: (Não pode conter mais ou menos de 14 dígitos) ");
            cnpj1 = scanner.nextLong();

            EscritorioContabilidade escritorioContabilidade = new EscritorioContabilidade(cnpj1);


            DepartamentoContabil dpContabil1 = new DepartamentoContabil("Departamento Contábil Zona Sul São Paulo",122548,40000, 350000, 5000, 60000);
            DepartamentoContabil dpContabil2 = new DepartamentoContabil("Departamento Contábil Zona Leste Porto Alegre",253222,3000, 150000, 2510, 25320);

            DepartamentoFiscal dpFiscal1 = new DepartamentoFiscal("Departamento Fiscal Zona Oeste Uberlândia",5558964,150000,0.1,500000);
            DepartamentoFiscal dpFiscal2 = new DepartamentoFiscal("Departamento Fiscal Zona Norte Salvador",5559965,250000.22,0.2,602541);

            DepartamentoLegalizacao dpLegalizacao1 = new DepartamentoLegalizacao("Departamento Legalização Zona Oeste Rio de Janeiro", 8887545, 28895.25, "GameStation Produtos Ltda", LocalDate.of(2002,5,14), 258432154L, 850225.25);
            DepartamentoLegalizacao dpLegalizacao2 = new DepartamentoLegalizacao("Departamento Legalização Zona Leste Bagé", 8885522, 145222.88, "Serviços Eletrônicos Ltda", LocalDate.of(2020, 12, 27), 258432154L, 850225.25);

            escritorioContabilidade.addDepartamentos(dpContabil1);
            escritorioContabilidade.addDepartamentos(dpContabil2);
            escritorioContabilidade.addDepartamentos(dpFiscal1);
            escritorioContabilidade.addDepartamentos(dpFiscal2);
            escritorioContabilidade.addDepartamentos(dpLegalizacao1);
            escritorioContabilidade.addDepartamentos(dpLegalizacao2);

            escritorioContabilidade.calcularCustasTotal();
            escritorioContabilidade.lerDepartamento();

            dpContabil1.calcularAtivo();
            dpContabil2.calcularCustas();

            dpFiscal1.calculaGuias();
            dpFiscal2.calculaGuias();

            dpLegalizacao1.renovacaoAlvaras();
            dpLegalizacao2.renovacaoAlvaras();
            dpLegalizacao2.calcularCustas();


            System.out.println(escritorioContabilidade.getListaDepartamento());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
