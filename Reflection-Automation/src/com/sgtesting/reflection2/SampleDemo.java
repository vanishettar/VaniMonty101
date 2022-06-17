package com.sgtesting.reflection2;

import java.lang.reflect.Method;

import com.sgtesting.reflection1.Sample;

public class SampleDemo {
	public static void main(String[] args) {
		
		Sample obj=new Sample();
		try
		{
			Method m[] =obj.getClass().getMethods();
			for(int i=0;i<m.length;i++)
			{
				String methodname=m[i].getName();
				System.out.println(methodname);
				if(methodname.startsWith("display"))
				{
					m[i].invoke(obj);
				}	
			}
		}catch(Exception e)
		{
			e.printStackTrace();;
		}

	}

}
