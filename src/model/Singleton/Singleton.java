

/*
* singleton
* Usado quando desejo, que uma classe  tenha apenas uma instância na aplicação.abaixo, mostra alguns
* aspectos que devem  serem cuidados ao criar esse padrão.
* --> O construtor da classe  fica  como privado (private ), sendo que não pode ser instanciada para fora da própria
*  classe.
* --> A classe é final, poois  não permite a criação de subclasses da propria classe.
* --> O Acesso é permitido através do método que retorne a instância única da classe, ou faz a criação de uma
* , caso não tenha sido criada
* */

package model.Singleton;
public final class  Singleton {
    private static Singleton singleton;
    private Singleton(){

    }
    public  static Singleton getInstance() {
        if(singleton == null){
            singleton = new Singleton();
        }
         return singleton;
    }
}
