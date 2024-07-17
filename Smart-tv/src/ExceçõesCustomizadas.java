    public class ExceçõesCustomizadas extends Exception {
        static String formatarCep(String cep) throws ExceçõesCustomizadas{
            if(cep.length() != 8)
              throw new ExceçõesCustomizadas();
            
              //simulando um cep formatado
              return "23.765-064";
        }
    }

