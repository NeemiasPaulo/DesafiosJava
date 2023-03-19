package SistemaSmartTv;

public class SmartTv {
    boolean ligado = false;
        int canal = 1;
        int volume = 20;

        public SmartTv() {
        }

        public void ligar() {
            this.ligado = true;
        }

        public void desligar() {
            this.ligado = false;
        }

        public void aumentarVolume() {
            ++this.volume;
        }

        public void diminuirVolume() {
            --this.volume;
        }

        public void subirCanal() {
            ++this.canal;
        }

        public void descerCanal() {
            --this.canal;
        }

        public void mudarCanal(int novoCanal) {
            this.canal = novoCanal;
        }
    }
