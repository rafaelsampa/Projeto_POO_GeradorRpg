package controller;

import view.FichaGUI;
import model.Ficha;
import model.FichaModeL;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FichaController {

    private Ficha NovaFicha; // Model object
    private FichaGUI NovaFichaGUI; // View Object

    public FichaController(Ficha NovaFicha, FichaGUI NovaFichaGUI){
        this.NovaFicha = NovaFicha;
        this.NovaFichaGUI = NovaFichaGUI;
    }

    public void itemSelecionado(ItemEvent x){
        if(x.getStateChange() == ItemEvent.SELECTED){
            
            String itemSelecionado = (String) x.getItem();
            System.out.println("\nFoi selecionado " + itemSelecionado);
            System.out.println( "\n__________________\n");

        }
    }
    
}