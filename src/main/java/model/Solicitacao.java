package model;

public class Solicitacao {
    
    String nomeProjeto;
    String descricaoProjeto;
    String nomeSolicitande;
    String nomeProfessorResponsavel;
    String Prazo;
    
    public String getnomeProjeto(){
        return nomeProjeto;
    }
    
    public void setnomeProjeto(String nomeProjeto){
        this.nomeProjeto = nomeProjeto;
    }
    
     public String getdescricaoProjeto(){
        return descricaoProjeto;
    }
    
    public void setdescricaoProjeto(String descricaoProjeto){
        this.descricaoProjeto = descricaoProjeto;
    }
    
    public String getnomeSolicitande(){
        return nomeSolicitande;
    }
    
    public void setnomeSolicitande(String nomeSolicitande){
        this.nomeSolicitande = nomeSolicitande;
    }
    
     public String getnomeProfessorResponsavel(){
        return nomeProfessorResponsavel;
    }
    
    public void setnomeProfessorResponsavel(String nomeProfessorResponsavel){
        this.nomeProfessorResponsavel = nomeProfessorResponsavel;
    }
    
    public String getPrazo(){
        return Prazo;
    }
    
    public void setPrazo(String Prazo){
        this.Prazo = Prazo;
    }
    
}
