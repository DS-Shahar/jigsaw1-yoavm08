package abc;



public class main {

	

	public static Node<Integer> exe1 (Node  header)

	{

		Node <Integer> Ln = header;

		Node <Integer> Lm = header;

	

		int x;

		

		while(Lm.hasNext())

		{

			x = Lm.getValue();

			while (Ln.hasNext())

			{

				if (x == Ln.getNext().getValue())

				{

					Ln.setNext(Ln.getNext().getNext());

				}

				Ln = Ln.getNext();

				

			}

			Ln = Lm;

			Lm = Lm.getNext();

			

		}

		

		return header;

		

	}

	

	public static Node <Integer> exe2 (Node<Integer> L1)

	{

		

		Node <Integer> n = new Node <> (L1.getNext().getValue()) ;

		Node <Integer> a;

		Node <Integer> p = n;

		int counter=2;

		while (L1.hasNext())

		{

			a = L1 ;

			if (counter%2==0) {

				n.setNext(a);

			}

			counter++;

			L1 = L1.getNext();

		}

		 

		//if(L1.getValue()!=null) {

		//	n.setNext(L1);

		//}



		return p;

	}

	

	



	public static void main(String[] args) {

		Node <Integer> a1 = new Node <>(1);

		Node <Integer> a2 = new Node <>(2);

		Node <Integer> a3 = new Node <>(3);

		Node <Integer> a4 = new Node <>(4);

		Node <Integer> a5 = new Node <>(5);

		Node <Integer> a6 = new Node <>(6);

		//Node <Integer> a7 = new Node <>(7);

		a1.setNext(a2);

		a2.setNext(a3);

		a3.setNext(a4);

		a4.setNext(a5);

		a5.setNext(a6);

		//a6.setNext(a7);

		System.out.println(exe1(a1));

		System.out.println(exe2(a1));

		



	}



}
