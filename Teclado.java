import java.io.*;

/** Classe que permite fazer leitura de dados do teclado, com m�todos est�ticos.
 *  Iso significa que n�o h� necessidade de instanciar um objeto para invocar os m�todos.
 *  Sintaxe p/ chamada: <nome_da_classe>.<nome_do_m�todo>(<mensagem de solicita��o>)
 *  Exemplo de chamada: Teclado.leInt("Digite um n�mero inteiro")
 */ 

public class Teclado
{
     private static String s;
     private static InputStreamReader i = new InputStreamReader (System.in);
     private static BufferedReader d = new BufferedReader(i);

     
     /**
        L� um inteiro, exibindo na tela uma mensagem de solicita��o.
        @return int
     */
     public static int leInt (String msg)
     {   int a = 0;
         System.out.print(msg);
         try
         {
             s = d.readLine();
             a = Integer.parseInt(s);
         }
         catch (IOException e)
         {
             System.out.println ("Erro de I/O: "+e );
         }
         catch (NumberFormatException e)
         {
             System.out.println ("o valor digitado deve ser inteiro: "+e );
         }
         return (a);
     }
     
     /**
        L� um double, exibindo na tela uma mensagem de solicita��o.
        @return double
     */
     public static double leDouble(String msg)
     {   double a = 0;
         System.out.print(msg);
         try
         {
             s = d.readLine();
             a = Double.parseDouble(s);
         }
         catch (IOException e)
         {
             System.out.println ("Erro de I/O: " + e);
         }
         catch (NumberFormatException e)
         {
             System.out.println ("o valor digitado deve ser numero: "+e );
         }
         return (a);
     }
     
     /**
        L� um string, exibindo na tela uma mensagem de solicita��o.
        @return String
     */
     public static String leString(String msg)
     {   s = "";
         System.out.print(msg);
         try
         {
            s = d.readLine();
         }
         catch (IOException e)
         {
            System.out.println ("Erro de I/O: " + e);
         }
         return (s);
     }
    
     /**
        L� um caractere exibindo na tela uma mensagem de solicita��o.
        @return Char
     */
     public static Character leChar(String msg)
     {   s = "";
         System.out.print(msg);
         try
         {
            s = d.readLine();
         }
         catch (IOException e)
         {
            System.out.println ("Erro de I/O: " + e);
         }
         return (s.charAt(0));
     }

     
     /**
        L� um booleano exibindo na tela uma mensagem de solicita��o.
        @return boolean
     */
     public static boolean leBoolean(String msg)
     {   boolean b = false;
         s = "";
         System.out.print(msg);
         try
         {
            s = d.readLine();
            b = Boolean.parseBoolean(s);
         }
         catch (IOException e)
         {
            System.out.println ("Erro de I/O: " + e);
         }
         return (b);
     }

}//fim da classe


