public class App {
    
    public static void main (String[] args) throws Exception{
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.err.println("O volume atual é de: " + smartTv.volume);



        System.err.println("A televisão está ligada: " + smartTv.ligada);
        System.err.println("Qual é o canal : " + smartTv.canal);
        System.err.println("Qual o volume da televisão: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status - a televisão está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status 1.0 - a televisão está ligada?" + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("AUMENTAR O VOLUME +1 :" + smartTv.volume);

        smartTv.mudarCanal(61);
        System.out.println("O canal atual é: " + smartTv.canal);
    }
}
