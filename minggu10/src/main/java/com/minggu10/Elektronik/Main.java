package Elektronik;

public class Main {
    public static void main(String[] args) {
        var indro = new Manusia();
        var tvJadul = new TelevisiJadul();
        var tvModern = new TelevisiModern();

        indro.nyalakanPerangkat(tvJadul);
        System.out.println();
        indro.nyalakanPerangkat(tvModern);
    }
}
