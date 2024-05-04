public class PlanoOperadora2 {
    public static void main(String[] args) {
        String plano = "M"; //M / T

        switch (plano) {

            case"B":{
                System.out.println("100 minutos de ligação ");
                break;
            }
            case"M":{
                System.out.println("100 minutos de ligação + Whats e Instagram gratis !!");
                break;
            }
            case"T": {
                System.out.println("100 minutos de ligação + Whats e Instagram gratis + 5Gb Youtube");
                break;
            }
            default:
                System.out.println("Plano inexistente");
        }
    }
}
