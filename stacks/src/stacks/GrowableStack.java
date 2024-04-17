package stacks;

public class GrowableStack extends FixedStack {
	Customer[] stack = new Customer[size];


	@Override
	public void push() {
		if(count==(size-1))
		{
			resize();
			Customer[] temp = new Customer[size];
			for(int i=0; i<stack.length;i++) {
				temp[i] = stack[i];
			}
			stack = temp;
		}
		stack[count] = new Customer(sc.nextInt(),sc.next(),sc.next());
		count++;
		
		
	}
	
	public void resize() {
		size = size*2;
	}
	

}
