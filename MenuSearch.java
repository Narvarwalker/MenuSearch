// Chapter 9 exercise pages 443 - 445

import java.util.*;
import javax.swing.*;
import java.awt.*;

public class MenuSearch
{
	public static void main(String[] args)
	{
		String[] menuChoices = new String[10];
		String entry = "", menuString = "";
		int x = 0;
		int numEntered;
		int highestSub = menuChoices.length - 1;
		Arrays.fill(menuChoices, "zzzzzz");
		menuChoices[x] = JOptionPane.showInputDialog(null, "Enter an item for Today's menu, or zzz to quit");
		while(!menuChoices[x].equals("zzz") && x < highestSub)
		{
			menuString = menuString + menuChoices[x] + "\n";
		
		++x;
		if(x < highestSub)
			menuChoices[x] = JOptionPane.showInputDialog(null,"Today's menu is:\n" + menuString + "Please make a selection:");
	}

	numEntered = x;
		Arrays.sort(menuChoices, 0, numEntered);

		x = Arrays.binarySearch(menuChoices, entry);
		if(x >= 0 && x < numEntered)
			JOptionPane.showMessageDialog(null, " Excellent choice");
		else
			JOptionPane.showMessageDialog(null, " Sorry - that item is not on tonight's menu");
	}
}