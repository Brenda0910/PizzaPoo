import java.util.*;
public class Adicionais {
    private ArrayList <Pizza> pizzas = new ArrayList<Pizza>();
    private double ValorTotal=0;

    public void addPizza(Pizza pi){
        if (pi.getIngrediente().isEmpty()){
           ValorTotal=25;
        }else{
            ValorTotal= (25+4);
        }
    }

    public double ValorTotal (){
        for (int i=0;i<pizzas.size ();i++){
            ValorTotal += pizzas ();
        }

        return ValorTotal;
    }
}
