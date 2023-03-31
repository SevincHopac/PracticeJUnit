package practiceJava.practiceAdvanced.practice09.Q05_MaasHesapla_interface;

public class MaasHesapla implements VergiKesintileri, MaasArttiran {

    @Override
    public double yillikExtra(int calismaYili) {
        System.out.println("Yillik Extra : " + calismaYili * 100);
        return calismaYili * 100;
    }

    @Override
    public double saatlikExtra(int calismaSaati) {

        if (calismaSaati > 160) {
            System.out.println("Saatlik extra : "+ (calismaSaati-160) * 10);
            return (calismaSaati-160) * 10;
        }
        return 0;
    }

    @Override
    public double vergi(double brutmaas, int calismayili) {
        double kesinti = 0;

        if (calismayili >= 10) {
            return  brutmaas * 0.3;

        } else {
            return brutmaas * 0.2;
        }
    }

    public double netMaas(double brutMaas,int calismaYili, int calismaSaati ){

        double netMaasi;
        netMaasi= brutMaas+yillikExtra(calismaYili)+saatlikExtra(calismaSaati)-vergi(brutMaas,calismaYili);
        return netMaasi;
    }
}