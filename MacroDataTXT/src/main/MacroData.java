package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class MacroData 
{
	private static final long DATA_TOTAL_ROWS = 10000;
	private static final int DATA_LENGTH_PER_ROW = 100;
	private static char[] Letters = null;
	private static char[] Numbers = null;
	
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		// 1. 全是字母
		// 2. 全是数字
		// 3. 字母与数字结合
		// 4. ASCLL码字符
		File f = new File("Test.txt");
		if(f.exists())
		{
			f.delete();
			f.createNewFile();
			System.out.println("Success!");
			//RandomLetter(DATA_TOTAL_ROWS, f);
			RandomLetterAndNumbers(DATA_TOTAL_ROWS, f);
			System.out.println("Done!");
		}
		else
		{
			f.createNewFile();
			System.out.println("Success2!");
			//RandomLetter(DATA_TOTAL_ROWS, f);
			RandomLetterAndNumbers(DATA_TOTAL_ROWS, f);			
			System.out.println("Done2!");
		}
		
		
	}
	
	public static void RandomLetter(long fileRows, File file)
	{
		try 
		{
			FileWriter fileWriter = new FileWriter(file, true);
			BufferedWriter writer = new BufferedWriter(fileWriter);
			Random randomData = new Random();
			Letters = ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghigklmnopqrstuvwxyz".toCharArray());
			Random randomLetter = new Random();

			
			//先清空
			
			//
			for(int i = 0; i < DATA_TOTAL_ROWS; i++)
			{
				int temp = randomData.nextInt(DATA_LENGTH_PER_ROW - 1) + 1;
				char[] tempChar = new char[DATA_LENGTH_PER_ROW];
				for(int j = 0; j < temp; j++)
				{
					tempChar[j] = Letters[randomLetter.nextInt(Letters.length)];
				}
				writer.write(tempChar);
				writer.newLine();
			}
			writer.close();
			fileWriter.close();
		
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void RandomLetterAndNumbers(long fileRows, File file)
	{
		try
		{
			FileWriter fileWriter = new FileWriter(file, true);
			BufferedWriter writer = new BufferedWriter(fileWriter);
			Random randomData = new Random();
			Numbers = ("1234567890".toCharArray());
			Random randomLetter = new Random();

			
			//先清空
			
			//
			for(int i = 0; i < DATA_TOTAL_ROWS; i++)
			{
				int temp = randomData.nextInt(DATA_LENGTH_PER_ROW - 1) + 1;
				char[] tempChar = new char[DATA_LENGTH_PER_ROW];
				for(int j = 0; j < temp; j++)
				{
					tempChar[j] = Numbers[randomLetter.nextInt(Numbers.length)];
				}
				writer.write(tempChar);
				writer.newLine();
			}
			writer.close();
			fileWriter.close();
					
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
