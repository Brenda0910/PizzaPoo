import java.util.*;
public class Pizza{
    public static float TotalIngredi = 0;
    private ArrayList <String> Ingredientes= new ArrayList<String>();
    public static Map <String,Integer> catalagoIngredientes = new HashMap<String,Integer>();
	double ValorTotal=0;

    // Metodo para retornar ingredientes. Necessario para checagem da classe
    public ArrayList<String> getIngrediente()
	{
		return Ingredientes;
	}
    
    public static Map<String, Integer>  getListaIngredientes()
	{
		return catalagoIngredientes;
	}

    public void AdicionarIngrediente (String ingrediente)
	{
		this.Ingredientes.add(ingrediente);
	}

    public double getValorTotal(){
        if (Ingredientes.size()<=2){
            ValorTotal = (25+4);
        }else if (Ingredientes.size()>=3 && Ingredientes.size()<=5){
            ValorTotal = (25+16);
        }else if (Ingredientes.size()>5){
            ValorTotal = (25+30);
        }
        return ValorTotal;
    }

    public static void contabilizaIngrediente(String Ingredientes)
	{
		if (catalagoIngredientes.containsKey(Ingredientes))
		{
			int value = catalagoIngredientes.get(Ingredientes);
			catalagoIngredientes.put(Ingredientes, value+1);	
			}
		else
		{
			catalagoIngredientes.put(Ingredientes, 1);
		}
				 
	}


}
