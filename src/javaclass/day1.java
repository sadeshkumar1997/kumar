package javaclass;

public class day1 {
	public void freshId(int id) {
		System.out.println(id);
	}
		
		public void freshId(String name){
			System.out.println(name);
		}
		
		public void freshId(String name,int id){
			System.out.println("String name-" + name+"      "+"studentid--"+ id );
		}
					
		public void freshId(int id, String name){
			System.out.println(id+name );
		}
			
			public void freshId(long contact) {
				System.out.println(contact);
			}

	


		public static void main(String[]args) {
			day1 h =  new day1();
			h.freshId(123);
			h.freshId("hi");
			h.freshId(1234567891);
			h.freshId("sadesh", 12345);
			h.freshId(12345,"sadesh");
		}
}