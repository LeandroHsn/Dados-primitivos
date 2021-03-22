public class Principal {
    public static void main(String[] args) throws Exception {

        Pessoa pessoa = new Pessoa();

        System.out.println(pessoa.getIdade());

        pessoa.definirIdade(50);

        if (pessoa.getIdade() <= 127){
           System.out.println(pessoa.getIdade());
        } else {
            System.out.println(pessoa.getIdadeAvancada()); 
            pessoa.setIdadeAvancada((short) 0);
        }

        pessoa.definirIdade(150);       
        
        if ((pessoa.getIdade() <= 127) && (pessoa.getIdadeAvancada() <= 127)){
            System.out.println(pessoa.getIdade());            
         } else {
             System.out.println(pessoa.getIdadeAvancada()); 
             pessoa.setIdadeAvancada((short) 0);
         }
       
        pessoa.definirIdade(22);       
        
        if ((pessoa.getIdade() <= 127) && (pessoa.getIdadeAvancada() <= 127)){
            System.out.println(pessoa.getIdade());
         } else {
             System.out.println(pessoa.getIdadeAvancada()); 
             pessoa.setIdadeAvancada((short) 0);
         }
       

         System.out.println("A pessoa é do sexo: " + pessoa.getSexoF());
         System.out.println("A pessoa é do sexo: " + pessoa.getSexoM());

         System.out.println("O valor máximo positivo do int é: " + pessoa.getLimitesDoIntPositivo());
         System.out.println("O valor máximo negativo do int é: " + pessoa.getLimitisDoIntNegativo());

         System.out.println("O valor máximo positivo do long é: " + pessoa.getLimitisDolongPositivo());
         System.out.println("O valor máximo negativo do long é: " + pessoa.getLimitisDolongNegativo());

         pessoa.setIdadeComMes(25.5f);
         System.out.println("A idade da pessoa com mês é " + pessoa.getIdadeComMes() + " anos.");
         pessoa.setIdadeComMes(35.5f);
         System.out.println("A idade da pessoa com mês é " + pessoa.getIdadeComMes() + " anos.");


         pessoa.setPeso(50.30);
         System.out.println("O peso da pessoa é de: " + pessoa.getPeso());

         pessoa.setPeso(80.30);
         System.out.println("O peso da pessoa é de: " + pessoa.getPeso());

         pessoa.setEstaVivo(false);

         if (pessoa.getEstaVivo() == true){
             System.out.println("A pessoa está viva!");
         } else {
             System.out.println("A pessoa está morta");
         } 

         pessoa.setEstaVivo(true);

         if (pessoa.getEstaVivo() == true){
             System.out.println("A pessoa está viva!");
         } else {
             System.out.println("A pessoa está morta");
         } 

    }
}
