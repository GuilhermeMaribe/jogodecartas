


public class ListaEncadeada<T> {
	private ListaNo<T> head;
	private ListaNo<T> tail;
	
	private static class ListaNo<T> {
		private T dado;
		private ListaNo<T> proximo;
		private ListaNo<T> anterior;
		
		public ListaNo(T dado, ListaNo<T> anterior, ListaNo<T> proximo) {
			this.dado = dado;
			this.proximo = proximo;
			this.anterior = anterior;
		}
		
	}
			
	public void append(T dado)	{
		ListaNo<T> novo = new ListaNo<>(dado, tail, null);
		
		if (tail != null) {
			tail.proximo = novo;
		}
		else {
			head = novo;
		}
		tail = novo;
	}
	
	public void addFirst(T dado)	{
		 ListaNo<T> novo = new ListaNo<>(dado, null, head);
		   head = novo;
		    
		    if(head != null){
	          head.anterior = novo;
		    }
		    else {
		    	tail = novo;
		    }
		  }
	
	
	}
	
}
	
	public static ListaEncadeada<model.carta>() {
		
	
		while (sc.hasNext()) {
			carta cartas = new carta(null, null);
			cartas.carta();
			
			cartas.append(carta);
		}

		
		
		return cartas;
	}
	
}