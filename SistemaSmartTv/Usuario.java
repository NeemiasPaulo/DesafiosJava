package SistemaSmartTv;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("A TV está " + smartTv.ligado);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);
        smartTv.ligar();
        System.out.println("A TV está " + smartTv.ligado);
        smartTv.diminuirVolume();
        System.out.println("Volume: " + smartTv.volume);
        smartTv.mudarCanal(12);
        System.out.println("Canal: " + smartTv.canal);
    }
}
