public class Pessoa {
    
    private byte idade = 0;

    private char sexoF = 'F';
    private char sexoM = 'M';

    private short  idadeAvancada = 0;                                   

    private int limitesDoIntPositivo = 2147483647;                         
    private int LimitisDoIntNegativo = -2147483648;                       
 
    private long limitisDolongNegativo = -9223372036854775807L;           
    private long limitisDolongPositivo = -9223372036854775808L; 

    private float idadeComMes = 0;                            
   
    private double peso = 0;                        

    private boolean estaVivo = true;      
    
    public void definirIdade (int i){
        if (i > 127){
            setIdadeAvancada((short)i);
        } else {
            setIdade((byte) i);
        }     
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte i) {
        this.idade = i;
    }

    public short getIdadeAvancada(){
        return idadeAvancada;
    }

    public void setIdadeAvancada(short i){
       this.idadeAvancada = i;
    }

    public char getSexoF() {
        return this.sexoF;
    }

    public void setSexoF(char sexoF) {
        this.sexoF = sexoF;
    }

    public char getSexoM() {
        return this.sexoM;
    }

    public void setSexoM(char sexoM) {
        this.sexoM = sexoM;
    }

    public int getLimitesDoIntPositivo() {
        return this.limitesDoIntPositivo;
    }

    public void setLimitesDoIntPositivo(int limitesDoIntPositivo) {
        this.limitesDoIntPositivo = limitesDoIntPositivo;
    }

    public int getLimitisDoIntNegativo() {
        return this.LimitisDoIntNegativo;
    }

    public void setLimitisDoIntNegativo(int LimitisDoIntNegativo) {
        this.LimitisDoIntNegativo = LimitisDoIntNegativo;
    }

    public long getLimitisDolongNegativo() {
        return this.limitisDolongNegativo;
    }

    public void setLimitisDolongNegativo(long limitisDolongNegativo) {
        this.limitisDolongNegativo = limitisDolongNegativo;
    }

    public long getLimitisDolongPositivo() {
        return this.limitisDolongPositivo;
    }

    public void setLimitisDolongPositivo(long limitisDolongPositivo) {
        this.limitisDolongPositivo = limitisDolongPositivo;
    }

    public float getIdadeComMes() {
        return this.idadeComMes;
    }

    public void setIdadeComMes(float idadeComMes) {
        this.idadeComMes = idadeComMes;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isEstaVivo() {
        return this.estaVivo;
    }

    public boolean getEstaVivo() {
        return this.estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }
    

}
