public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 0;

    public void ligarDesligar(){
        if (this.ligada){
            this.ligada = false;
        } 
        else{
            this.ligada = true;
        }   
    }

    public void aumentarVolume(){
        if (this.volume < 100 && this.ligada){
            this.volume++;
        }
    }
    
    public void diminuirVolume(){
        if (this.volume > 0 && this.ligada){
            this.volume--;
        }
    }

    public void escolherCanal(int canal){
        this.canal = canal;
    }
}
