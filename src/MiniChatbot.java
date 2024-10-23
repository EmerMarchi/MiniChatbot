import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class MiniChatbot {

    public String inicio(){
        return "MiniChatbot: Olá! Eu sou o MiniChatbot. Como posso te ajudar hoje?";
    }

    private void retornarErro(){
        System.out.println("MiniChatbot: Desculpe, não entendi sua pergunta. Pode reformular?");
    }
    public boolean nome(String respostaUsuario) {
        List<String> perguntasNome = Arrays.asList("qual é o seu nome?", "", "qual o seu nome?", "me diga seu nome", "quem é você?");

        if (perguntasNome.contains(respostaUsuario.toLowerCase())){
            System.out.println("MiniChatbot: Eu sou o MiniChatbot, seu assistente virtual!");
            return true;
        }
        retornarErro();
        return false;
    }

    public boolean saudacao(String respostaUsuario) {
        List<String> saudacoesReconhecidas = Arrays.asList( "ola", "oi", "bom dia", "boa tarde", "boa noite");

        if(saudacoesReconhecidas.contains(respostaUsuario.toLowerCase())){
            System.out.println("MiniChatbot: Olá! Como posso ajudar?");
            return true;
        }

        retornarErro();
        return false;
    }


}
