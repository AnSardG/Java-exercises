import java.io.*;
public class Leer
{
  public static String dato()
  {
    String sdato = "";
    try
    {
      // Definir un flujo de caracteres de entrada: flujoE
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader flujoE = new BufferedReader(isr);
      // Leer. La entrada finaliza al pulsar la tecla Entrar
      sdato = flujoE.readLine();
    }
    catch(IOException e)
    {
      System.err.println("Error: " + e.getMessage());
    }
    return sdato; // devolver el dato tecleado
  }
  public static char datoChar(){
   
	try{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader flujoE = new BufferedReader(isr);
		char ch=(char)flujoE.read();
		return ch;
	}catch(IOException e){
		System.out.println("Error");
		return datoChar();
	}
   }
  
  public static short datoShort()
  {
    try
    {
      String sdato = dato();
      if (sdato == null)
      {
        System.out.println();
        return Short.MIN_VALUE;
      }
      else
        return Short.parseShort(sdato);
    }
    catch(NumberFormatException e)
    {
      System.out.print("Ese dato no es válido. Teclee otro: ");
      return datoShort();
    }
  }
  
  public static int datoInt()
  {
    try
    {
      String sdato = dato();
      if (sdato == null)
      {
        System.out.println();
        return Integer.MIN_VALUE;
      }
      else
        return Integer.parseInt(sdato);
    }
    catch(NumberFormatException e)
    {
      System.out.print("Ese dato no es válido. Teclee otro: ");
      return datoInt();
    }
  }
  
  public static long datoLong()
  {
    try
    {
      String sdato = dato();
      if (sdato == null)
      {
        System.out.println();
        return Long.MIN_VALUE;
      }
      else
        return Long.parseLong(sdato);
    }
    catch(NumberFormatException e)
    {
      System.out.print("Ese dato no es válido. Teclee otro: ");
      return datoLong();
    }
  }
  
  public static float datoFloat()
  {
    try
    {
      String sdato = dato();
      if (sdato == null)
      {
        System.out.println();
        return Float.NaN; // No es un Número; valor float.
      }
      else
      {
        Float f = new Float(sdato);
        return f.floatValue();
      }
    }
    catch(NumberFormatException e)
    {
      System.out.print("Ese dato no es válido. Teclee otro: ");
      return datoFloat();
    }
  }

  public static double datoDouble()
  {
    try
    {
      Double d = new Double(dato());
      return d.doubleValue();
    }
    catch(NumberFormatException e)
    {
      System.out.print("Ese dato no es válido. Teclee otro: ");
      return datoDouble();
    }
    catch(NullPointerException e)
    {
      return Double.NaN; // No es un Número; valor double.
    }
  }
}
