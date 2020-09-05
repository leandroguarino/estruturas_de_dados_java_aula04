package aula03_lista_ligada;

public class Programa {
    public static void main(String[] args) {
        
        ListaLigada lista = new ListaLigada();
        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("DF");
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("Último: " + lista.getUltimo().getValor());
        
        for(int i=0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
        
        //remover estado DF
        lista.remover("DF");
        System.out.println("Removeu estado DF");
        lista.adicionar("SP");
        System.out.println("Adicionou estado SP");
        lista.remover("BA");
        lista.remover("CE");
        lista.remover("AC");
        lista.remover("SP");
        lista.adicionar("RJ");
        
        System.out.println("Tamanho: " + lista.getTamanho());
        for(int i=0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
        
    }
}
