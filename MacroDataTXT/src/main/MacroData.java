// 1. 全是字母
// 2. 全是数字
// 3. 字母与数字结合
// 4. ASCLL码字符 32-126 ((0-94)+32)
// 5. 英文单词
// 文件、数据总行数，每行数据最少列，每行数据最多列， 
// 当每行数据最少列和最高列相等时，即为固定列数的随机序列

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
		File f = new File("Test.txt");
		if(f.exists())
		{
			f.delete();
			f.createNewFile();
			System.out.println("Success!");
			//RandomLetter(DATA_TOTAL_ROWS, f);
			//RandomLetterAndNumbers(DATA_TOTAL_ROWS, f);
			//RandomNumbers(DATA_TOTAL_ROWS, f);
			RandomASCIIs(DATA_TOTAL_ROWS, f);
			System.out.println("Done!");
		}
		else
		{
			f.createNewFile();
			System.out.println("Success2!");
			//RandomLetter(DATA_TOTAL_ROWS, f);
			//RandomLetterAndNumbers(DATA_TOTAL_ROWS, f);			
			//RandomNumbers(DATA_TOTAL_ROWS, f);
			RandomASCIIs(DATA_TOTAL_ROWS, f);
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
			Letters = ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghigklmnopqrstuvwxyz".toCharArray());
			char[] NumbersAndLetters = new char[Numbers.length + Letters.length];
			System.arraycopy(Letters, 0, NumbersAndLetters, 0, Letters.length);
			System.arraycopy(Numbers, 0, NumbersAndLetters, Letters.length, Numbers.length);
			Random randomLetter = new Random();

			
			//先清空
			
			//
			for(int i = 0; i < DATA_TOTAL_ROWS; i++)
			{
				int temp = randomData.nextInt(DATA_LENGTH_PER_ROW - 1) + 1;
				char[] tempChar = new char[DATA_LENGTH_PER_ROW];
				for(int j = 0; j < temp; j++)
				{
					tempChar[j] = NumbersAndLetters[randomLetter.nextInt(NumbersAndLetters.length)];
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

	public static void RandomNumbers(long fileRows, File file)
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

	public static void RandomASCIIs(long fileRows, File file)
	{
		try
		{
			FileWriter fileWriter = new FileWriter(file, true);
			BufferedWriter writer = new BufferedWriter(fileWriter);
			Random randomData = new Random();
			Random randomAscii = new Random();
			
			
			for(int i = 0; i < DATA_TOTAL_ROWS; i++)
			{
				int temp = randomData.nextInt(DATA_LENGTH_PER_ROW - 1) + 1;
				char [] tempChar = new char[DATA_LENGTH_PER_ROW];
				for(int j = 0; j < temp; j++)
				{
					tempChar[j] = (char)(randomAscii.nextInt(95) + 32);
				}
				writer.write(tempChar);
				writer.newLine();
			}
			writer.close();
			fileWriter.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
