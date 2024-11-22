package br.com.curso.model;

import java.text.ParseException;

public class Docente extends Pessoa{
    private int idDocente;
    private int numeroMatricula;
    private String situacao;

    public Docente(int idDocente, int numeroMatricula, String situacao, int idPessoa, String nomePessoa, String contato) {
        super(idPessoa, nomePessoa, contato);
        this.idDocente = idDocente;
        this.numeroMatricula = numeroMatricula;
        this.situacao = situacao;
    }
    
    public static Docente docenteVazio() throws ParseException{
        Docente oDocente = new Docente(0, 0, "A", 0, "", "");
        return  oDocente;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    
}
