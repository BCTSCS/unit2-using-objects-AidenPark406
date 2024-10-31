import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WordGames here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordGames extends Actor
{
    /**
     * Act - do whatever the WordGames wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        private String word;
        GreenfootImage img;
    

    public WordGames(String text) {

        word = text;
        img = new GreenfootImage(word, 24, Color.BLUE, Color.WHITE);
        setImage(img);
     }
    
    public String scramble()
    {
        int full = word.length();
        int half = word.length()/2;
        String newWord = word.substring(half) + word.substring(0,half);
        return newWord;
    }
    
    public String bananaSplit(int insertIdx, String insertText)
    {
        // Insert insertText at the position
        // insertIdx
       
       String newWord = word.substring(0,insertIdx) + insertText+ word.substring(insertIdx);
       return newWord;
       
    }
    
    public String bananaSplit(String insertChar, String insertText)
    {
        int first = word.indexOf(insertChar);
        String newWord = word.substring(0,first) + insertText+ word.substring(first);
        return newWord;
        
    }
    
    public String toString()
    {
        // Games[word]
        
        return "[" + word + "]";
        
    }

    public void act() {
        WordGames word = new WordGames("BergenTech");
        System.out.println(word.scramble());
        System.out.println(word.bananaSplit(5,"bruh"));        
        System.out.println(word.bananaSplit("T","bruh"));

    }
}
