public class SwitchCase {
    public static void main(String[] args) {
        int diaDasemana=4;
        String nomeDoDia;
        switch(diaDasemana){
            case 1:nomeDoDia="domingo";break;
            case 2:nomeDoDia="segunda";break;
            case 3:nomeDoDia="terça";break;
            case 4:nomeDoDia="quarta";break;
            case 5:nomeDoDia="quinta";break;
            case 6:nomeDoDia="sexta";break;
            case 7:nomeDoDia="sabado";break;
            default:nomeDoDia="dia invalido";
            }
        System.out.println(nomeDoDia);

    }
}