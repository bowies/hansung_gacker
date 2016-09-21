package com.example.touchminigame.framework;

import java.util.Random;

public class RandomNumber {

	public int nNumber1 = 0;
	public int nArrNumber[];
	
	public int makeNumber(int Max) //Max값 보다 작은 랜덤변수 생성
	{
		return nNumber1 = (int)Math.round(Max * Math.random());
	}
	
	public void MakeNumber2(int Max) // Max 갯수 만큼 중복되지 않는 랜덤변수 생성
	{
		nArrNumber = new int[Max];
		boolean bFound = false;
		Random rand = new Random();
		
		for(int i = 0; i < nArrNumber.length; ++i)
		{
			while(true)
			{
				nArrNumber[i] = rand.nextInt();
				bFound = false;
				for(int j = 0; j < i; ++j)
				{
					if(nArrNumber[j] == nArrNumber[i])
					{
						bFound = true;
						break;
					}
				}
				if(!bFound)
					break;
			}
		}
	}
}
