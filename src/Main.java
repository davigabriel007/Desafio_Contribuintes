import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Quantos contribuintes você irá digitar?");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.println("Digite os dados do " + (i + 1) + " contribuinte: ");
            System.out.print("Renda anual com salário:");
            double salaryIncome = sc.nextDouble();
            System.out.print("Renda anual com prestação de serviço:");
            double servicesIncome = sc.nextDouble();
            System.out.print("Renda anual com ganho de capital:");
            double capitalIncome = sc.nextDouble();
            System.out.print("Gastos médicos:");
            double healthSpending = sc.nextDouble();
            System.out.print("Gastos Educacionais:");
            double educationSpending = sc.nextDouble();

            TaxPayer taxPayer = new TaxPayer(salaryIncome, capitalIncome, servicesIncome, healthSpending, educationSpending);
            list.add(taxPayer);
        }
        int i = 1;
        for (TaxPayer taxPayer : list) {
            System.out.println("Resumo do " + (i) + " o contribuinte:");
            System.out.printf("Imposto bruto total: %.2f\n", taxPayer.grossTax());
            System.out.printf("Abatimento: %.2f\n", taxPayer.taxRebate());
            System.out.printf("Imposto devido: %.2f\n", taxPayer.netTax());
            System.out.println("---------------------------------------");
            i++;
        }

    }
}