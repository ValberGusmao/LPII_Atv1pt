package controller;

import model.Registro;

import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;

public class Operacao {
    private Hashtable<Date, ArrayList<Registro>> registros;
    private ArrayList<Date> datas;

    public Operacao() {
        this.registros = new Hashtable<>();
        this.datas = new ArrayList<>();
    }

}
