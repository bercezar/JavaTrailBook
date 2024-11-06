package edu.POO.Conceitos;

public class VisibilidadeRecursos {
    // Modificadores de acesso: 
    //     Os modificadores de acesso em Java são palavras-chave usadas para definir o nível de acesso que outras classes, métodos e membros podem ter em relação a uma classe ou membro específico.
    
    //     public:
    //         Visibilidade-> Acessível de qualquer lugar.

    //         Classes-> Quando uma classe é declarada como public, ela pode ser acessada de qualquer outro pacote.
        
    //     private:
    //         Visibilidade-> Acessível apenas dentro da própria classe.
            
    //         Classes-> O modificador private não pode ser aplicado a classes externas, apenas a classes internas.

    //     protected:
    //         Visibilidade: Acessível dentro do mesmo pacote e em subclasses, mesmo que estas estejam em pacotes diferentes.
            
    //         Classes: O modificador protected não pode ser aplicado diretamente a classes, mas é usado em membros de classe para permitir o acesso controlado.

    //         MELHOR EXPLICAÇÃO->
    //                 Dentro do Mesmo Pacote: Membros com o modificador protected são acessíveis para todas as classes no mesmo pacote. Isso significa que qualquer classe que esteja no mesmo pacote pode acessar esses membros, independentemente de ser uma subclasse ou não.

    //                 Em Subclasses: Além do acesso dentro do mesmo pacote, membros protected também são acessíveis em subclasses, mesmo que essas subclasses estejam em pacotes diferentes. Ou seja, se uma classe A define um método protected, e uma classe B estende A (ou seja, B é uma subclasse de A), B pode acessar o método protected de A mesmo que B esteja em um pacote diferente de A.

    //     default (Sem Modificador):
    //         Visibilidade-> Acessível apenas dentro do mesmo pacote.
            
    //         Classes-> Se uma classe não possui nenhum modificador de acesso, ela é acessível apenas pelas outras classes no mesmo pacote.
}
