public class Main {

    public static void main(String[] args) {
        
        Produto produto = new Produto("Carro", 27000, 4);

        //Limpar terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        System.out.println(produto+ "\nValor total do estoque: R$ "+produto.CalcularPrecoTotal());
    }
}