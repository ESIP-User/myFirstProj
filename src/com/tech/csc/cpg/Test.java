package com.tech.csc.cpg;
	
	class Test {
		
		int cal(int a, int b){
			return(a>b? a: b);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test b1= new Test();
		
		
		System.out.print(b1.cal(b1.cal(b1.cal(23,-32),23), 8));
	
	}

}
