public class PlanoOperadora {
    //Switch case com If, Else if , Else
    public static void main(String[] args) {
        String plano = "A"; //M / T

        if(plano == "B"){
            System.out.println("100 minutos de ligação ");
        }
        else if (plano == "M") {
            System.out.println("100 minutos de ligação + Whats e Instagram gratis !!");
        }
        else if (plano == "T") {
            System.out.println("100 minutos de ligação + Whats e Instagram gratis + 5Gb Youtube");
        }
        else{
            System.out.println("Plano inexistente");
        }
    }
}
