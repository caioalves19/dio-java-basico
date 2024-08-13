public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        smartTv.ligarDesligar();
        smartTv.escolherCanal(12);

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("TV canal: " + smartTv.canal);
        System.out.println("TV volume: " + smartTv.volume);
    }
}
