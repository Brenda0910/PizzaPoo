public  class  PizzaTeste {

	public  static  void  principal ( String [] args ) {

		Pizza  p1 = nova  Pizza ();
		Pizza  p2 = nova  Pizza ();
		Pizza  p3 = nova  Pizza ();
		
		// Cria 3 pizzas com ingredientes diferentes
		p1 . adicionaIngrediente ( "Calabresa" );
		p1 . adicionaIngrediente ( "Mucarela" );
		p1 . adicionaIngrediente ( "Milho" );
		
		p2 . adicionaIngrediente ( "Frango" );
		p2 . adicionaIngrediente ( "Catupiry" );
		p2 . adicionaIngrediente ( "Mucarela" );
		p2 . adicionaIngrediente ( "Cebola" );
		p2 . adicionaIngrediente ( "Borda Recheada" );
		p2 . adicionaIngrediente ( "Bacon" );
		
		p3 . adicionaIngrediente ( "Palmito" );
		p3 . adicionaIngrediente ( "Frango" );
		p3 . adicionaIngrediente ( "Cheddar" );
		
		CarrinhoDeCompras  c = new  Adicionais ();
		
		// Adiciona essas Pizzas em um CarrinhoDeCompra
		c . addPizza ( p1 );
		c . adicionarPizza ( p2 );
		c . addPizza ( p3 );
	
		// Imprime o total do CarrinhoDeCompra
		Sistema . fora . println ( "Total de pizzas no carrinho: " + c . totalPizzas ());
		Sistema . fora . println ( "Valor total da compra: " + c . getPrecoTotal ());
		
		// Imprime a quantidade utilizada de cada ingrediente
		Sistema . fora . println ( "Lista de ingredientes utilizados: \n" + Pizza . getListaIngredientes ());
		

		
	}

}