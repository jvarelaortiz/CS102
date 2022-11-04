import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UniqueWords {

    public static final Logger LOGGER = Logger.getLogger("UniqueWords");

    public Set<String> getUniqueWords(String fileName) 
    {
    	
        Set<String> setOfWords = new HashSet<>();
        
        try (BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) 
        {
        	
            String line;
            
            while ((line = buffer.readLine()) != null) 
            {
            	
                StringTokenizer sToken = new StringTokenizer(line, " ,.;:\"");
                while (sToken.hasMoreTokens()) 
                {
                	
                    setOfWords.add(sToken.nextToken().toLowerCase());
                }
            }
        } catch (IOException e) 
        {
        	
            LOGGER.log(Level.SEVERE, "IOException", e);
        }
        return setOfWords;
    }

    public static void main(String[] args) 
    {
        UniqueWords distinctFileWords = new UniqueWords();
        
        Set<String> wordList = distinctFileWords.getUniqueWords("C:\\Users\\17874\\Desktop\\happy.txt");
        
        for (String words : wordList) 
        {
        	
            System.out.println(words);
        }
    }

}