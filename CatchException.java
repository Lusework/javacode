package com.test.type;

public class CatchException {
	//测试异常的小程序
	
		static void Example(int keg)
		{
			System.out.println("---In KegDepartment"+keg+"---");
			
			try {
				if(keg==10)
				{
					System.out.println("no Exception caught");
					return;
					
				}else if(keg==20)
				{
					int i = 0;
					int j = 8/i;
					
					
				}else if(keg==30)
				{
					int iArray[] = new int[4];
					iArray[10]=3;
				}
			} catch (ArithmeticException e) {
				// TODO Auto-generated catch block
				System.out.println("Catch "+e);
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Catch "+e.getMessage());
			}catch(Exception e)
			{
				System.out.println("will not be Exception");
			}finally {
				System.out.println("in Exception finally");
			}
			
		}
		
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Example(10);
			Example(20);
			Example(30);
			
	}

}
