class ConcatTest
{
	public static void main(String [] args)
	{
		long starttime = System.currentTimeMillis();
		
		StringBuffer sb = new StringBuffer("JAVA");
		for(int i = 0 ; i < 20000 ; i++)
		{
			sb.append("GOPAL");
		}
		System.out.println("TIME TAKEN BY BUFFER : " + (System.currentTimeMillis() - starttime + "ms"));
        System.out.println(sb);

		
		starttime = System.currentTimeMillis();

		StringBuilder sbd = new StringBuilder("java");
		for(int i = 0 ; i < 20000 ; i++)
		{
			sbd.append("GOPAL");
		}
		System.out.println("TIME TAKEN BY BUILDER : " + (System.currentTimeMillis() - starttime + "ms"));
	}
}