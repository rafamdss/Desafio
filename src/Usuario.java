public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual :" + smartTv.volume);




        System.out.println("Tv ligada : " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual :" + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual : " + smartTv.canal);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal atual : " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal atual : " + smartTv.canal);

        smartTv.ligar();
        System.out.println("Novo status -> Tv Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> Tv desligada ? " + smartTv.ligada);





    }
}