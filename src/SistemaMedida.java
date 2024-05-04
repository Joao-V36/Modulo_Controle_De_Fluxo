public class SistemaMedida {
    public static void main(String[] args) {
        //Switch caso com If , Else if , Else
        String sigla = "A";

        if (sigla == "P"){
            System.out.println("Pequeno");
        }
        else if (sigla == "M") {
            System.out.println("Medio");
        }
        else if (sigla == "G") {
            System.out.println("Grande");
        }
        else{
            System.out.println("INDEFINIDO");
        }
    }
}
