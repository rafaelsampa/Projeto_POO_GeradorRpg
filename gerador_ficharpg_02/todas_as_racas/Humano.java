package gerador_ficharpg_02.todas_as_racas;

import gerador_ficharpg_02.infos_person.racas; // Pega racas da pasta infos_person

public class Humano extends racas  {
    int modAtri = 1;
    int pontosdevida = 10; // BASE: um 1d10 + modCON
    boolean[] proficiencias;
    boolean profArmasSimples = true; // todo true = todas, e false = nenhuma.
    boolean profArmasMarciais = true;
    boolean profArmaduras = true;
    boolean profEscudos = true;
    boolean profFerramentas = false; 
    
    // Metodos GET
    public int getModHumano(int atributo){
        return atributo + modAtri;
    }
    public int getPVHumano(int PV){
        return pontosdevida; // + modificador de CON
    }
    public boolean[] getProficiencias(boolean[] prof){
        
        return proficiencias;
    }

}