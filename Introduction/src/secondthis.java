public class secondthis {
	public secondthis(){
		this(4,5,6);
		System.out.println("default ");
	}
	public secondthis(int a){
		this(2,4);
		System.out.println("one parametrized ");
	}
	public secondthis(int a, int b){
		this(4,5,6,7);
		System.out.println("two parametrized ");
	}
	public secondthis(int a, int b, int c){
		
		System.out.println("three parametrized ");
	}
	public secondthis(int a, int b, int c, int d){
		this();
		System.out.println("four parametrized ");
	}

		public static void main(String[] args) {
			secondthis s = new secondthis(2);
			}
















}
