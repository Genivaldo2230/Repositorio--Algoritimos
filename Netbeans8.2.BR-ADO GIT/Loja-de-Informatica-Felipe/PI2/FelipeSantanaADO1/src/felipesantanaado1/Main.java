
package felipesantanaado1;
public class Main {

    public static void main(String[] args) {
        Formiga formiga = new Formiga();
        formiga.setNome("Smilinguido");
        formiga.setIdade(2);
        formiga.setHiberna(false);
        
        Formiga formiga2 = new Formiga();
        formiga2.setNome("Hova");
        formiga2.setIdade(3);
        formiga2.setHiberna(false);
        
        System.out.println("Formiga nome:"+formiga.getNome()+" idade:"+formiga.getIdade());
        
        System.out.println("Formiga nome:"+formiga2.getNome()+" idade:"+formiga2.getIdade());
        System.out.println("Chegou inverno");
        formiga.inverno();
        formiga2.inverno();
        if (formiga.hiberna && formiga2.hiberna) {
            System.out.println("as formigas hibernaram");
        }
         System.out.println("Chegou verao");
        formiga.verao();
        formiga2.verao();
        if (!formiga.hiberna && !formiga2.hiberna) {
            System.out.println("as formigas acordaram");
        }
    }
    
}
